package stringDemo;

import java.util.ArrayList;
import java.util.List;

public class StringImplTwo {
	
	public static void main(String[] args) {
	
	String s = "	apache:8080/SAPEx/view.jsp&cmdAction=getMenu	";
	
	
	
	String s1= s.trim();	
//	System.out.println("trim :   " + s1);
	
	
	
	List l = new ArrayList();
	
//	System.out.print("split 1 : ");
	for(String s2: s1.split(":",2)){
		System.out.println(s2);
		
		l.add(s2);
	}
	
//	System.out.println("list is :" +l);
//	System.out.println("your server name is :" +l.get(0));
	
	
	
	
	String s3 = (String) l.get(1);
//	System.out.println("String after localhost : " + s3);
	
	List l1 = new ArrayList();
	
//	System.out.print("split 2 : ");
	for(String s4: s3.split("/",2)){
//		System.out.println(s4);
		
		l1.add(s4);
	}
	
//	System.out.println("list1 is :" +l1);
//	System.out.println("your port name is :" +l1.get(0));
	
	
	
	String s5 = (String) l1.get(1);
//	System.out.println("String after port no :" +s5);
	List l2 = new ArrayList();
//	System.out.print("split 3 : ");
	for(String s6: s5.split("/",2)){
//		System.out.println(s6);
		
		l2.add(s6);
	}
	
	String s7 = (String) l2.get(1);
//	System.out.println("String after 2 / :" +s7);
	List l3 = new ArrayList();
//	System.out.print("split 4 : ");
	for(String s8: s7.split("&",2)){
//		System.out.println(s8);
		
		l3.add(s8);
	}
	String page = (String) l3.get(0);
	
	
	
	
	String s9 = (String) l3.get(1);
//	System.out.println("String after 2 / :" +s9);
	List l4 = new ArrayList();
//	System.out.print("split 4 : ");
	for(String s10: s9.split("=")){
//		System.out.println(s10);
		
		l4.add(s10);
	}
	String method = (String) l4.get(1);
	
	
	
	
	
	
	
	
	
	
	System.out.println("your server name is :" +l.get(0));
	System.out.println("your port name is :" +l1.get(0));
	System.out.println("your page name is :" + page);
	System.out.println("your method name is :" + method);
	
	}
}
