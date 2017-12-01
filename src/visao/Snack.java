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
public class Snack {
    public static void main(String[] args){
    float cc=0,xs=0,xb=0,ts=0,r=0,p=0;
    int X=0,Y=0;
    cc=(float) 4.00;
    xs=(float) 4.50;
    xb=(float) 5.00;
    ts=(float) 2.00;
    r=(float) 1.50;      
    Scanner ler=new Scanner(System.in);
    X=ler.nextInt();
    Y=ler.nextInt();
    if(X==1){
        p=cc;
        System.out.printf("Total: R$ %.2f",p*Y);   
    }
    if(X==2){
        p=xs;
        System.out.printf("Total: R$ %.2f",p*Y);        
    }
    if(X==3){
        p=xb;
        System.out.printf("Total: R$ %.2f",p*Y);        
    }
    if(X==4){
        p=ts;
        System.out.printf("Total: R$ %.2f",p*Y);        
    }
    if(X==5){
        p=r;
        System.out.printf("Total: R$ %.2f",p*Y);        
    }
            System.out.printf("\n"); 
    }
}
