package Modelo;

import java.util.*;

/**
 * 
 */
public class Sala {

    private int salaID;
    private String denominacion;
    private int asientos;

    public Sala(int salaID, int asientos) {
        this.salaID = salaID;
        this.asientos = asientos;
    }

    /**
     * Default constructor
     */
    public Sala(int salaID, String denominacion, int asientos) {
    	this.asientos = asientos;
    	this.denominacion = denominacion;
    	this.salaID = salaID;
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
    public int getSalaID() {
        // TODO implement here
        return 0;
    }

    /**
     * @return
     */
    public int getAsientos() {
        return this.asientos;
    }

}