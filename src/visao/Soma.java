/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import java.io.IOException;
import java.util.Scanner;



/**
 *
 * @author Diego_Note
 */
public class Soma {
    public static void main(String[] args) throws IOException{
        int A=0, B=0,X=0;
        Scanner ler = new Scanner(System.in);
        A=ler.nextInt();
        B=ler.nextInt();
        X=A-B;
        System.out.print("DIFE = "+X);
        System.out.print("\n");
    }
    
}
