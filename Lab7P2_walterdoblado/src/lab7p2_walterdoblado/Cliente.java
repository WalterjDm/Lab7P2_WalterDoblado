
package lab7p2_walterdoblado;

import java.util.ArrayList;


public class Cliente {
    
    private String nombre;
    private int edad;
    private String profesion;
     private int cantCarro ;
    private int sueldo;

    public Cliente() {
    }

    public Cliente(String nombre, int edad, String profesion, int cantCarro, int sueldo) {
        this.nombre = nombre;
        this.edad = edad;
        this.profesion = profesion;
        this.cantCarro = cantCarro;
        this.sueldo = sueldo;
    }

    
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

  
    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", edad=" + edad + ", profesion=" + profesion + ", cantCarro=" + cantCarro + ", sueldo=" + sueldo + '}';
    }
    
    
    
    
    
    
    
}
