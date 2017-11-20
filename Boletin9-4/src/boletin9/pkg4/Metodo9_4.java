
package boletin9.pkg4;

/**
 *
 * @author dfernandezguerreiro
 */

/**
 * 4- Codifica un programa que solicite  un número e, visualice a táboa de 
 * multiplicar dese número. O programa rematara cando prememos o cero.
 */
import java.util.Scanner;
public class Metodo9_4 {
    int num, num2, num3, num4, num5, num6, num7, num8, num9, num10, numTabla, i;
    Scanner sc=new Scanner (System.in);
    public void calcularTabla(){
        System.out.println("Introducir número de la tabla");
        numTabla=sc.nextInt();
        for(i=1; i<=10; i++){
            num=1*numTabla;
            num2=2*numTabla;
            num3=3*numTabla;
            num4=4*numTabla;
            num5=5*numTabla;
            num6=6*numTabla;
            num7=7*numTabla;
            num8=8*numTabla;
            num9=9*numTabla;
            num10=10*numTabla;
        }
        System.out.println(numTabla+" x 1 = "+num);
        System.out.println(numTabla+" x 2 = "+num2);
        System.out.println(numTabla+" x 3 = "+num3);
        System.out.println(numTabla+" x 4 = "+num4);
        System.out.println(numTabla+" x 5 = "+num5);
        System.out.println(numTabla+" x 6 = "+num6);
        System.out.println(numTabla+" x 7 = "+num7);
        System.out.println(numTabla+" x 8 = "+num8);
        System.out.println(numTabla+" x 9 = "+num9);
        System.out.println(numTabla+" x 10 = "+num10);
    }
}
