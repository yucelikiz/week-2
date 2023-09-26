public class TranspozeOfArrays {
    public static void main(String[] args) {
        //iki yönlü matris oluşturuyoruz.
        int [][] multiList = {{2,3,4},{5,6,4}};
        System.out.println("The first poze of matrix :");
        printArray(multiList);
        System.out.println("The last poze of matrix :");
        convert(multiList);

    }

    // Bu metot diziyi çevirmek için kullanılacak
    public static void convert (int [][] multiList) {
        //Yeni bir matris nesnesi oluşturuyoruz
        int [][] newList = new int [multiList[0].length][multiList.length];
        //Bu for döngüsü ile dizinin ilk halinin satırlarını,
        for (int row = 0; row < multiList.length; row++) {
            //Bu döngü ile de sütunlarını okuyup,
            for (int col = 0; col < multiList[0].length; col++) {
                //Burada eski dizinin satırını yeni dizinin sütunu haline,
                //eski dizinin sütununu ise yeni dizinin satırı haline getiriyoruz.
                newList[col][row] = multiList[row][col];
            }
        }
        //Yeni oluşturulan matrisi print array metodu ile bu metodun altında yazdırıyoruz.
        printArray(newList);
    }

    //Bu metot diziyi yazdırmak için kullanılıyor.
    public static void printArray(int [][] multiList) {
        for (int [] row : multiList) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
