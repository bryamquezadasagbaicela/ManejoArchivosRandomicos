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
public class ValidacionTelefono extends Exception{

    public ValidacionTelefono(String telefono_mal_ingresado) {
        super("Su teléfono no es el correcto");
    }
    
    
}
