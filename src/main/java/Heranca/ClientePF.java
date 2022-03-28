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
public class ClientePF extends Cliente{
    //atributo especifico
    private String cpf;
    
    //construtor
    public ClientePF(String nome, String endereco, String cpf){
        super(nome, endereco);  //chamar o construtor pai
        this.cpf = cpf;
    }
    
    //getters e setters
    public String getCpf(){
        return cpf;
    }
    
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
}
