
package boletin9.pkg1;

/**
 *
 * @author dfernandezguerreiro
 */
import java.util.Scanner;

//1. Calcula a cantidade de números negativos, positivos e, ceros  que hai nun grupo de 10 numeros . 
public class Metodo9_1 {
    Scanner sc=new Scanner (System.in);
    int num, numNegativo=0, numPositivo=0, num0=0, valor;
    
    public void calcular(){
        
        for(num=0;num < 10;num++){
            System.out.println("Introducir numero");
            valor=sc.nextInt();
            if(valor > 0){
                numPositivo++;
            }
            else if(valor==0){
                num0++;
            }
            else{
                numNegativo++;
            }
        }
        System.out.println("Numeros positivos = "+numPositivo+" Numero negativos = "+numNegativo+" Numero de ceros = "+num0);
    }
}
