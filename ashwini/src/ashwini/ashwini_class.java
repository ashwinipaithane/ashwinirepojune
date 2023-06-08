package ashwini;

public class ashwini_class {

	public static void main(String[] args) {
		
		
		String str1="This is Automation";
		String str2="";
		char ch;
		
		int len=str1.length();
		System.out.println(len);
		//code by ashwini
		
		for(int i=str1.length()-1;i>=0;i--)
		{
			ch=str1.charAt(i);
			str2=str2+ch;
			
		}
		System.out.println(str2);
 // (for pull) code change by manager
	}

}
