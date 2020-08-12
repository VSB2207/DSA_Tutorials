package DsaTutorial;
public class Carryopreation {


static int count_carry(String a, String b) 
	{ 
	 int carry = 0; 
	 int count = 0; 
	
	 int len_a = a.length();
	 int len_b = b.length(); 
	
	 while (len_a != 0 || len_b != 0)  
	 { 
	    int x = 0, y = 0; 
	     if (len_a > 0)  
	     { 
	         x = a.charAt(len_a - 1) - '0'; 
	         len_a--; 
	     } 
	     if (len_b > 0)  
	     { 
	         y = b.charAt(len_b - 1) - '0'; 
	         len_b--; 
	     } 
	
	     
	     int sum = x + y + carry; 
	
	     
	     if (sum >= 10)  
	     { 
	         carry = 1; 
	         count++; 
	     } 
	
	     else
	         carry = 0; 
	 } 
	
	 return count; 
	} 

		
		public static void main (String[] args) 
		{ 
		 String a = "11111", b = "9"; 
		 int count = count_carry(a, b); 
		 if (count == 0) 
		     System.out.println("0\n"); 
		 else
		     System.out.println(count); 
		} 
} 
