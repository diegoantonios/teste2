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
public class Media1 {
    public static void main(String[] args){
        double A=0, B=0,X=0;
        Scanner ler = new Scanner(System.in);
        A=ler.nextFloat();
        B=ler.nextFloat();
        A=A*3.5;
        B=B*7.5;
        X=(A+B)/11;
        System.out.printf("MEDIA = %.5f",X);
        System.out.printf("\n");
    }
}
