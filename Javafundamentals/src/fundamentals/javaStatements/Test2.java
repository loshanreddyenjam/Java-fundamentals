package fundamentals.javaStatements;

public class Test2 {

	public static void main(String[] args) {
		
		//check given number is even or odd
		//=========================
		
//		  int num=5010;
//		   if(num%2==0) { 
//		 System.out.println(num+" IS EVEN NUMBER"); 
//		 }else { 
//	        System.out.println(num+" IS ODD NUMBER"); 
//		 	}	
		
		
		//print all even and odd numbers upto 100
		//===============================
		
//		for(int i=1; i<=100;i++) {
//			
//			if(i%2==0) {
//				System.out.println(i+" IS EVEN NUMBER");
//			}else {
//				System.out.println(i+"IS ODD NUMBER");
//			}
//		}
		
		
		//check a given number is prime or not
		//==========================
		
//		int num=13;
//		int count=0;
//		
//		for(int i=1;i<=num;i++) {
//			if(num%i==0) {
//				count =count+1;
//				
//			}
//		}
//			if(count==2) {
//				System.out.println(num+" IS A PRIME NUMBER");
//			}else {
//				System.out.println(num+" IS NOT A PRIME NUMBER");
//			}
//			
//		
		
		//check  prime number upto 100
	//=======================
		for(int num=1; num<100;num++) {
			int count=0;
		for(int i=1;i<=num;i++) {
		if(num%i==0) {
			count =count+1;			
		}
	}
		
		if(count==2) {
			System.out.println(num+" IS A PRIME NUMBER");
		}else {
				System.out.println(num+" IS NOT A PRIME NUMBER");
		}
		
		}
	

	}
}
