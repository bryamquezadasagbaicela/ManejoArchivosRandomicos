/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.principall;

import ec.edu.ups.principall.ValidacionDeCedula;

/**
 *
 * @author Byron PC
 */
public class Persona {

    private String cedula;
    private String nombre;
    private String apellido;
    private int edad;
    private double sueldo;
    private String telefono;
    private String fechaNacimiento;
    private int codigo;

    public Persona() {
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) throws ValidacionDeCedula {
        if (cedula.length() == 10) {
            int pos = Integer.parseInt(cedula.substring(2, 3));
            if (pos <= 6) {
                int[] Validacion = {2, 1, 2, 1, 2, 1, 2, 1, 2};
                int cedu = Integer.parseInt(cedula.substring(9, 10));
                int a = 0;
                int d = 0;
                for (int i = 0; i < (cedula.length() - 1); i++) {
                    d = Integer.parseInt(cedula.substring(i, i + 1)) * Validacion[i];
                    a += ((d % 10) + (d / 10));
                }
                if ((a % 10 == 0) && (a % 10 == cedu)) {
                    this.cedula = cedula;
                } else if ((10 - (a % 10)) == cedu) {
                    this.cedula = cedula;
                } else {
                    throw new ValidacionDeCedula();
                }
            } else {
                throw new ValidacionDeCedula();
            }
        } else {
            throw new ValidacionDeCedula();
        }

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws ValidacionNombresIncompletos, ValidacionDeNombres {
        boolean si = true;
        for (int i = 0; i < nombre.length(); i++) {
            if ((nombre.charAt(i) < 60 || nombre.charAt(i) > 100 && nombre.charAt(i) < 97 || nombre.charAt(i) > 122) && nombre.charAt(i) != 32) {
                si = false;

            }
        }
        if (si) {
            if (nombre.contains(" ")) {                
                    while(nombre.length()<50){
                        nombre=nombre + " ";
                       this.nombre = nombre;
                       si=true;
                    }    
                   
            } else {
                throw new ValidacionNombresIncompletos();
            }
        } else {
            throw new ValidacionDeNombres();
        }

    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) throws ValidacionNombresIncompletos, ValidacionDeNombres {
        boolean si = true;
        for (int i = 0; i < apellido.length(); i++) {
            if ((apellido.charAt(i) < 60 || apellido.charAt(i) > 100 && apellido.charAt(i) < 97 || apellido.charAt(i) > 122) && apellido.charAt(i) != 32) {
                si = false;

            }
        }
        if (si) {
            if (apellido.contains(" ")) {
                
                    while(apellido.length()<50){
                        apellido=apellido + " ";
                         this.apellido = apellido;
                         si=true;
                    }
                
            

                
            } else {
                throw new ValidacionNombresIncompletos();
            }
        } else {
            throw new ValidacionDeNombres();
        }

    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws LongitudFueraDeRangoException {
        if (edad>=1) {
            this.edad = edad;
        } else {
            throw new LongitudFueraDeRangoException("La edad debe estar comprendida entre 20 y 35 años");
        }

    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) throws ValidacionSueldo {
        if (sueldo >= 0.0) {
            this.sueldo = sueldo;
        } else {
            throw new ValidacionSueldo("Su sueldo no es el correcto");
        }
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) throws ValidacionTelefono {
        if (telefono.length() == 10) {
            this.telefono = telefono;
        } else {
            throw new ValidacionTelefono("Su telefono ingresado no es el correcto");
        }
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

  

   

    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 61 * hash + this.codigo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }
    
    
    

}
