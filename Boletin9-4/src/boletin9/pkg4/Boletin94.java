
package boletin9.pkg4;

/**
 *
 * @author dfernandezguerreiro
 */
import java.util.Scanner;
public class Boletin94 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);

        //System.out.println("****MENU****\n 0.-Salir  1.-Tabla ");
        
        Metodo9_4 obxTabla=new Metodo9_4();
        obxTabla.calcularTabla();
        
        
    }
    
}
