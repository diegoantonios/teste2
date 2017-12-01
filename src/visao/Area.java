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
public class Area {
            public static void main(String[] args){
            double A=0,B=0,C=0;
            Scanner ler = new Scanner(System.in);
            A=ler.nextFloat();
            B=ler.nextFloat();
            C=ler.nextFloat();
            System.out.printf("TRIANGULO: %.3f",(A*C)/2);
            System.out.printf("\n");
            System.out.printf("CIRCULO: %.3f",3.14159*(C*C));
            System.out.printf("\n");
            System.out.printf("TRAPEZIO: %.3f",((A+B)*C)/2);
            System.out.printf("\n");
            System.out.printf("QUADRADO: %.3f",B*B);
            System.out.printf("\n");
            System.out.printf("RETANGULO: %.3f",A*B);
            System.out.printf("\n");
    }
}
