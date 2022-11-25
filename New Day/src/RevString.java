
public class RevString{

	public static void main(String[] args) {
		
		String s="MADAM";
		
		String rev="";
		
		int l=s.length();
		
		for(int i=l-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		//System.out.println(rev);
		
		if(s.equals(rev))
		{
			System.out.println("number is palindrome" +" "+ s);
		}
		else
		{
		    System.out.println("number is not palindrome"  +s);	
		}

	}

}
