/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrimeiraLista;

/**
 *
 * @author Técnico
 */
public class Volume {
    double largura, altura, profundidade, aresta, raio, total;
    
    public void ortoedro(){
        total = altura * largura * profundidade;
    }
    
    public double cubo(){
        return aresta * aresta * aresta;
    }
    
    public void cilindro(double raio, double altura){
        total = 3.14 * (Math.pow(raio, 2) * altura);
    }
    
    public double cone(double altura, double raio){
        return (3.14 * Math.pow(raio, 2) * altura) / 3;
    }
}
