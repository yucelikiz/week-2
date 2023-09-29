import java.util.Scanner;
import java.util.Arrays;

public class SortOutArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Dizinin boyutunu giriniz : ");
        int range = scan.nextInt();

        int [] list = new int[range];
        for (int i = 0; i < list.length; i++) {
            System.out.print(i+1+". eleman : ");
            list[i] = scan.nextInt();
        }
        // Sort komutu ile elemanlar küçükten büyüğe sıralanır.
        Arrays.sort(list);
        System.out.println("\nThe sorted array is :");
        for (int num : list) {
            System.out.println(num + " ");
        }

    }
}
