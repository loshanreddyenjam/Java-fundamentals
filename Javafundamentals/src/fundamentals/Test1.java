package fundamentals;


class Topic1{
	
	//identifiers Rules
	
	
	int a=10;// valid
	String empno="111";///valid
	String _empname="prabhas";// valid
	String $empsal="50000";// valid
	String system="name";//valid

	
//	String s id="222";     --->invalid
//	String S+name="salaar";  --->invalid
//String @sname="reddy";	 --->invalid
//int float=300;	       ---------->invalid
}
	
	
//	localscope and classlevelscopes
	
	class Topic2{
		
		int x=10; //classlevel variable
		void m1() {
			int y=20;//local variable to m1()
			System.out.println(x+ "   class level varible value");
			System.out.println(y+   "   local variable value");
		}
		void m2() {
			int z=30;//local variable to m2()
			System.out.println(x+"  class level varible value");//--->classlevel variables available upto respective class..
		//	System.out.println(y+"local variable value");    --->local variables  available upto respective method only..
			System.out.println(z+"  local variable  value of m2()");
		}
		
		
		
	}
	
	//literals(constants)
	class Topic3{
		//integer literals
		byte b=10;
		short s=20;
		int i=30;
		long l=3030003L;
//floating literals
		float f=23.44f;
		double d=3333.3333d;
		
		//character literals
		char c='R';
		
		//boolean literals
		boolean b1=true;
		boolean b2=false;
		
		
		//string literals
		String s1="loshan reddy";
		String s2=" enjam 'loshan' reddy";//single quotation  is directly possible inside the string 
		String s3="enjam \"loshan\" reddy";//double quotation inside the string
		
}
	
	
public class Test1 {

	public static void main(String[] args) {
		Topic2 t2= new Topic2();
		t2.m1();
		t2.m2();
		System.out.println();
		
		Topic3 t3=new Topic3();
		System.out.println(t3.b);
		System.out.println(t3.s);
		System.out.println(t3.i);
		System.out.println(t3.l);
		System.out.println(t3.f);
		System.out.println(t3.d);
		System.out.println(t3.c);
		System.out.println(t3.b1);
		System.out.println(t3.b2);
		System.out.println(t3.s1);
		System.out.println(t3.s2);
		System.out.println(t3.s3);
	
	}

}
