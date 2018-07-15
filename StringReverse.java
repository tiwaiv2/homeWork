

import java.util.regex.Pattern;

public class StringReverse {
		public static void main(String[] args) {
			System.out.println("Hello World");
			String s1= "Hi This   Is     Vivek";
			String s2[]= s1.split("\\s+");//Pattern.compile("\\s").split(s1);
//			for(int i = s2.length-1; i>=0; i--){
//				System.out.print(s2[i]);
//			}
			
			System.out.println(s1.indexOf(s2[2]));
			StringReverse obj = new StringReverse();
			obj.test(null);
		}
		
		public void test(Object o){
			System.out.println("From Test(Object)");
		}
		
		public void test(String s){
			System.out.println("From Test(String)");
		}
	}

