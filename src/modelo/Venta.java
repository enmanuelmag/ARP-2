package modelo;
// Generated 18/08/2019 04:31:36 PM by Hibernate Tools 4.3.1



/**
 * Venta generated by hbm2java
 */
public class Venta  implements java.io.Serializable {


     private int ventaId;
     private Factura factura;
     private PedidoProducto pedidoProducto;
     private Integer cantNoVendida;

    public Venta() {
    }

	
    public Venta(int ventaId, Factura factura, PedidoProducto pedidoProducto) {
        this.ventaId = ventaId;
        this.factura = factura;
        this.pedidoProducto = pedidoProducto;
    }
    public Venta(int ventaId, Factura factura, PedidoProducto pedidoProducto, Integer cantNoVendida) {
       this.ventaId = ventaId;
       this.factura = factura;
       this.pedidoProducto = pedidoProducto;
       this.cantNoVendida = cantNoVendida;
    }
   
    public int getVentaId() {
        return this.ventaId;
    }
    
    public void setVentaId(int ventaId) {
        this.ventaId = ventaId;
    }
    public Factura getFactura() {
        return this.factura;
    }
    
    public void setFactura(Factura factura) {
        this.factura = factura;
    }
    public PedidoProducto getPedidoProducto() {
        return this.pedidoProducto;
    }
    
    public void setPedidoProducto(PedidoProducto pedidoProducto) {
        this.pedidoProducto = pedidoProducto;
    }
    public Integer getCantNoVendida() {
        return this.cantNoVendida;
    }
    
    public void setCantNoVendida(Integer cantNoVendida) {
        this.cantNoVendida = cantNoVendida;
    }




}


