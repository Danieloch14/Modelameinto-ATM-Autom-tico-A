/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fuentes;

/**
 *
 * @author danie
 */
public class Cuenta {
    int numero;
    static double saldo;
    Atm atm;

    public Cuenta() {
        saldo = 200;
    }
    
    public static double getSaldo() {
        
        return saldo;
        
    }  
}
