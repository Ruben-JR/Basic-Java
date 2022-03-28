/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SobreCarga;

/**
 *
 * @author ruben
 */
public class ContaCorrenteApp {
    public static void main(String[] args){
        //objetos da classe
        ContaCorrente contaComum = new ContaCorrente(123, 152);
        ContaCorrente contaEspecial = new ContaCorrente(123, 166, 1000.00f);
        
        //imprimir mensagem
        System.out.println("Conta comum \nNumero = " +contaComum.getNumero()+ "\nAgencia = " +contaComum.getAgencia());
        System.out.println("\n\nConta especial \nNumero = " +contaEspecial.getNumero()+ "\nAgencia = " +contaEspecial.getAgencia()+ "\nLimite = " +contaEspecial.getLimite());
        
    }
}
