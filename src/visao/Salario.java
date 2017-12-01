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
public class Salario {
        public static void main(String[] args){
        int A=0, B=0;
        float C=0,X=0;
        Scanner ler = new Scanner(System.in);
        A=ler.nextInt();
        B=ler.nextInt();
        C=ler.nextFloat();
        X=B*C;
        System.out.printf("NUMBER = %d",A);
        System.out.printf("\n");
        System.out.printf("SALARY = U$ %.2f",X);
        System.out.printf("\n");
    }
}
