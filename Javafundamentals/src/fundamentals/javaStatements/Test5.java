package fundamentals.javaStatements;

public class Test5 {

	public static void main(String[] args) {
		
		//while loop
		
//		int i=0;
//		while(i<10) {     // in while condition exp is mandatatory
//			System.out.println(i);
//			i++;
//		}
		

//		int i=0;
//		while(true) {     //--------->create infinae loop
//			System.out.println(i);
//			i++;
//			
//		}
		
//		int i=0;
//		while(false) {         //--------> unreachable code
//			System.out.println(i);
//			i++;
//			
//		}
	//==============================
		
		// do while
//		int i=0;
//		do {
//			System.out.println("before  while condition");
//			i++;
//		}while(i<10);   //------->conditional exp is mandatatory..
//		
		int i=0;
		System.out.println("before loop");
		do {
			System.out.println("inside the  loop");
			i++;
		}while(false);            //----------------> if you provide true value in the conditional exp ,then compiler raise an error like  unreachable 
		System.out.println(" after while condtion");
		
		
		//factorial number
		
//		int num=12;
//		int result=1;
//		
//		while(num>=1) {
//			result=result*num;
//			num--;
//		}
//		System.out.println("12 factorial  value =   "+result);
//		=======================================
		
		
		//forward and backward digit
		
//		int num=199;
//		String fnum="";
//		String bnum="";
//		int digit=0;
//		while(num!=0) {
//			digit=num%10;
//			fnum=digit+" "+fnum;
//			bnum=bnum+" "+digit;
//			num=num/10;
//		}
//		System.out.println("forward digit number :"+fnum);
//		System.out.println("backward digit number :"+bnum);
	//=========================================
		
		//sum and multiplication of a  number
		
//		int num=145;
//		int  addval=0;
//		int  mulval=1;
//		int digit=0;
//		while(num!=0) {
//			digit=num%10;
//			addval=addval+digit;
//		   mulval=mulval*digit;
//			num=num/10;
//		}
//		System.out.println("sum of digits :"+addval);
//		System.out.println("multiplication of digit  :"+mulval);
//	==========================================	
		
		//palindrome number(revesed)
		int num=434;
		String fnum=""+num;
		StringBuffer sb= new StringBuffer(fnum);
		sb.reverse();
		String reversenum=sb.toString();
		
		if(fnum.equals(reversenum )) {
			System.out.println(num+" is a  Palindrome number");
		}else {
			System.out.println(num+" is not a palindrome number");
		}
		
		
	}

}
