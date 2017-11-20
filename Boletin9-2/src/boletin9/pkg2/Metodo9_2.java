
package boletin9.pkg2;

/**
 *
 * @author dfernandezguerreiro
 */

//2- Realiza un programa que calcule a suma e o producto dos números comprendidos entre 10 e 90 .
public class Metodo9_2 {
    int i;
    double aSuma=0, aPro=1;
    public void calcularSumaProducto(){
        for(i=10; i<=90; i++){
            aSuma+=i;
            aPro*=i;
        }
        System.out.println("Suma = "+aSuma+" Producto = "+aPro);
    }
    
}
