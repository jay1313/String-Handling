package stringDemo;

public class StringImplOne {

	public static void main(String[] args) {
		
		
		String s = "[java,string]";
		
		System.out.println("string is :" + s);
		
		
		String r = s.replace("[","").replace("]","");
		
		System.out.print("Result :");
		for (String object: r.split(",")) {
			 System.out.println(object);
		}
		
		
		
		
		
		String j = "Hi";
		String s1 = "Jay";
		String s2 = "Patel";
		j =  s1 + " " + s2;
		System.out.println("J1 is :  " + j);
		
		j = s1.concat(s2);
		System.out.println("J2 is :  " + j);
		
		j = "hi" + " " + s1 + s2;
		System.out.println("J3 is :  " + j);
		
		String d = j.concat(" HELLO");
		System.out.println("d is :  " + d);
		
		
		int i = s2.charAt(2);
		System.out.println(" i : " +i);
		
		char i1 = s2.charAt(2);
		System.out.println(" i1 : " +i1);
		
		
		char arr[] = {'h','e','l','l','o','.'};
		String array = new String(arr);
		System.out.println("array to String : " +array);
		
		
		
		
	
	}
}
