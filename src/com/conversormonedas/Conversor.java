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

    private double dolar = 1;
    private double peso = 206.75;
    private double euro = 1.06;
    private double libras = 1.20;
    private double yenJapon = 136.83;
    private double wonCoreaS = 1320.71;

    public double dolarpeso(double valor) {
        return (valor * (this.dolar * this.peso));
    }

    public double dolareuro(double valor) {
        return (valor * (this.dolar / this.euro));
    }

    public double dolarlibras(double valor) {
        return valor * (this.dolar / this.libras);
    }

    public double dolaryenJapones(double valor) {
        return valor * (this.dolar * this.yenJapon);
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setLibras(double libras) {
        this.libras = libras;
    }

    public void setYenJapon(double yenJapon) {
        this.yenJapon = yenJapon;
    }

    public void setWonCoreaS(double wonCoreaS) {
        this.wonCoreaS = wonCoreaS;
    }

    public double getLibras() {
        return libras;
    }

    public double getYenJapon() {
        return yenJapon;
    }

    public double getWonCoreaS() {
        return wonCoreaS;
    }

    public double dolarwonCoreaS(double valor) {
        return valor * (this.dolar * this.wonCoreaS);
    }

    public double pesodolar(double valor) {
        return valor * (this.dolar / this.peso);
    }

    public double pesoeuro(double valor) {
        return valor * pesodolar(dolareuro(1));
    }

    public double pesolibras(double valor) {
        return valor * pesodolar(dolarlibras(1));
    }

    public double pesoyenJapones(double valor) {
        return valor * pesodolar(dolaryenJapones(1));
    }

    public double pesowonCoreaS(double valor) {
        return valor * pesodolar(dolarwonCoreaS(1));
    }

    public double eurodolar(double valor) {
        return (valor * (this.dolar * this.euro));
    }

    public double europeso(double valor) {
        return (valor * (this.peso * this.euro));
    }

    public double eurolibras(double valor) {
        return valor * eurodolar(dolarlibras(1));
    }

    public double libraspeso(double valor) {
        return valor * (this.peso * this.libras);
    }

    public double librasdolar(double valor) {
        return valor * (this.libras * this.dolar);
    }

    public double libraseuro(double valor) {
        return valor * (this.libras / this.euro);
    }
    
    public double yenJaponesPeso(double valor){
        return valor * pesodolar(dolaryenJapones(1));
    }
    
    public double wonCoreaSPeso(double valor){
        return valor * pesodolar(dolarwonCoreaS(1));
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
