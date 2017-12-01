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
public class Circuferencia {
    public static void main(String[] args) throws IOException{
        double A=0,PI=3.14159,R;
        Scanner ler = new Scanner(System.in);
        R=ler.nextDouble();
        A=(PI*(R*R));
        System.out.printf("A = %.4f",A);
        System.out.printf("\n");
    }
}
