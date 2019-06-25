/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.principall;

/**
 *
 * @author erics
 */
public class ValidacionDeNombres extends Exception {
     public ValidacionDeNombres(){        
        super("Ha ingresado un número en su nombre\n"+"Por favor Verificar");        
    }
    
}
