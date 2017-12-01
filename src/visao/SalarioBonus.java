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
public class SalarioBonus {
        public static void main(String[] args){
        String A;
        double C=0,B=0,X=0;
        Scanner ler = new Scanner(System.in);
        A=ler.nextLine();
        B=ler.nextDouble();
        C=ler.nextDouble();
        X=B+((C*15)/100);
        System.out.printf("NUMBER = R$ %.2f",X);
        System.out.printf("\n");
    }
}
