import java.util.Scanner;

/**
 * @author Doğan Seyfi Şen - 2022
 */

public class Driver {
	
	//TOPLAMA BAŞLANGICI
	static void plus() {
        Scanner scan = new Scanner(System.in);
        int number, result = 0, i = 1;
        while (true) {
            System.out.print(i++ + ". sayı :");
            number = scan.nextInt();
            if (number == 0) {
                break;
            }
            result += number;
        }
        System.out.println("\nSonuç : " + result);
    }
	//TOPLAMA SONU -- SONUCU GÖRMEK İÇİN "0" TUŞLAMAK GEREKLİ
	
	//ÇIKARMA BAŞLANGICI
    static void minus() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = scan.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = scan.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }

        System.out.println("\nSonuç : " + result);
    }
    //ÇIKARMA SONU
    
    //ÇARPMA BAŞLANGICI
    static void times() {
        Scanner scan = new Scanner(System.in);
        int number, result = 1, i = 1;

        while (true) {
            System.out.print(i++ + ". sayı :");
            number = scan.nextInt();

            if (number == 1)
                break;

            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }

        System.out.println("\nSonuç : " + result);
    }
    //ÇARPMA SONU
    
    //BÖLME BAŞLANGICI
    static void divided() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = scan.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = scan.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("Böleni 0 giremezsiniz.");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }

        System.out.println("\nSonuç : " + result);
    }
    //BÖLME SONU
    
    //KUVVET ALMA BAŞLANGICI
    static void power() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değeri giriniz :");
        int base = scan.nextInt();
        System.out.print("Üs değeri giriniz :");
        int exponent = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("\nSonuç : " + result);
    }
    //KUVVET ALMA SONU
    
    //FAKTÖRİYEL BAŞLANGICI
    static void factorial() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz :");
        int n = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Sonuç : " + result);
    }
    //FAKTÖRİYEL SONU
    
    //MOD ALMA BAŞLANGICI
    static void mod() {
    	Scanner inp = new Scanner(System.in);
    	System.out.print("Sayı giriniz :");
    	int n = inp.nextInt();
    	System.out.print("Mod giriniz : ");
    	int modN = inp.nextInt();
    	
    	int modRes = n % modN;
    	System.out.println("\nSonuç : " + modRes);
    }
    //MOD ALMA SONU
    
    //ALAN VE ÇEVRE BAŞLANGICI
    static void fieldCircum() {
    	Scanner inp = new Scanner(System.in);
    	System.out.print("Kısa kenarı giriniz :");
    	int kısa = inp.nextInt();
    	System.out.print("Uzun kenarı giriniz :");
    	int uzun = inp.nextInt();
    	
    	int field = kısa*uzun;
    	int circum = 2*(kısa+uzun);
    	
    	System.out.println("\nAlan :" + field);
    	System.out.println("Çevre :" + circum);
    }
    //ALAN VE ÇEVRE SONU
    
    //MAIN FONKSİYON (METOT)
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        String menu = "\n1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";

        do {
            System.out.println(menu);
            System.out.print("Lütfen bir işlem seçiniz :");
            select = scan.nextInt();
            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                	mod();
                	break;
                case 8: 
                	fieldCircum();
                	break;
                case 0:
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
            }
        } while (select != 0);
    	
    }
}
