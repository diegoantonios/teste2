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
public class Diferenca {
    public static void main(String[] args){
        int A=0, B=0,C=0,D=0,X=0;
        Scanner ler = new Scanner(System.in);
        A=ler.nextInt();
        B=ler.nextInt();
        C=ler.nextInt();
        D=ler.nextInt();
        X=(A*B-C*D);
        System.out.print("DIFERENCA = "+X);
        System.out.print("\n");
    }
}
