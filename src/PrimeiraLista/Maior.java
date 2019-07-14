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
public class Maior {
    public double verificamaior(double v1, double v2){
        if(v1 > v2){
            return v1;
        } else {
            return v2;
        }
    }
    
    public double verificamaior(double v1, double v2, double v3){
        if(v1 > v2  && v1 > v3){
            return v1;
        } else if(v2 > v1 && v2 > v3) {
            return v2;
        } else {
            return v3;
        }
    }
    
    public double verificamaior(double v1, double v2, double v3, double v4){
        if(v1 > v2  && v1 > v3 && v1 > v4){
            return v1;
        } else if(v2 > v1 && v2 > v3 && v2 > v4) {
            return v2;
        } else if (v3 > v1 && v3 > v2 && v3 > v4){
            return v3;
        } else {
            return v4;
        }
    }
}
