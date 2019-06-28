/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controladores;

import ec.edu.ups.controladores.ControladorPersona;
import ec.edu.ups.principall.Persona;
import java.sql.Date;

/**
 *
 * @author Byron PC
 */
public class Pruba {

    public static void main(String[] args) {
        Persona p = new Persona("0302306542", "Carlos", "Arevalo", 5,new java.util.Date(),"0987815997",5.5);
        ControladorPersona controladorPersona = new ControladorPersona();
        controladorPersona.create(p);
    }

}
