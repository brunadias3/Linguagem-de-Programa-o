
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author bruna
 */
public class Principal extends Arquivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        String menu, nome, peso, idade, nome2, mensagem;
        int numero;
        Cliente c1 = new Cliente("bruna", 18, 50);

        menu = JOptionPane.showInputDialog("1 - Adicionar\n 2 - Buscar\n 3 - Remover\n 4 - Imprimir");
        numero = Integer.parseInt(menu);

        //adicionar
        if (numero == 1) {

            nome = JOptionPane.showInputDialog("Entre com o nome");
            idade = JOptionPane.showInputDialog("Entre com a idade");
            peso = JOptionPane.showInputDialog("Entre com o peso");
            if (nome == null || idade == null || peso == null) {
                JOptionPane.showMessageDialog(null, "É necessário preencher todos os campos!");
            } else {
                Cliente cliente = new Cliente(nome, Integer.parseInt(idade), Double.parseDouble(peso));
                adicionar(cliente);
                menu = JOptionPane.showInputDialog("1 - Adicionar\n 2 - Buscar\n 3 - Remover\n 4 - Imprimir");
                numero = Integer.parseInt(menu);
            }
        }

        //buscar
        if (numero == 2) {
            nome = JOptionPane.showInputDialog("Busque pelo nome");
            try {
                String cliente = buscar(nome);
                JOptionPane.showMessageDialog(null, cliente);

                menu = JOptionPane.showInputDialog("1 - Adicionar\n 2 - Buscar\n 3 - Remover\n 4 - Imprimir");
                numero = Integer.parseInt(menu);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Cliente não localizado");
                menu = JOptionPane.showInputDialog("1 - Adicionar\n 2 - Buscar\n 3 - Remover\n 4 - Imprimir");
                numero = Integer.parseInt(menu);
            }
        }

        //remover
        if (numero == 3) {
            nome = JOptionPane.showInputDialog("Entre com o nome");
            try {
                deletar(nome);
                JOptionPane.showMessageDialog(null, "Cliente excluido");
                menu = JOptionPane.showInputDialog("1 - Adicionar\n 2 - Buscar\n 3 - Remover\n 4 - Imprimir");
                numero = Integer.parseInt(menu);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Cliente não excluido");
                menu = JOptionPane.showInputDialog("1 - Adicionar\n 2 - Buscar\n 3 - Remover\n 4 - Imprimir");
                numero = Integer.parseInt(menu);
            }
        }

        //imprimir
        if (numero == 4) {
            imprimir();
            menu = JOptionPane.showInputDialog("1 - Adicionar\n 2 - Buscar\n 3 - Remover\n 4 - Imprimir");
            numero = Integer.parseInt(menu);
        }

    }
}
