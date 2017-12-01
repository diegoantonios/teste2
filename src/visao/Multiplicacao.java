/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import javax.swing.JOptionPane;

/**
 *
 * @author Diego_Note
 */
public class Multiplicacao {
    public static void main(String[] args){
        int a,b,s;
        a=Integer.parseInt(JOptionPane.showInputDialog("Digite o Valor de A"));
        b=Integer.parseInt(JOptionPane.showInputDialog("Digite o Valor de B"));
        s=a*b;
        JOptionPane.showMessageDialog(null, a+"x"+b+"="+s);
    }
}
