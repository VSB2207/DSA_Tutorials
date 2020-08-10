package DsaTutorial;

public class IfClass {

	public static void main(String[] args) {
		
		int age= 18;
		
		if(age>=18) {
			System.out.println("you can vote now");
			
		}
		else{
			System.out.println("you cannot vote");
		}
		
		
		
		
		
		System.out.println("Ternary operator");
		
		
		int a= 15;
		int b =8;
		int max =0;
		
		max= a >b ? a : b;
		
		System.out.println("max of both number is" + max);

	}

}
