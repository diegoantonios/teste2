/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import java.util.Scanner;

/**
 *
 * @author Diego_Note
 */
public class Bhaskara {
        public static void main(String[] args){
        float A=0,B=0,C=0,delta=0;
        Scanner ler=new Scanner(System.in);
        A=ler.nextFloat();
        if(A>0){
        B=ler.nextFloat();
        C=ler.nextFloat();
        delta=(B*B)-(4*A*C);
            System.out.printf("R1 = %.5f",(((B*-1)+Math.sqrt(delta))/(2*A)));
            System.out.printf("\n");
            System.out.printf("R2 = %.5f",(((B*-1)-Math.sqrt(delta))/(2*A)));
            System.out.printf("\n");            
        }else{
            System.out.printf("Impossivel calcular");
            System.out.printf("\n");
        }
        }
}
