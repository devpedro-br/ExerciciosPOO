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
public class Area {
    double total, lado, base, altura, raio;
    
    public double triangulo(double base, double altura){
        return (base * altura) / 2;
    }
    
    public void quadrado(){
        total = lado * lado;
    }
    
    public double retangulo(){
        return base * altura;
    }
    
    public void circulo(){
        total = 3.14 * Math.pow(raio, 2);
    }
}
