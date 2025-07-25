package fundamentals.javaStatements;

public class Test4 {

	public static void main(String[] args) {
		
		//FOR LOOP
	
//		for(int i=0; i<10; i++) {
//			System.out.println("This is for loop");
//			
//		}
		
		
//		int i=0;
//		for( ;i<10;i++) {            //---->expression1 is optional
//			System.out.println("welcome to forloop");
//			
//		}
		
		
//		int i=0;
//		for(System.out.println("hai hello") ;i<10;i++) {            //---->  possible to provide any statement in place of expression1 
//			System.out.println("welcome to forloop");
//			
//		}
//		
		

	//	for(int i=0,float f=0.0f ;i<10&&f<10;i++,f++) {            //---->it is not possible
	                                                                     	//--->only one declarative statement possible in exp1
		//	System.out.println(i+"  "+f);
			
	//	}
		
	
//		for(int i=0,j=0 ;i<10&&j<10;i++,j++) {            //---->this is possible 
//			System.out.println(i+"    "+j);
//			
//		}
//		
		
//	for(int i=0; ;i++ ) {    //----->exp2is also optional  but only provide boolean statements(true,false)in place of exp2
//		System.out.println(i);
//		
//	}

		
//		for(int i=0;true ;i++ ) {    
//			System.out.println(i);
//			
//		}
//		
		
//		for(int i=0;false ;i++ ) {    //------->it is a error like unreachble code
//			System.out.println(i);
//			
//		}
		
		
//		for(int i=0;i<10; ) {   //exp3 is optional and provide any statement like Sysout().. in place of exp3
//			System.out.println(i);
//			i++;
//		}
//		
		
		
		//fibinacis series
		
		int fval=0;
		int sval=1;
		
		System.out.print(fval+"   "+sval+"  ");
		
		for(int nval=fval+sval;nval<=100;fval=sval,sval=nval,nval=fval+sval) {
			System.out.print(nval+"   ");
		}
		
		
	}

}
