
package lab7p2_walterdoblado;

import java.util.ArrayList;


public class Vendedor {
    
    private String nombre;
    private int cantVend;
   private int cantdin;

    public Vendedor() {
    }

    public Vendedor(String nombre, int cantVend, int cantdin) {
        this.nombre = nombre;
        this.cantVend = cantVend;
        this.cantdin = cantdin;
    }

   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantVend() {
        return cantVend;
    }

    public void setCantVend(int cantVend) {
        this.cantVend = cantVend;
    }



    public int getCantdin() {
        return cantdin;
    }

    public void setCantdin(int cantdin) {
        this.cantdin = cantdin;
    }

    @Override
    public String toString() {
        return "Vendedor{" + "nombre=" + nombre + ", cantVend=" + cantVend + ", cantdin=" + cantdin + '}';
    }
        
    
}
