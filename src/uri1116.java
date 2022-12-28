import java.util.Scanner;
import java.util.Locale;
public class ex004 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			double n1 = sc.nextDouble();	
			double n2 = sc.nextDouble();
			
			if (n2 == 0) {
				System.out.println("Divisão Impossível.");
			}
			else if (n1 == 0) {
				System.out.println("0.0");	
			}
			else {
				double res = n1/n2;
				System.out.printf("%.1f%n", res);
				
			}
		}
		
		sc.close();

	}

}
