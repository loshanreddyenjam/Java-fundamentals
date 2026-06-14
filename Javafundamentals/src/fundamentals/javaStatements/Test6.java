package fundamentals.javaStatements;

public class Test6 {

	public static void main(String[] args) {

		// break and continue statements

		/* for(int i=0;i<10;i++) { 
			 if(i==6) { 
				 break; 
				 } 
			 System.out.println(i); 
			 }
		 }*/

		 

		/*
		 * for (int i = 0; i < 10; i++) { for (int j = 0; j < 10; j++) { if (j == 5) {
		 * break; } System.out.println(i + "  " + j); } }
		 */

//	label:	for(int i=0;i<10;i++) {         //if we want apply the break statement to outer loop,you can use break label 
//		for(int j=0;j<10;j++) {        
//			if(j==5) {
//					break label;
//			}
//				System.out.println(i+"  "+j);
//		}
//		} 

//		for(int i=0;i<10;i++) {
//			if(i==5) {
//				break;                            //------>if we provide any statement after the break statement ,that is unreacahble..
//				System.out.println("after break statement");
//			}
//		}

		// CONTINUE STATEMENTS

//		for(int i=0;i<10; i++) {
//			if(i==5) {
//				continue;
//			}
//			System.out.println(i);
//		}
//		

//		for(int i=0;i<10; i++) {
//			for(int j=0;j<10;j++) {
//			if(j==5) {
//				continue;
//			}
//			System.out.println(i+" "+j);
//		}
//		}

label:for(int i=0;i<10; i++) {
			for(int j=0;j<10;j++) {
			if(j==5) {
				continue label;
			}
			System.out.println(i+"   "+j);
		}
		}

// for(int i=0;i<10; i++) {
//	for(int j=0;j<10;j++) {
//	if(i==5) {
//		continue ;
//		System.out.println(i+"  "+j); //---->unreachable code
//	}
//
//}
	}

}