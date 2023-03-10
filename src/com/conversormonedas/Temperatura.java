/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.conversormonedas;

/**
 *
 * @author lucia
 */
public class Temperatura {
      
    private double centigrados = 273.15;
    
    public double kelvinFarenheit (float valor){
        return (valor - this.centigrados)*9/5+32;
    }
    
    public double kelvinCentigrados (float valor) {
        return (valor - this.centigrados);
    }
    
    public double farenheitCentigrados (float valor){
        return ((valor - 32)*5/9);
    }
    
    public double farenheitKelvin (float valor){
        return ((valor - 32) * 5/9 + this.centigrados);
    }
    
    public double centigradosKelvin (float valor){
        return (valor + this.centigrados);
    }
    
    public double centigradosFarenheit (float valor){
        return (valor *9/5 +32);
    }
}
