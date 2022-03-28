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
public class Cliente {
    //atributos
    private String nome;
    private String endereco;
    
    //construtor
    public Cliente(String nome, String endereco){
        this.nome = nome;
        this.endereco = endereco;
    }
    
    //getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    @Override
    public String toString(){
        return "\n\nNome = " +nome+ "\nEndereco = " +endereco;
    }
}
