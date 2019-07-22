/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.manejoEcepciones;

/**
 *
 * @author Byron PC
 */
public class ValidacionSueldo extends Exception{

    public ValidacionSueldo(String su_sueldo_no_es_correco) {
        super("Su sueldo no es el correcto");
    }
    
}
