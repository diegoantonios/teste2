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
public class Intervalo {
        public static void main(String[] args){
        float N=0;
        Scanner ler=new Scanner(System.in);
        N=ler.nextFloat();
        if(N<0||N>100){
            System.out.printf("Fora de intervalo");
            System.out.printf("\n");            
        }
        if(N>0&&N<=25.0){
            System.out.printf("Intervalo [0,25]");
            System.out.printf("\n");            
        }
        if(N>25.0&&N<=50.0){
            System.out.printf("Intervalo (25,50]");  
            System.out.printf("\n");            
        }
        if(N>50.0&&N<=75.0){
            System.out.printf("Intervalo (50,75]");  
            System.out.printf("\n");            
        }
        if(N>75.0&&N<=100.0){
            System.out.printf("Intervalo (75,100]"); 
            System.out.printf("\n");            
        }
        
        }
}
