package fundamentals;

public class Operaters {

	public static void main(String[] args) {
		//arthamatic operaters
		int a=10;
		int b=20;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		System.out.println();
		
		//assigment operaters
		
		int c=30;
		c+=10;
		System.out.println(c);
		c-=10;
		System.out.println(c);
		c*=10;
		System.out.println(c);
		c/=5;
		System.out.println(c);
		
		System.out.println();
		
		//logical bitwise operaters
		int d=10;
		int e=3;
		System.out.println(d&e);
		System.out.println(d|e);
		System.out.println(d^e);
		System.out.println(d<<e);
		System.out.println(d>>e);
		
		
		System.out.println();
		
		//increment and decrement operaters
		
		int x=20;
		int y=30;
		System.out.println(++x);//pre increment
		System.out.println(x++);//post increment
		System.out.println(--y);//pre decrement
		System.out.println(y--);//post decrement
		
		System.out.println();
		
		System.out.println(++x+--y);
		System.out.println(x+++--y);
		System.out.println(++x+y--);
		System.out.println(x+++y--);
		
		System.out.println();
		
		
		//terinary operaters
		int n1=10;
		int n2=20;
	int result=(n1>n2?n1:n2);
			System.out.println(result+" is biggest number");
	
		
	}

}
