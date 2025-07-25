package fundamentals;

public class ImplicetTypeCasting {

	public static void main(String[] args) {
		
		byte b=30;
		int i=b;   //-------->converting lower data type to higher data type
		System.out.println(b+"    "+i);
		
		System.out.println();
		
		short s=20;
		int i1=s;
		System.out.println(s+"    "+i1);
		
		System.out.println();
		
		byte b1=20;
		byte b2=30;
		int i2=b1+b2;
		System.out.println(i2);
		
		System.out.println();
		
		
		byte b11=120;
		byte b12=30;
		int i3=b11+b12;
		System.out.println(i3);
		
		System.out.println();
		
		
		int i4=25;
		long l=i4;
		System.out.println(i4+"   "+l);
		
		System.out.println();
		
		long l2=33345l;
		float f=l2;
		System.out.println(l2+"   "+f);
		
		System.out.println();
		
		float f1=2223.4f;
		double d=f1;
		System.out.println(f1+"   "+d);
		
		
		
	}

}
