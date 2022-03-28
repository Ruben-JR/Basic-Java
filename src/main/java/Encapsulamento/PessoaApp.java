/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encapsulamento;

/**
 *
 * @author ruben
 */
public class PessoaApp {
    //classe executavel
    public static void main(String[] args){
        //objetos da classe pessoa
        Pessoa pessoa1 = new Pessoa(1, "Ruben");
        Pessoa pessoa2 = new Pessoa(2, "Erica");
        
        //exibe mensagem no monitor
        System.out.println("Codigo = " +pessoa1.getCodigo()+ "\nNome = " +pessoa1.getNome());
        
        //modifica os dados do atributo
        pessoa1.setCodigo(0);
        pessoa1.setNome("Ruben de Pina");
        System.out.println("Codigo = " +pessoa1.getCodigo()+ "\nNome = " +pessoa1.getNome());

        pessoa2.setCodigo(1);
        pessoa2.setNome("Erica dos Santos");
        System.out.println("Codigo = "+pessoa2.getCodigo()+ "\nNome = "+pessoa2.getNome());
    }
}
