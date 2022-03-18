/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetoconta;

/**
 *
 * @author bruna
 */
public class ProjetoConta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Conta minhaConta = new Conta();
        minhaConta.nome = "Ana";
        minhaConta.saldo=1000;
        minhaConta.numero=1234;
        System.out.println("Saldo Atual:" + minhaConta.saldo);
        minhaConta.saca(200);
        minhaConta.deposita(500);
        System.out.println(minhaConta.saldo);
    }
    
}
