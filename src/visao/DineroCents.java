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
public class DineroCents {
                public static void main(String[] args){
            int cem=0,cinqu=0,vint=0,dez=0,cinco=0,dois=0,um=0,cinquecent=0,vintcent=0,dezcent=0,cincent=0,umcent=0;
            float N=0,N2=0;
            Scanner ler = new Scanner(System.in);
            N=ler.nextFloat();
                while(N<0&&N>1000000.00){
                    N=ler.nextFloat();
                }
            N2=N;
            while(N>=100.00){
                N=N-100;
                cem=cem+1;
            }
            while(N>=50.00){
                N=N-50;
                cinqu=cinqu+1;
            }
            while(N>=20.00){
                N=N-20;
                vint=vint+1;
            }
            while(N>=10.00){
                N=N-10;
                dez=dez+1;
            }
            while(N>=5.00){
                N=N-5;
                cinco=cinco+1;
            }
            while(N>=2.00){
                N=N-2;
                dois=dois+1;
            }
            while(N>=1.00){
                N=N-1;
                um=um+1;
            } 
            while(N>=0.50){
                N=(float) (N-0.50);
                cinquecent=cinquecent+1;
            } 
            while(N>=0.25){
                N=(float) (N-0.25);
                vintcent=vintcent+1;
            }
            while(N>=0.10){
                N=(float) (N-0.10);
                dezcent=dezcent+1;
            } 
            while(N>=0.05){
                N=(float) (N-0.05);
                cincent=cincent+1;
            }
            while(N>=0.01){
                N=(float) (N-0.01);
                umcent=umcent+1;
            }           
            System.out.printf("NOTAS:");
            System.out.printf("\n");  
            System.out.printf("%d nota (s) de R$ 100,00",cem);
            System.out.printf("\n");    
            System.out.printf("%d nota (s) de R$ 50,00",cinqu);
            System.out.printf("\n"); 
            System.out.printf("%d nota (s) de R$ 20,00",vint);
            System.out.printf("\n");  
            System.out.printf("%d nota (s) de R$ 10,00",dez);
            System.out.printf("\n"); 
            System.out.printf("%d nota (s) de R$ 5,00",cinco);
            System.out.printf("\n"); 
            System.out.printf("%d nota (s) de R$ 2,00",dois);
            System.out.printf("\n"); 
            System.out.printf("MOEDAS:"); 
            System.out.printf("\n"); 
            System.out.printf("%d nota (s) de R$ 1,00",um);
            System.out.printf("\n");  
            System.out.printf("%d nota (s) de R$ 0,50",cinquecent);
            System.out.printf("\n");
            System.out.printf("%d nota (s) de R$ 0,25",vintcent);
            System.out.printf("\n");
            System.out.printf("%d nota (s) de R$ 0,10",dezcent);
            System.out.printf("\n");
            System.out.printf("%d nota (s) de R$ 0,05",cincent);
            System.out.printf("\n");
            System.out.printf("%d nota (s) de R$ 0,01",umcent);
            System.out.printf("\n");             
 }
}
