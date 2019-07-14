/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SegundaLista;

import javax.swing.JTextField;

/**
 *
 * @author Pedro
 */
public class Calculadora {
    public void somar(JTextField v1, JTextField v2, JTextField txtTotal){
        double x = Double.parseDouble(v1.getText());
        double y = Double.parseDouble(v2.getText());
        txtTotal.setText ("" + (x + y));
    }
    
    public void subtrair(JTextField v1, JTextField v2, JTextField txtTotal){
        double x = Double.parseDouble(v1.getText());
        double y = Double.parseDouble(v2.getText());
        txtTotal.setText ("" + (x - y));
    }
    
    public void multiplicar(JTextField v1, JTextField v2, JTextField txtTotal){
        double x = Double.parseDouble(v1.getText());
        double y = Double.parseDouble(v2.getText());
        txtTotal.setText ("" + (x * y));
    }
    
    public void dividir(JTextField v1, JTextField v2, JTextField txtTotal){
        double x = Double.parseDouble(v1.getText());
        double y = Double.parseDouble(v2.getText());
        txtTotal.setText ("" + (x / y));
    }
}
