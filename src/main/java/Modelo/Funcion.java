package Modelo;

import java.util.*;

/**
 * 
 */
public class Funcion {

    public Pelicula getPelicula() {
        return pelicula;
    }
    private Pelicula pelicula;
    private int funcionID;
    private String horario;
    private Date fecha;
    public List<Entrada> getEntradas() {
        return entradas;
    }
    private List<Entrada> entradas;
    private Sala sala;

    public Funcion(Pelicula pelicula, int funcionID, String horario, Date fecha, Sala sala) {
        this.pelicula = pelicula;
        this.funcionID = funcionID;
        this.horario = horario;
        this.fecha = fecha;
        this.sala = sala;
    }

    /**
     * Default constructor
     */
    public Funcion(Date fecha, int funcionID, String horario, List<Entrada> entradas, Sala sala, Pelicula pelicula) {
    	
    	this.entradas = entradas;
    	this.fecha = fecha;
    	this.funcionID = funcionID;
    	this.horario = horario;    	
    	this.sala = sala;
    	this.pelicula = pelicula;
    	
    }



    /**
     * @return
     */
    public int getSalaID() {
        // TODO implement here
        return 0;
    }

    /**
     * @return
     */
    public int getSucursalID() {
        // TODO implement here
        return 0;
    }

    /**
     * @return
     */
    public int getPeliculaID() {
        // TODO implement here
        if(Objects.nonNull(getPelicula().getPeliculaID())){

        }
        return 0;
    }

    /**
     * 
     */
    public int getCantidadAsientosDisponibles() {
    	
		return 0;
        // TODO implement here
    }

    /**
     * @return
     */
    public int getFuncionID() {

        return this.funcionID;
    }

    /**
     * 	
     */
    public Date getFecha() {
		return fecha;
        // TODO implement here
    }

    public float calcularMontoPorEntradaDeLaPelicula(){
        float total = 0.0f;
        for (Entrada entrada:getEntradas()) {
            total = total+ (entrada.getPrecio() -
                    (entrada.getPrecio()*pelicula.getCondicionesDescuento().getDescuento()));
        }
        return total;
    }

}