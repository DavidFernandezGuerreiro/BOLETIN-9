/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9.pkg6;

/**
 *
 * @author dfernandezguerreiro
 */
import java.util.Scanner;
public class Metodo9_6 {
    Scanner sc=new Scanner(System.in);
    int ntraballadores,mileurista,porcenTraballadores,ntraballadores2;
    public void Soldo(){
        double soldo;
        System.out.println("introduce un soldo");
        soldo=sc.nextDouble();
        while (soldo!=0){
            if(1000<=soldo && 1750>=soldo){
                ntraballadores++; 
                ntraballadores2++;
            }
            else if (1000>soldo && soldo>0){
                ntraballadores++;
                mileurista++;
            }
            else  if (soldo<0)

            System.out.println("Non se admiten soldos negativos");
            soldo=sc.nextDouble();
        }     

        System.out.println("O número de traballadores que cobran entre 1000€ e 1750€ é "+ntraballadores2);
        System.out.println("O porcentaxe de traballadores que cobran menos de 1000 euros é "+((mileurista*100)/ntraballadores)+" %");

    }
}

