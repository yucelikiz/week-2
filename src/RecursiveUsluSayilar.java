import java.util.Scanner;

public class RecursiveUsluSayilar {
    //sayıların üssünü alan statik bir nesne oluşturuyoruz
    static int power(int base , int exponent){
        int result = 1;
        for(;exponent != 0 ; exponent--){
            result *= base;
        }
        System.out.println("Sonuç = " + result);
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Programın sürekli çalışmasını while döngüsü ile sağlıyoruz.
        while (true) {
            System.out.print("Taban sayısını giriniz :");
            int x = scan.nextInt(); //değişkenleri bu kısımda belirleyip üs alma metoduna ekliyoruz.
            System.out.print("Üs sayısını giriniz :");
            int y = scan.nextInt();
            power(x,y);
        }
    }
}
