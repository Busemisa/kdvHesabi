import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //değişken tanımları yapıldı
        double tutar,kdvOran=0.18;

        Scanner input = new Scanner(System.in);
        System.out.print("Ücret tutarını giriniz : ");
        tutar=input.nextDouble();

        //kdv tutarını ve bu kdv nin ürüne yansıtılmış fiyatını buluyoruz
        double kdvTutar=tutar*kdvOran;
        double kdvliTutar=tutar+kdvTutar;

        //en son tüm tutarlarımızı bastırdık ve ürüne yapılan işlemleri görmüş olduk
        System.out.println("KDV siz tutar : "+tutar);
        System.out.println("KDV Oranı :"+kdvOran);
        System.out.println("KDV tutarı :" + kdvTutar);
        System.out.println("KDV uygulanmmış tutar : " + kdvliTutar);


    }
}
