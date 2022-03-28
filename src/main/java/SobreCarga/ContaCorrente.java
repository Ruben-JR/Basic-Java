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
public class ContaCorrente {
    //atributos 
    private int numero, agencia;
    private float limite;
    
    //construtor
    public ContaCorrente(int numero, int agencia){
        this.numero = numero;
        this.agencia = agencia;
    }
    
    //contrutor com mesmo nome mas argumentos diferentes
    public ContaCorrente(int numero, int agencia, float limite){
        this.numero = numero;
        this.agencia = agencia;
        this.limite = limite;
    }
    
    //getters e setters
    public int getNumero(){
        return numero;
    }
    
    public void setNumero(int numero){
        this.numero = numero;
    }
    
    public int getAgencia(){
        return agencia;
    }
    
    public void setAgencia(int agencia){
        this.agencia = agencia;
    }
    
    public float getLimite(){
        return limite;
    }
    
    public void setLimite(float limite){
        this.limite = limite;
    }
}
