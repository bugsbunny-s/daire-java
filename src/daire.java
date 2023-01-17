import java.util.Scanner;

import javax.swing.text.html.StyleSheet;
public class daire {
    public static void main(String[] args) throws Exception {
        int r;
        double cevre,alan, pi = 3.14;

        Scanner inp = new Scanner(System.in);

        System.out.print("Dairenin yarıçapını giriniz : ");
        r = inp.nextInt();

        double a,merkez;
        System.out.print("Dairenin merkez açısını giriniz : ");
        a = inp.nextDouble();
      
        alan = pi * r * r;
        cevre = 2 * pi * r;

        System.out.println("Dairenin alanı : " + pi);
        System.out.println("Dairenin cevresi : " + cevre);

        merkez = (pi * (r*r) * a) / 360;

        System.out.println("Dairenin merkez açısı : " + merkez);
     }
}

       

       



