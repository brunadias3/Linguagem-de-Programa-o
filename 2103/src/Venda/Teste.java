/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Venda;

/**
 *
 * @author bruna
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cliente cli= new Cliente("higpt","30/10/2003", 'F',"39999999","52006893841");
        System.out.println(cli.getNome());
        System.out.println(cli.getDataNascimento());
        System.out.println(cli.getSexo());
        System.out.println(cli.getRg());
        System.out.println(cli.getCpf());
        
        
    }
    
}

