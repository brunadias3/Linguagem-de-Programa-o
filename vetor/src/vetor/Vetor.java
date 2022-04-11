/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor;

import java.util.Scanner;

/**
 *
 * @author bruna
 */
public class Vetor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        
            int n = 10;
            int vetor[] = new int[n];
            int i;
            int soma = 0;
            float media;
            
            for (i=0; i<n; i++) {
                System.out.printf("informe %do. valor de %d: ",(i+1), n);
                vetor[i] = ler.nextInt(); 
                soma = vetor[i] + soma;  
                
            }
            
            System.out.printf("soma: " + soma );
            System.out.println();
            media = soma / n;
            System.out.printf("media: " + media);
            System.out.println();
            
    }
    
}
