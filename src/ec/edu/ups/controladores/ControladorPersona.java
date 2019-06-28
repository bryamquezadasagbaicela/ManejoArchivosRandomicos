/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controladores;

import ec.edu.ups.principall.Persona;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;

/**
 *
 * @author Byron PC
 */
public class ControladorPersona {
    private BaseDatos baseDatos;

    public ControladorPersona() {
        baseDatos = new BaseDatos();
    }
    
    public void create(Persona persona) {
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        String fechaBD = formato.format(persona.getFechaNacimiento());
        String sql = "INSERT INTO \"PERSONAS\" VALUES('" + persona.getCedula() + "','"
                + persona.getNombre() + "','"
                + persona.getApellido() + "',"
                + persona.getEdad() + ",'"
                + fechaBD + "','"
                + persona.getTelefono() + "',"
                + persona.getSueldo() + ");";
        
        System.out.println(sql);
        baseDatos.conectar();
        try{
            Statement sta = baseDatos.getConexionBD().createStatement();
            sta.execute(sql);
            baseDatos.desconectar();
        }catch(SQLException error){
            error.printStackTrace();
        }
    }

}
