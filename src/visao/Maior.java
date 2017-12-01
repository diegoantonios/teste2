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
public class Maior {
            public static void main(String[] args){
            int A=0,B=0,S=0,maiorab=0;
            Scanner ler = new Scanner(System.in);
            A=ler.nextInt();
            B=ler.nextInt();
            S=ler.nextInt();
            maiorab=(A+B+Math.abs(A-B))/2;
            System.out.printf("%d eh o maior",(maiorab+S+Math.abs(maiorab-S))/2);
            System.out.printf("\n");
}
}