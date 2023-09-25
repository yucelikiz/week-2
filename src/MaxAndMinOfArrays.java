import java.util.Scanner;

public class MaxAndMinOfArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Kullanıcıdan sayı istenir.
        System.out.print("Enter the number you wanna check, please : ");
        int inNumber = scan.nextInt();

        //Sayı dizisi burada list adıyla oluşturulur.
        int[] list = {15,12,788,1,-1,-778,2,0};

        //Oluşturulan metotlar en yakın küçük ve büyük sayıları bulması için çağırılır.
        int nearestSmaller = getNearestSmaller(list, inNumber);
        int nearestGreater = getNearestGreater(list, inNumber);

        //Çıkan sonuçlar buraya yazdırılır.
        System.out.println("Nearest smaller number for the entered number :"+ nearestSmaller);
        System.out.println("Nearest greater number for the entered number :"+nearestGreater);

        }

        //Girilen sayıya en yakın küçük sayı burada çağırılır. Değişken en düşük Integer değere atanır böylece listedeki en küçük sayılar karşılaştırma dışı kalmaz.
        //Eğer listeden daha küçük bir sayı girilirse metot sayıyı en küçük integer değeriyle kıyaslar.
        static int getNearestSmaller(int[] array, int number) {
            int minNumber = Integer.MIN_VALUE;
            for(int i : array) {
                if ( i < number && i > minNumber) {
                    minNumber = i;
                }
            }
            return minNumber;
        }


        //Girilen sayıya en yakın büyük sayı burada çağırılır. Değişken en büyük Integer değere atanır böylece listedeki en büyük sayılar karşılaştırma dışı kalmaz.
        //Eğer listeden daha büyük bir sayı girilirse metot sayıyı en büyük integer değeriyle kıyaslar.
        static int getNearestGreater(int[] array, int number) {
            int maxNumber = Integer.MAX_VALUE;
            for(int i : array) {
                if ( i > number && i < maxNumber) {
                    maxNumber = i;
                }
            }
            return maxNumber;
        }

}
