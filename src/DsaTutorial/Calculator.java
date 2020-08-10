package DsaTutorial;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter First number");
		int a= sc.nextInt();
		
		System.out.println("ENter second number");
		int b= sc.nextInt();
		
		System.out.println("Enter the opration ");
		sc.nextLine();
		char operation= sc.nextLine().charAt(0);
		
		
		int result = 0;
		switch(operation) {
		case '+':
			result=a+b;
			break;
			
		case '-':
			result=a-b;
			break;
			
		case '*':
			result=a*b;
			break;
			
		case '/':
			result=a/b;
			break;
			
			
		default:
			System.out.println("invalid operation" );
		
		}
		System.out.println("The result is " + result);


	}

}
