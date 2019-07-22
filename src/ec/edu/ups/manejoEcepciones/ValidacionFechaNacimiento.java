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
public class ValidacionFechaNacimiento extends Exception{

    public ValidacionFechaNacimiento(String su_fecha_es_incorrecta) {
        super ("La fecha ingresada no es la correcta");
    }
    
}
