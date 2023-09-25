public class HarmonicMeanOfArrays {
    public static void main(String[] args) {
        int[] list = {1,2,3,4,5,6,7};
        double harmonic = 0.0;
        for (int number : list) {
            harmonic += 1.0 / number;
        }

        double harmonicAverage = list.length/harmonic;
        System.out.println(harmonicAverage);
    }
}
