import java.util.Scanner;

public class gelismisHesapMakinesi {

    static void plus() {
        Scanner scan = new Scanner(System.in);
        int number, result=0, i=1;
        while (true) {
            System.out.print(i++ + ". sayı :");
            number = scan.nextInt();
            if (number==0) {
                break;
            }
            result += number;
        }
        System.out.println("Sonuç : "+result);
    }

    static void minus() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz? :");
        int counter = scan.nextInt();
        int number, result=0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = scan.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }
        System.out.println("Sonuç : "+result);
    }

    static void times() {
        Scanner scan = new Scanner(System.in);
        int number, result = 1, i = 1;
        number = scan.nextInt();

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

        System.out.println("Sonuç : " + result);
    }

    static void division() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz? :");
        int counter = scan.nextInt();
        double number, result = 0.0;

        for (int i = 1; i<=counter; i++) {
            System.out.print(i +". sayı :");
            number = scan.nextDouble();
            if (i != 1 && number ==0) {
                System.out.print("Böleni 0 giremezsiniz!");
                continue;
            }
            result /= number;
        }
        System.out.println("Sonuç :" + result);
    }

    static void power() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değeri giriniz :");
        int base = scan.nextInt();
        System.out.print("Üs değeri giriniz :");
        int exponent = scan.nextInt();
        int result = 1;

        for (int i = 1; i<=exponent; i++) {
            result *= base;
        }

        System.out.println("Sonuç : " + result);
    }

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

    static void mod() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Modunu almak istediğiniz sayıyı giriniz : ");
        int number = scan.nextInt();
        System.out.print("Almak istediğiniz mod değerini giriniz : ");
        int mode = scan.nextInt();
        int result = number%mode;

        System.out.println("Sonuç :" + result);

    }

    static void rectArea() {
        Scanner scan = new Scanner(System.in);
        int height, width;
        System.out.print("Dikdörtgen yüksekliğini cm olarak girin :");
        height = scan.nextInt();
        System.out.print("Dikdörtgen genişliğini cm olarak girin :");
        width = scan.nextInt();

        int result = height*width;

        System.out.println("Sonuç : "+ result + "cm2");
    }

    public static void main(String[] args) {
        Scanner inpt = new Scanner(System.in);
        int select;
        Scanner close;

        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi \n"
                + "3- Çarpma işlemi\n"
                + "4- Bölme İşlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Fatöriyel Alma\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesaplama\n"
                + "0- Çıkış Yap";

        System.out.println(menu);

        while (true){

            System.out.print("Bir işlem seçiniz :");
            select =inpt.nextInt();

            if (select==0){
                break;
            }

            switch (select){
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
                    division();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                case 7:
                    mod();
                case 8:
                    rectArea();
                default:
                    System.out.println("Hatalı bir giriş yaptınız!");

            }
        }

    }
}