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
public class Distancia {
            public static void main(String[] args){
            double x1=0,x2=0,y1=0,y2=0;
            Scanner ler = new Scanner(System.in);
            x1=ler.nextDouble();
            y1=ler.nextDouble();
            x2=ler.nextDouble();
            y2=ler.nextDouble();
            System.out.printf("%.4f",Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1))));
            System.out.printf("\n");    
 }
}
