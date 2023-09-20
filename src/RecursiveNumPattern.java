import java.util.Scanner;

public class RecursiveNumPattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Desenini bulmak istediğiniz sayıyı girin :");
        int number = scan.nextInt();
        //Kullanıcıdan aldığımız number değişkenini sabit ve değişken sayıya atıyoruz, alert değişkeni ise ilk etapta çıkarma yapsın diye -1 olarak belirliyoruz.
        numPattern(number, number, -1);
    }

    //desen bulucu için bir sabit bir değişken sayı ve bir de poztif/negatif değiştirici ekliyoruz.
    static void numPattern (int fixNum, int flexNum, int alert){
        //Eğer değişken sayı girdiğimiz sayıyı geçerse döngü bitecek böylece desen simetrik olacak.
        if (flexNum > fixNum)
            return;
        //Eğer değişken sayı sıfırın altına inerse tetiklenecek ve sayı azaltma çarpanını sayı artırma çarpanına dönüştürecek.
        if (flexNum<1)
            alert *= -1;
        //Sabit sayıya eşitlenen değişken sayı döngü sonunda -5 ile toplanacak, sıfırın altına düşerse +5 ile toplanacak
        System.out.print(" "+flexNum+" ");
        numPattern(fixNum, flexNum +alert*5, alert);
    }
}
