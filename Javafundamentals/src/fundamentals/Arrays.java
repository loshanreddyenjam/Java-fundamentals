package fundamentals;

public class Arrays {

	public static void main(String[] args) {
//		//	int [ ] a= {10,20,30,40,50};   //------>declare and initialize in single statement
//		int [] a=new int[5];       //------->declare then initialize
//		a[0]=10;
//		a[1]=20;
//		a[2]=30;
//		a[3]=40;
//		a[4]=50;
//		
//		System.out.println(a);
//		System.out.println(a.length);
//		System.out.println(a[0]);
//		System.out.println(a[1]);
//		System.out.println(a[2]);
//		System.out.println(a[3]);
//		System.out.println(a[4]);
////     reading the elements by using for loop
//		for(int i=0;i<a.length;i++) {
//			System.out.println(a[i]);
//			
//			
//			System.out.println();
////			reading the elements by using foreach loop
//			for(int element: a) {
//				System.out.println(element);
//			}
//		}
//		
//		
		// two daimentional array
		// =======================

		// int [][] a={ {10,20,30},{20,30,40},{30,40,50}};
		int[][] a = new int[3][3];
		System.out.println(a);
		System.out.println(a.length);
		System.out.println(a[0][0]);
		System.out.println(a[0][1]);
		System.out.println(a[0][2]);
		System.out.println(a[1][0]);
		System.out.println(a[1][1]);
		System.out.println(a[2][0]);
		System.out.println(a[2][1]);
		System.out.println(a[2][1]);
		a[0][0] = 10;
		a[0][1] = 20;
		a[0][2] = 30;
		a[1][0] = 20;
		a[1][1] = 30;
		a[1][2] = 40;
		a[2][0] = 30;
		a[2][1] = 40;
		a[2][2] = 50;

		System.out.println();
		System.out.println();

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {

				System.out.print(a[i][j] + " ");
			}
			System.out.println();

		}
		System.out.println();

		for (int[] rows : a) {
			for (int cols : rows) {
				System.out.print(cols + "  ");

			}
			System.out.println();

		}

	}

}
