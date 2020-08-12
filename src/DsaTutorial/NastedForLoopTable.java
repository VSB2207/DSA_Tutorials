package DsaTutorial;

public class NastedForLoopTable {

	public static void main(String[] args) {
		
		int table=2;
		int result=0;

		
			for(table=1;table<=10;table++) {
//				System.out.println(" ");
				for(int i=1;i<=	20;i++) {
					
					result=table*i;
					System.out.print(" "+result);
			}
			
			System.out.println(" ");


		}
	}

}