package exercicios;

public class Fatorial {

	public static void main(String[] args) {
		
		int n1 = 5;
		
		int calc = 1;
		
		for(int i = 1; i <= n1; i++) {		

			calc *= i;
			
			
		}
		
		System.out.println(n1+ "! = " + calc);
		
	}
	
}
