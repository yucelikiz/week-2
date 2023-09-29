public class ReccurringNumbersOfArrays {
    public static void main(String[] args) {
        int arr[] = {10, 20, 20, 10, 10, 20, 5, 20};

        int max = Integer.MIN_VALUE;
        for (int i=0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }

        int counter[] = new int[max+1];
        for (int i = 0; i < arr.length; i++) {

            counter[arr[i]]++;
        }
        System.out.println("Tekrar sayıları:");
        for (int i = 0; i <= max; i++) {
            if (counter[i] > 1){
                System.out.println(i + " sayısı " + counter[i]+ " kere tekrar edildi.");
            }else if (counter[i] == 1) {
                System.out.println(i + " sayısı " + counter[i]  + " kere terkar edildi.");
            }

        }

    }
}
