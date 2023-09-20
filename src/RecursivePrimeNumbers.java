import java.util.Scanner;

public class RecursivePrimeNumbers {
    static boolean isPrime(int number, int divisor){
        //bölen 1e geldiğinde döngüyü bitir
        if (divisor == 1) {
            return true;
        }
        //eğer rakam kendinden önceki bir rakama bölünüyorsa bu sayı alınmaz.
        if (number % divisor == 0) {
            return false;
        }
        return isPrime(number, divisor-1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Sayı giriniz: ");
        int number = scan.nextInt();

        if (isPrime(number, number / 2)) {
            System.out.println(number + " sayısı ASAL'dır");
        }else {
            System.out.println(number + " sayısı ASAL değildir");
        }

    }
}
