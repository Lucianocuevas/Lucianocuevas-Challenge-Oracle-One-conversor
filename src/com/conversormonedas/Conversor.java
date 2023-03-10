/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.conversormonedas;

/**
 *
 * @author lucia
 */
public class Conversor {

    private double peso = 1;
    private double dolar = 0.00485;
    private double euro = 0.00474;
    
    public double dolarpeso(float valor){
        return (valor* (this.peso/this.dolar));
    }
    public double dolareuro(float valor){
        return (valor* (this.euro/this.dolar));
    }
    public double eurodolar(float valor){
        return (valor*(this.dolar/this.euro));        
    }
    
    public double europeso(float valor){
        return (valor * (this.peso/this.euro));
    }
    public double pesodolar(float valor) {
        return (valor * (this.peso * this.dolar));
    }
    public double pesoeuro(float valor) {
        return valor * (this.peso * this.euro);
    }   

    public double getPeso() {
        return this.peso;
    }
    
    public double getDolar() {
        return this.dolar;
    }

    public double getEuro() {
        return this.euro;
    }

    public void setDolar(double dolar) {
        this.dolar = dolar;
    }

    public void setEuro(double euro) {
        this.euro = euro;
    }   
}
