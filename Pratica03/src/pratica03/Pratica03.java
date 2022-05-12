/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pratica03;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author bruna
 */
public class Pratica03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        int a[] = {1,2,4,6,21,0,0,0};
        int b[] = {2,3,6,7,9,11,15,20};
        int comum [] = new int [5];
        int i,j;
 
        for (i = 0; i < a.length; i++){
            for(j=0; j<b.length;j++){
                if (a[j]==b[i]){
                    comum[i] = b[i];
                }
            }
        }
        for (i=0;i<5;i++){
            if (comum[i] != 0){
                System.out.print(comum[i] + " ");
            }
        }
    }
}
