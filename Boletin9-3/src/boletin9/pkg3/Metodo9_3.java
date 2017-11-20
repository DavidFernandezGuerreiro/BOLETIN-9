
package boletin9.pkg3;

/**
 *
 * @author dfernandezguerreiro
 */
import java.util.Scanner;
public class Metodo9_3 {
    Scanner sc=new Scanner (System.in);
    float bas, altura, area;
    
    
    public void calcularRectangulo(){
        System.out.println("Introduzca la base : ");
        float base=sc.nextFloat();
        while(base<0){
            System.out.println("Error, vuelve a introducir la base : ");
            base=sc.nextFloat();
        }
        System.out.println("Introduzca la altura : ");
        float altura=sc.nextFloat();        
        while(altura<0){
            System.out.println("Error, vuelve a introducir la altura : ");
            altura=sc.nextFloat();
        }
        System.out.println("Area = "+(base*altura));
    }
}
