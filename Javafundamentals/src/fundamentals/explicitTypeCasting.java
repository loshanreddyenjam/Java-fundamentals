package fundamentals;

public class explicitTypeCasting {

	public static void main(String[] args) {
		
		int i =10;
		byte b= ( byte)i;   //----------> converting higher datatype to lower datatype( using cast operater)   
		System.out.println(i+"    "+b);
		System.out.println();
		
		int i2=20;
	//	short s=( byte) i2;
		short s=( short) i2;
		System.out.println(i2+"   "+s);
		
		System.out.println();
		
		long l=143143l;
		//int i3= ( int)  l;
	//	int i3= ( byte)  l;
		int i3= ( short)  l;
		System.out.println(l+"     "+i3);
		
		System.out.println();
		
		byte b1=10;
		byte b2=30;
		int i4=b1+b2;   //---------->x+y=z(x,y values may int,byte,short, but z must be int)
		System.out.println(i4);
		 
		System.out.println();
		
		byte b3=40;
		int i5=50;
		int i6=b3+i5;
		System.out.println(i6);
		
		System.out.println();
		
		
		
		int i7=30;
		float f=40.3f;
		float f1=i7+f;     //------> x+y=z(x,y values may be long,float,double but z must be higher than the (x,y))..
		System.out.println(f1);
		
		
		System.out.println();
		
		float f2=222.23f;
		double d=3333.333d;
		double d1=f2+d;
		System.out.println(d1);
		
	}

}
