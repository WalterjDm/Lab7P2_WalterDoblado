
package lab7p2_walterdoblado;

import java.util.ArrayList;


public class Venta {
    
    private Vendedor venddor;
    private Cliente cliente;
    private int costo;
  private Vehiculo carro;

    public Venta() {
    }

    public Venta(Vendedor venddor, Cliente cliente, int costo, Vehiculo carro) {
        this.venddor = venddor;
        this.cliente = cliente;
        this.costo = costo;
        this.carro = carro;
    }

    public Vendedor getVenddor() {
        return venddor;
    }

    public void setVenddor(Vendedor venddor) {
        this.venddor = venddor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public Vehiculo getCarro() {
        return carro;
    }

    public void setCarro(Vehiculo carro) {
        this.carro = carro;
    }

    @Override
    public String toString() {
        return "Venta " + "venddor=" + venddor + " cliente=" + cliente + " costo=" + costo + " carro=" + carro ;
    }

   
    
  
  
    
    
}
