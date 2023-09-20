import java.util.Scanner;

public class RecursiveUsluSayilar {
    //sayıların üssünü alan statik bir nesne oluşturuyoruz
    static int power(){
        Scanner scan = new Scanner(System.in);

        System.out.print("Taban sayısını giriniz :");
        int base = scan.nextInt();

        System.out.print("Üs sayısını giriniz :");
        int exponent = scan.nextInt();

        //sonucu 1e eşitleyerek üssün sıfır aldığı durumlarda otomatik 1 sonucunu veriyoruz, aksi takdirde for döngüsü üs sayısı kadar işlem yapıyor.
        int result = 1;
        for(;exponent > 0 ; exponent--){
            result *= base;
        }
        return result;
    }

    public static void main(String[] args) {
        //Oluşturulan nesne sayesinde tek bir kod satırı ile üs hesabı yapabiliyoruz.
        while (true)
        System.out.println("Sonuç = " + power());
        }

}
