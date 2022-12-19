package reserve_string;

public class Reserve_str {
	public static void main(String[] args) {
		
		String a = "ABCDE";
		String rev = "";
		
		// a.length();   //5  A=1,B=2,C=3,D=4,E=5
		
		//a.charAt(0);       //A=0,B=1,C=2,D=3,E=4
		
		
		for(int i=4;i>=0;i--)  //4
		{
			rev = rev+a.charAt(i);      //rev of 4 is E=4 
			
		}
		
		System.out.println("reserve string is:"+ rev);
		
		
		StringBuffer st = new StringBuffer(a);
		System.out.println(st.reverse());
		
	}

}
