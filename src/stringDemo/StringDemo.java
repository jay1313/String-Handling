package stringDemo;

public class StringDemo {
	
	
	public static void main(String[] args) {
		
		String s = new String("localhost//3306/:index.php");
		String s1 = new String("jaypatel0513@gmail.com");
		StringBuffer s3 = new StringBuffer("Jay");
		int i = 13;
		String str = "java";
		String str1 = "language";
		String str2 = "LanGUAGE";
		
		
		String j = "aa";
		String k = "cc";
		
		String Strr = new String("Welcome to to java world");
		String SubStr1 = new String("to" );
		String Str = new String("Welcome-to-to-java-world");
		
		String h = " ";
		
		
		System.out.println("intern : " + str1.intern());
		
		System.out.println("endwith : " + str1.endsWith("e"));
		
		System.out.println("toString concate of :" + str.toString() + str1);
		
		System.out.println("value of  :" + String.valueOf(i));
		
		System.out.println("lowercase :" + str2.toLowerCase());
		
		System.out.print("Return Value :" );
	      System.out.println(Strr.toCharArray() );
		
		
		System.out.println("SubString is :: " + Strr.substring(3));

		System.out.println("Subsequence is :: " + Strr.subSequence(0,10));
		
		System.out.print("split result . is :: ");
		 for (String object: Str.split("-")) {
			 System.out.println(object);
	      }
		
		
		System.out.println("lastindexof . is :: " + Strr.lastIndexOf( SubStr1 ));
		
		System.out.println("lastindexof . is :: " + s.lastIndexOf('3',2));
		
		
		int result = str1.compareToIgnoreCase(str2);
		
		System.out.println("lexicographically :" + result);
		
		
		String s4 = s3.append(i).toString();

		System.out.println("Length is :: " + s.length());
		
		System.out.println("indexof . is :: " + str.indexOf( 'v' ));
		
		System.out.println("substring from . is :: " + s.substring(22));
		
		System.out.println("substring from : is :: " + s.substring(s.lastIndexOf('/')));
		
		System.out.println("substring from s is :: " + s.contains("@" + "."));
		
		System.out.println("substring from s1 is :: " + s1.contains("@") + s1.contains("."));
		
		
		
		if (s.contains("@gmail.com") || s.contains("@yahoo.com")) {
			System.out.println("valid");
			
		}
		else {
			System.out.println("you can use only Gmail or Yahoo id");
		}
	
		
		System.out.println("substring from a...t is :: " + s.substring(s.indexOf('a'), s.indexOf('t')+1));
		
		
		System.out.println("append String is :: " + s3.append(" Patel") + " Email is " + s1 + i);

		
		System.out.println("Append to string is :: " + s4);
		
		System.out.println("replace string is :: " + str.replace('a', 'A'));
		
		System.out.println("replaceAll string is :: " + str.replaceAll(str, s1));
		
		
		System.out.println("After replaceAll string is :: " + str);
		
		System.out.println("concat string is  : " + str.concat(str1));
		
		System.out.println("concat string is  : " + str.concat(str1));
		
		System.out.println("endwith string is  : " + str.endsWith("va"));
		
		System.out.println("equals string is  : " + str.equals(str1));
		
		System.out.println("hashcode string is  : " + str.hashCode());
		
		
		System.out.println("intern string is  : " + str.intern());
		
		System.out.println("lastindexof . is :: " + str.lastIndexOf('a'));
		
		
		System.out.println("lastindexof . is :: " + str1.lastIndexOf('a',2));
		
		
		
		
		
		
	}
}
