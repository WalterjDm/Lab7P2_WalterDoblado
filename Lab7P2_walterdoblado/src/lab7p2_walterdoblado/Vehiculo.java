
package lab7p2_walterdoblado;

import java.awt.Color;


public class Vehiculo {
    
    
    private String marca;
    private String color;
    private String modelo;
    private int anio;
    private int precio;
    private int id;
    
    public Vehiculo() {
    }

    public Vehiculo(String marca, String color, String modelo, int anio, int precio, int id) {
        this.marca = marca;
        this.color = color;
        this.modelo = modelo;
        this.anio = anio;
        this.precio = precio;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

  

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return ""+id;
    }
    
    
  
    
    
    
}
