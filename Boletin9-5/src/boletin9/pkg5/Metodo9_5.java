
package boletin9.pkg5;

/**
 *
 * @author dfernandezguerreiro
 */
// 5- Implementa un programa no que se pida o número de elementos e, visualice a seguinte serie :
    //a)  2 + 4 + 6 + 8 + 10 ...
    //b)  - 1 + 2 – 3 + 4 – 5 + 6 ...
    //c)  0, 1, 1, 2, 3, 5, 8, 13, 21 ...
import java.util.Scanner;
public class Metodo9_5 {
    Scanner sc=new Scanner (System.in);
    
    
    public void serie1(){
        int numero, calc, i;
        System.out.println("SERIE 1 -> Introducir numero :");
        int num=sc.nextInt();
        for(i=1; i<=num; i++){
           // calc=num*2;
            System.out.println(num+(2*i));
        }  
    }
    public void serie2(){
        System.out.println("SERIE 2 -> Introducir numero :");
        int i, calc;
        int num=sc.nextInt(); 
        for(i=1; i<=num; i++){
            if(i%2==0){
                System.out.println(" + "+i);
            }
            else{
                System.out.println(" - "+i);
            }
        }
    }
    int num1=0, num2=1, i=0, num3;
    public void serie3(){
        System.out.println("SERIE 3 -> Introducir numero :");
        int num=sc.nextInt();
        System.out.println("0\n1");
        for(i=0; i<=num; i++){
            num3=num1+num2;
            num1=num2;
            num2=num3;
            System.out.println(num3);
        }
    }
    
    
}
