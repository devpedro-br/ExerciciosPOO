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
public class TestandoAnimal {
    public static void main(String[] args) {
        // TESTANDO A CLASSE ABSTRATA 'ANIMAL'
        // TESTANDO A HERANÇA DA CLASSE 'ANIMAL' NA CLASSE 'CACHORRO'
        // TESTANDO A HERANÇA DA CLASSE 'ANIMAL' NA CLASSE 'GIRAFA'
        Cachorro c = new Cachorro();
        System.out.println("CLASSE CACHORRO");
        System.out.println("Alimentação: " + c.getAlimentacao());
        System.out.println("Tamanho: "+ c.getTamanho());
        System.out.println("Nome: " + c.getNome());
        
        System.out.println("----------------------------");
        
        Girafa g = new Girafa();
        System.out.println("CLASSE GIRAFA");
        System.out.println("Alimentação: " + g.getAlimentacao());
        System.out.println("Tamanho: "+ g.getTamanho());
        System.out.println("Nome: " + g.getNome());
    }
}
