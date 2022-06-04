/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author evert
 */
public  class Arquivo {
    public static File criarArquivo() throws IOException{
     File arq = new File("C:\\Users\\bruna\\OneDrive\\Área de Trabalho\\pratica06\\Clientes.txt");
     arq.createNewFile();
     return arq;
    }
    public static void  adicionar(Cliente cliente ) throws IOException{
        var clientes = "Nome: " + cliente.getNome() + ", Idade: " + cliente.getIdade() + ", Peso: "+ cliente.getPeso();
        var file = criarArquivo();
        FileWriter write = new FileWriter(file, true);
        BufferedWriter escrever = new BufferedWriter(write);
        escrever.write(clientes+"\n");
        
        escrever.close();
        
    }
    
    public static void deletar (String nome) throws IOException{
        
        var file = criarArquivo();
        FileReader r = new FileReader(file);
        BufferedReader read = new BufferedReader(r);
        List<String> linha = new ArrayList<>();
        String l;
        do{
            l = read.readLine();
            if( l!=null){
                if(!l.contains(nome)){
                linha.add(l);}
            }
        }while(l!=null);
        read.close();
        file.delete();
        file = criarArquivo();
        FileWriter write = new FileWriter(file, true);
        BufferedWriter escrever = new BufferedWriter(write);
        for(var item: linha){
            escrever.write(item+"\n");
        }
        escrever.close();
        
        
        }
    public static String buscar (String nome) throws IOException{
        var file = criarArquivo();
        FileReader r = new FileReader(file);
        BufferedReader read = new BufferedReader(r);
       String linha = "Teste";
       
        int i = 0;
        while (true){
        linha = read.readLine();
                if(linha.contains(nome)){
                    break;
                }
        }read.close();
            
              
            
            
            
           
              return linha;
//        while (i > file.length()){
//        linha = read.readLine();
//                if(linha.contains(nome)){
//                    
//                }
//        }
//            do {
//                linha = read.readLine();
//                if(linha.contains(nome)){
//                    JOptionPane.showMessageDialog(null, linha);
//                  
//                    
//                    
//                    
//                }
//            } while (linha!=null);
//              
//            read.close();
            
            
           
              
        
//        List<String> linha = new ArrayList<>();
//        String l;
//        do{
//            l = read.readLine();
//            if( l!=null){
//                linha.add(l);}
//        }while(l!=null);
//        read.close();
//        String cliente = null;
//        for(var item:linha){
//            if (item.contains(nome)){
//                cliente = item;
//                break;
//            }
//        }
//        return cliente;
    
    }
    
    public static void imprimir(){
        try{   
            var file = criarArquivo();
            FileReader fr = new FileReader(file);
            BufferedReader leitor = new BufferedReader(fr);
            String linha;
            do {
                linha = leitor.readLine();
                if(linha != null){
                System.out.println(linha);
                }
            } while (linha!=null);
            
            leitor.close();        
            
        } catch (IOException ex) {
            System.out.println("\nProblemas ao abrir o arquivo");
        }
    }
    
    
}
