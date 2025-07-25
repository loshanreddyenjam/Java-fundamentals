package fundamentals.javaStatements;

public class Test1 {

	public static void main(String[] args) {
		
//if  and else statements
		
		int n1=20;
		int n2=20;
		int n3=20;
		
		if(n1>=n2 && n1>n3) {
			System.out.println(n1+"  is BIGGEST NUMBER");
		}else if(n2>=n3 &&n2>n1) {
			System.out.println(n2+" IS BIGGETS NUMBER");
			
		}else if(n3>n1 && n3>n2) {
			System.out.println(n3+" IS BIGGEST NUMBER");
		}else {
			System.out.println(n1+","+n2+","+n3+","+" ARE EQUAL");
		}
		
	}

}
