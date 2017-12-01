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
public class Ano {
             public static void main(String[] args){
            int mes=0,ano=0,dia=0;
            Scanner ler = new Scanner(System.in);
            dia=ler.nextInt();
            while(dia>=365){
                dia=dia-365;
                ano=ano+1;
            }
            while(dia>=30){
                    mes=mes+1;
                    dia=dia-30;
                }
            System.out.printf("%d ano(s)",ano);
            System.out.printf("\n");    
            System.out.printf("%d mes(es)",mes);
            System.out.printf("\n"); 
            System.out.printf("%d dia(s)",dia);
            System.out.printf("\n"); 
 }  
}
