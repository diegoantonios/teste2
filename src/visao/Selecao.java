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
public class Selecao {
    public static void main(String[] args){
        int A=0,B=0,C=0,D=0;
        Scanner ler= new Scanner(System.in);
        A=ler.nextInt();
        B=ler.nextInt();
        C=ler.nextInt();
        D=ler.nextInt();
        if(B>C&&D>A&&C+D>A+B){
            System.out.printf("Valores aceitos");
            System.out.printf("\n");
        }else{
            System.out.printf("Valores nao aceitos");
            System.out.printf("\n");
        }
        }
        
        
        
 }
