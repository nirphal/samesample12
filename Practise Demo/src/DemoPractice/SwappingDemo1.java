package DemoPractice;

public class SwappingDemo1 {

	public static void main(String[] args) {

		int a=10;
		int b=20;
		
		System.out.println("before swpie--"   +a+" "+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("after swipe--"  +a+" "+b);

	}

}
