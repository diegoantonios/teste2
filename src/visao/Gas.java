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
public class Gas {
            public static void main(String[] args){
            int h=0,km=0;
            Scanner ler = new Scanner(System.in);
            h=ler.nextInt();
            km=ler.nextInt();
            System.out.printf("%.3f minutos",(h*km)/12.0);
            System.out.printf("\n");    
 }
}
