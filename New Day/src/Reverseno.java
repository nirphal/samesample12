
public class Reverseno
{

	public static void main(String[] args) {
		
		int a=20;
		int b=10;
		
		System.out.println("before replacing output will be"+a+" "+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("after replacing output will be"+a+" "+b);
	}

}
