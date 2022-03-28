/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Heranca;

/**
 *
 * @author ruben
 */

//Extends herda atributos da outra classe
public class ClientePj extends Cliente{
    //atributo especifico
    private String cnpj;
    
    //construtor
    public ClientePj(String nome, String endereco, String cnpj){
        super(nome, endereco);  //chamar o contrutor pai herdado
        this.cnpj = cnpj;
    }
    
    //getters e setters
    public String getCnpj(){
        return cnpj;
    }
    
    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }
}
