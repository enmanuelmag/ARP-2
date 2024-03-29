/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constantes;

import java.util.ArrayList;
import java.util.Arrays;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;

/**
 *
 * @author emman
 */
public class Constantes {
    
    
    public static final Insets ESPACIADO = new Insets(20,20,20,20);
    public static final Insets ESPACIADO2 = new Insets(50,40,40,40);
    public static final Insets ESPACIADOBorder = new Insets(40,40,40,40);
    public static final int TEXTS = 260;
    public static final Insets BOTON = new Insets(15,15,15,15);
    public static final ObservableList<String> TIPO_CLIENTES = 
            FXCollections.observableArrayList("AMBULANTE", "CANILLITAS", "DISTRIBUIDOR");
    public static final ObservableList<String> CATG_PRODUCTOS = 
            FXCollections.observableArrayList("HELADO", "CONO", "JALEA", "OTROS");
    public static final Insets BOTONA = new Insets(7,7,7,7);
    public static final Insets ESPACIADO_FILTROS = new Insets(28,10,13,10);
    public static final ObservableList<String> TABLAS = FXCollections.observableArrayList("Cliente", 
            "Factura", "Producto", "Categoria", "Proveedor", "Materia Prima");
    public static final String DataBaseURL="jdbc:mysql://localhost/alertas?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    public static final String DataBaseUser="root";
    public static final String DataBasePass="root";
    public static final ArrayList<String> ICONOS = new ArrayList<>(Arrays.asList(
            "factura2B.png","clientes.png","inventario.png","pedidos.png", "producto.png",
            "proveedor.png", "reporte.png", "ordenes.png"));
    public static final String PATH_ICON="/recursos/iconos/";
    public static final ObservableList<String> FILTRO_POR_ORDENES = 
            FXCollections.observableArrayList("PRODUCTO", "PROVEEDOR", "ESTADO");
    public static final ObservableList<String> ESTADO = 
            FXCollections.observableArrayList("RECIBIDO (COMPLETO)", "PARCIALMENTE RECIBIDO", "PENDIENTE");
    public static final ObservableList<String> FILTRO_POR_PEDIDOS = 
            FXCollections.observableArrayList("TIPO DE CLIENTE", "CLIENTE");
    public static final ObservableList<String> FILTRO_POR_FACTURAS = 
            FXCollections.observableArrayList("NOMBRE CLIENTE", "FECHA");
    public static final ObservableList<String> FILTRO_POR_CLIENTES = 
            FXCollections.observableArrayList("NOMBRE CLIENTE");
    public static final ObservableList<String> FILTRO_POR_PRODUCTO = 
            FXCollections.observableArrayList("NOMBRE PRODUCTO","PROVEEDOR","TIPO");
    public static final ObservableList<String> FILTRO_POR_PROVEEDORES = 
            FXCollections.observableArrayList("NOMBRE");
}
