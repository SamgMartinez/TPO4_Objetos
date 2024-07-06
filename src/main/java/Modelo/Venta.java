package Modelo;

import Tipo.TipoTarjeta;

import java.util.*;

/**
 * 
 */
public class Venta {
    private Float totalVenta;
    private String nombrePeli;

    public String getNombrePeli() {
        return nombrePeli;
    }

    public void setNombrePeli(String nombrePeli) {
        this.nombrePeli = nombrePeli;
    }

    /**
     * Default constructor
     */
    public Venta(int ventaID, Date fchVenta, List<Combo> combos, Funcion funcion,float total) {
    	this.combos = combos;
    	this.funcion = funcion;
    	this.fchVenta = fchVenta;
        this.totalVenta= total;
    }


	/**
     * 
     */
    private int ventaID;

    /**
     * 
     */
    private Date fchVenta;

    /**
     * 
     */
    private List<Combo> combos;

    public Funcion getFuncion() {
        return funcion;
    }

    public void setFuncion(Funcion funcion) {
        this.funcion = funcion;
    }

    private Funcion funcion;

    public TarjetaDescuento getTarjetaDescuento() {
        return tarjetaDescuento;
    }

    /**
     *
     */
    private TarjetaDescuento tarjetaDescuento;

    /**
     * @return
     */
    public int getFuncionID() {
        // TODO implement here
        return 0;
    }

    /**
     * @return
     */
    public float getTotal() {
        // TODO implement here
        return 0.0f;
    }

    /**
     * 
     */
    public int getPeliculaID() {
        // TODO implement here
        return 0;
    }

    public Float getTotalVenta() {
        return totalVenta;
    }

    public void setTotalVenta(Float totalVenta) {
        this.totalVenta = totalVenta;
    }

    /**
     * @return
     */
    public TipoTarjeta getTipoTarjeta() {
        // TODO implement here
        return null;
    }

    /**
     * 
     */
    public List<Combo> getListaComboID() {
		return combos;
		
        // TODO implement here
    }

    public float calcularMontoPorComboDeVenta(){
        float total=  0.0f;
        for (Combo combo:getListaComboID()) {
           total =+  (combo.getPrecio()-(combo.getPrecio()*
                   CondicionesDescuento.getDescuentoPorTarjeta(tarjetaDescuento.getTipoTarjeta())));
        }
        return total;
    }


    public float calcularMontoDeLaVentaPorFuncionCombos(){
        return funcion.calcularMontoPorEntradaDeLaPelicula()+calcularMontoPorComboDeVenta();
    }


}