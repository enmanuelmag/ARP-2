package modelo;
// Generated 18/08/2019 04:31:36 PM by Hibernate Tools 4.3.1


import com.jfoenix.controls.datamodels.treetable.RecursiveTreeObject;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Factura generated by hbm2java
 */
public class Factura extends RecursiveTreeObject<Factura> implements java.io.Serializable {


     private int facturaId;
     private Cliente cliente;
     private Establecimiento establecimiento;
     private Date fecha;
     private BigDecimal subTotal;
     private BigDecimal descuento;
     private BigDecimal cargo;
     private BigDecimal iva;
     private Set ventas = new HashSet(0);

    public Factura() {
    }

	
    public Factura(int facturaId, Cliente cliente, Establecimiento establecimiento, Date fecha, BigDecimal subTotal, BigDecimal descuento, BigDecimal cargo) {
        this.facturaId = facturaId;
        this.cliente = cliente;
        this.establecimiento = establecimiento;
        this.fecha = fecha;
        this.subTotal = subTotal;
        this.descuento = descuento;
        this.cargo = cargo;
    }
    public Factura(int facturaId, Cliente cliente, Establecimiento establecimiento, Date fecha, BigDecimal subTotal, BigDecimal descuento, BigDecimal cargo, BigDecimal iva, Set ventas) {
       this.facturaId = facturaId;
       this.cliente = cliente;
       this.establecimiento = establecimiento;
       this.fecha = fecha;
       this.subTotal = subTotal;
       this.descuento = descuento;
       this.cargo = cargo;
       this.iva = iva;
       this.ventas = ventas;
    }
   
    public int getFacturaId() {
        return this.facturaId;
    }
    
    public void setFacturaId(int facturaId) {
        this.facturaId = facturaId;
    }
    public Cliente getCliente() {
        return this.cliente;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Establecimiento getEstablecimiento() {
        return this.establecimiento;
    }
    
    public void setEstablecimiento(Establecimiento establecimiento) {
        this.establecimiento = establecimiento;
    }
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public BigDecimal getSubTotal() {
        return this.subTotal;
    }
    
    public void setSubTotal(BigDecimal subTotal) {
        this.subTotal = subTotal;
    }
    public BigDecimal getDescuento() {
        return this.descuento;
    }
    
    public void setDescuento(BigDecimal descuento) {
        this.descuento = descuento;
    }
    public BigDecimal getCargo() {
        return this.cargo;
    }
    
    public void setCargo(BigDecimal cargo) {
        this.cargo = cargo;
    }
    public BigDecimal getIva() {
        return this.iva;
    }
    
    public void setIva(BigDecimal iva) {
        this.iva = iva;
    }
    public Set getVentas() {
        return this.ventas;
    }
    
    public void setVentas(Set ventas) {
        this.ventas = ventas;
    }




}


