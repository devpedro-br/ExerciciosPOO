/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SegundaLista;

/**
 *
 * @author Pedro
 */
public class Carro {
    protected String cor;
    protected double preco;
    private String modelo;
    
    public Carro(String modelo, double preco){
        this.cor = "Preto";
        this.modelo = modelo;
        this.preco = preco;
    }
    
    public static void main(String[] args) {
        Carro c = new Carro("Sedan", 5.000);
        
        System.out.println("Cor: " + c.cor);
        System.out.println("Modelo: " + c.modelo);
        System.out.println("Preço: " + c.preco);
    }
}
