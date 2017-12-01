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
public class Consumo {
            public static void main(String[] args){
            int X=0;
            float Y=0;
            Scanner ler = new Scanner(System.in);
            X=ler.nextInt();
            Y=ler.nextFloat();
            System.out.printf("%.3f km/l",X/Y);
            System.out.printf("\n");
}
}