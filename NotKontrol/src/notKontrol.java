import java.util.Scanner;

public class notKontrol {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Vize Notunuzu Giriniz");
        int vizenotu = s.nextInt();
        System.out.println("Fİnal Notunuzu Giriniz");
        int finalnotu = s.nextInt();

        if (((vizenotu*40)/100)+((finalnotu*60)/100) >=50 ){
            System.out.println("Bu dersten geçtiniz.");
        }
        else {
            System.out.println("Sen kaldın !");
        }

        System.out.println("Ortalamanız = " + (vizenotu*40/100+finalnotu*60/100));
    }
}
