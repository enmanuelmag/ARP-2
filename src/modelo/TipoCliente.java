package modelo;
// Generated 18/08/2019 04:31:36 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * TipoCliente generated by hbm2java
 */
public class TipoCliente  implements java.io.Serializable {


     private int tipoClienteid;
     private String tipo;
     private BigDecimal descuento;
     private Set clientes = new HashSet(0);

    public TipoCliente() {
    }

	
    public TipoCliente(int tipoClienteid, String tipo, BigDecimal descuento) {
        this.tipoClienteid = tipoClienteid;
        this.tipo = tipo;
        this.descuento = descuento;
    }
    public TipoCliente(int tipoClienteid, String tipo, BigDecimal descuento, Set clientes) {
       this.tipoClienteid = tipoClienteid;
       this.tipo = tipo;
       this.descuento = descuento;
       this.clientes = clientes;
    }
   
    public int getTipoClienteid() {
        return this.tipoClienteid;
    }
    
    public void setTipoClienteid(int tipoClienteid) {
        this.tipoClienteid = tipoClienteid;
    }
    public String getTipo() {
        return this.tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public BigDecimal getDescuento() {
        return this.descuento;
    }
    
    public void setDescuento(BigDecimal descuento) {
        this.descuento = descuento;
    }
    public Set getClientes() {
        return this.clientes;
    }
    
    public void setClientes(Set clientes) {
        this.clientes = clientes;
    }

    @Override
    public String toString() {
        return tipo;
    }

    


}


