package DsaTutorial;

public class NestedIfelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 12 ,b =81, c=10;
		int result=0;
		 if(a>b) {
			 if(a>c) {
				 result=a;
			 }else {
				  result =c;
			 }
		 }else {
			 if(b>c) {
				 result=b;
			 }else {
				 result =c;
			 }
		 }
		 
		 System.out.println("Largest of the three number is "+ result);
		 
		 
		 System.out.println(" ######  ternary method ##########");
		 
		 result = a>b?a>c? a:c:b>c? b:c;
		 
		 System.out.println("Largest of the three number is "+ result);

	}

}
