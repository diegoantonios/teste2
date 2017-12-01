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
public class Time {
            public static void main(String[] args){
            int min=0,ho=0,seg=0;
            Scanner ler = new Scanner(System.in);
            seg=ler.nextInt();
            while(seg>=60){
                seg=seg-60;
                min=min+1;
                if(min>=60){
                    min=0;
                    ho=ho+1;
                }
            }
            System.out.printf("%d:%d:%d",ho,min,seg);
            System.out.printf("\n");    
 }
}
