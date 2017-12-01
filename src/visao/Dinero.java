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
public class Dinero {

    public static void main(String[] args) {
        int N = 0, cem = 0, cinqu = 0, vint = 0, dez = 0, cinco = 0, dois = 0, um = 0, N2 = 0;
        Scanner ler = new Scanner(System.in);
        N = ler.nextInt();
        while (N < 0 && N > 1000000) {
            N = ler.nextInt();
        }
        N2 = N;
        while (N >= 100) {
            N = N - 100;
            cem = cem + 1;
        }
        while (N >= 50) {
            N = N - 50;
            cinqu = cinqu + 1;
        }
        while (N >= 20) {
            N = N - 20;
            vint = vint + 1;
        }
        while (N >= 10) {
            N = N - 10;
            dez = dez + 1;
        }
        while (N >= 5) {
            N = N - 5;
            cinco = cinco + 1;
        }
        while (N >= 2) {
            N = N - 2;
            dois = dois + 1;
        }
        while (N >= 1) {
            N = N - 1;
            um = um + 1;
        }
        System.out.printf("%d", N2);
        System.out.printf("\n");
        System.out.printf("%d nota (s) de R$ 100,00", cem);
        System.out.printf("\n");
        System.out.printf("%d nota (s) de R$ 50,00", cinqu);
        System.out.printf("\n");
        System.out.printf("%d nota (s) de R$ 20,00", vint);
        System.out.printf("\n");
        System.out.printf("%d nota (s) de R$ 10,00", dez);
        System.out.printf("\n");
        System.out.printf("%d nota (s) de R$ 5,00", cinco);
        System.out.printf("\n");
        System.out.printf("%d nota (s) de R$ 2,00", dois);
        System.out.printf("\n");
        System.out.printf("%d nota (s) de R$ 1,00", um);
        System.out.printf("\n");
    }
}
