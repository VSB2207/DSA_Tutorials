package DsaTutorial;

import java.util.Scanner;

public class patterns {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.print("enter the number of * you want to print ");
		//int n= sc.nextInt();
		int n=8;
		
		
		System.out.println();
		System.out.println();

		
//                      Pattern 3 

//		* * * *
//		* * * *     n*n
//		* * * *
//		* * * *
		
					for(int i =1 ; i<=n;i++) {
						for(int j=1 ;j<=n ;j++) {
							System.out.print("* ");
						}
						System.out.println();
					}
			
		

		
					System.out.println();
					System.out.println();

		
		
		
//                         Pattern 3 

//		*            1
//		* *          2
//		* * *        3
//		* * * *      4
		
    
		
		
		
				for(int i =1 ; i<=n;i++) {
					for(int j=1 ;j<=i;j++) {
						System.out.print("* ");
					}
					System.out.println();
				}
		
		
				System.out.println();
				System.out.println();

		
//                         Pattern 3 
//				* * * *      1
//				  * * *      2
//				    * *      3
//				      *      4
		
		for(int i =1 ; i<=n ; i++) {
			for(int j=1 ;j<=i-1;j++){
				System.out.print("  ");
			}
			for(int j=1;j<=n-i+1;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		System.out.println();
		System.out.println();

		
//                Pattern 3 
		
		
		
//		* * * *      1   
//		* * *        2  
//		* *          3   
//		*            4 
      for(int i =1 ; i<=n ; i++) {
			for(int j=1 ;j<=n-i+1;j++){
				System.out.print("* ");
			}
			for(int j=1;j<=i-1;j++) {
				System.out.print("  ");
			}
			System.out.println();
		}
		
		
		System.out.println();
		System.out.println();

		
		
//      Pattern 3 



//* * * *      1   
//* * *        2  
//* *          3   
//*            4 
		 for(int i =1 ; i<=n ; i++) {
				for(int j=1 ;j<=n-i+1;j++){
					System.out.print("* ");
				}
				for(int j=1;j<=i-1;j++) {
					System.out.print("  ");
				}
				System.out.println();
			}
			
			
			System.out.println();
			System.out.println();

	}

}
