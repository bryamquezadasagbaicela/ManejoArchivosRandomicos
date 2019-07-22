/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.manejoEcepciones;

/**
 *
 * @author erics
 */
public class LongitudFueraDeRangoException extends Exception {
    
    public LongitudFueraDeRangoException(String la_edad_debe_estar_comprendida_entre_20_y) {
        super("La edad no es la correcta");
    }
    
    
}
