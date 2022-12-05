import java.util.Scanner;

/**
 * @author Doğan Seyfi Şen - 2022
 */

public class Driver {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("1. sayı: ");
		double number1 = input.nextDouble();
		System.out.print("2. sayı: ");
		double number2 = input.nextDouble();
		
		System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
		System.out.print("Seçiminiz: ");
		int select = input.nextInt();
		
		switch(select) {
			case 1:
				System.out.println("Sonuç: "+ (number1+number2));
				break;
			case 2:
				System.out.println("Sonuç: "+ (number1-number2));
				break;
			case 3:
				System.out.println("Sonuç: "+ (number1*number2));
				break;
			case 4:
				System.out.println("Sonuç: "+ (number1/number2));
				break;
			default:
				System.out.println("Böyle bir işlem yok.");
				break;
		}
	}	
}
