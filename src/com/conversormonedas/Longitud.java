/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.conversormonedas;

/**
 *
 * @author lucia
 */
public class Longitud {
    private double metro = 0.001;
    private double km = 1.000;
    private double milla = 1.609344;
    
    public double metroKm (float valor){
        return valor * this.metro;
    }
    public double metroMilla (float valor){
        return valor/(this.milla*1000);
    }
    public double kmMetro (float valor){
        return valor * (this.km*1000);
    }
    public double kmMilla (float valor){
        return valor / this.milla;
    }    
    public double millaKm(float valor){
        return valor * (this.km/this.milla);
    }
    public double millaMetro (float valor){
        return valor * (1000*this.milla);
    }

    public double getMetro() {
        return metro;
    }

    public double getKm() {
        return km;
    }

    public double getMilla() {
        return milla;
    }
}
