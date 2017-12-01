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
public class Sphere {
        public static void main(String[] args){
            double R=0,Z=0;
            Scanner ler = new Scanner(System.in);
            R=ler.nextInt();
            Z=4/3.0*3.14159*(R*R*R);
            System.out.printf("VOLUME = %.3f",Z);
            System.out.printf("\n");
    }
}
