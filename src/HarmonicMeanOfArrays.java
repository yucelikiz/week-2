public class HarmonicMeanOfArrays {
    public static void main(String[] args) {

        //Dizimizi oluşturuyoruz.
        int[] list = {1,2,3,4,5,6,7};

        //harmonik serimizi tutacak olan değişkeni tanımlıyoruz.
        double harmonic = 0.0;

        //for-each döngüsünü kullanarak listemizdeki her numarayı 1'in böleni olarak hesaplıyoruz ve bunları üst üste topluyoruz.
        for (int number : list) {
            harmonic += 1.0 / number;
        }

        //Bu seriyi eleman sayısına bölerek harmonik serinin ortalamasını buluyoruz.
        double harmonicAverage = list.length/harmonic;
        System.out.println(harmonicAverage);
    }
}
