/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polimorfismo;
/**
 *
 * @author ruben
 */
public class ClienteApp {
    public static void main(String[] args){
        //objetos da classe
        ClientePF clientepf1 = new ClientePF("Mario", "Morro", "225566");
        ClientePj clientepj1 = new ClientePj("Joao", "calheta", "998877");
        
        //imprimir mensagem
        System.out.println("Cliente PF \nNome = " +clientepf1.getNome()+ "\nEndereco = " +clientepf1.getEndereco()+ "\nCPF = " +clientepf1.getCpf());
        System.out.println("\n\nCliente PJ \nNome = " +clientepj1.getNome()+ "\nEndereco = " +clientepj1.getEndereco()+ "\nCNPF = " +clientepj1.getCnpj());
        
        System.out.println(clientepj1.toString());
        System.out.println(clientepf1.toString());
    }
}
