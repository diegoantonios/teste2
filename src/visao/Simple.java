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
public class Simple {
        public static void main(String[] args){
        int A=0,B=0,C=0,D=0;
        float X=0,Y=0,Z=0;
        Scanner ler = new Scanner(System.in);
        A=ler.nextInt();
        B=ler.nextInt();
        X=ler.nextFloat();
        C=ler.nextInt();
        D=ler.nextInt();
        Y=ler.nextFloat();
        Z=(B*X)+(D*Y);
        System.out.printf("VALOR A PAGAR: R$ %.2f",Z);
        System.out.printf("\n");
    }
}
