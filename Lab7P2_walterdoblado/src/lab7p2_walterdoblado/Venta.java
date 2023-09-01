
package lab7p2_walterdoblado;

import java.util.ArrayList;


public class Venta {
    
    private String venddor;
    private String cliente;
    private int costo;
  private String carro;

    public Venta() {
    }

    public Venta(String venddor, String cliente, int costo, String carro) {
        this.venddor = venddor;
        this.cliente = cliente;
        this.costo = costo;
        this.carro = carro;
    }

    public String getVenddor() {
        return venddor;
    }

    public void setVenddor(String venddor) {
        this.venddor = venddor;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public String getCarro() {
        return carro;
    }

    public void setCarro(String carro) {
        this.carro = carro;
    }

    @Override
    public String toString() {
        return "Venta{" + "venddor=" + venddor + ", cliente=" + cliente + ", costo=" + costo + ", carro=" + carro + '}';
    }
    
  
  
    
    
}
