/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fuentes;

import static Fuentes.Cuenta.saldo;

/**
 *
 * @author danie
 */
public class Atm {
    Cuenta cuenta;
    int Id;
    double cantidad;

    public Atm() {
    }

    public Atm(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getCantidad() {
        return cantidad;
    }
    
    public boolean extraerRetiro(double cantidad){
        cuenta = new Cuenta();
        double aux;
        aux = this.getCantidad();
        if(aux > cuenta.getSaldo()){
            return false;
        }else{
            return true;
        }
    }
    
    
    
    
    
    
}
