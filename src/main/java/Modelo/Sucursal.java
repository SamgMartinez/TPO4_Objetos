package Modelo;

import java.util.*;

/**
 * 
 */
public class Sucursal {

    private int sucursalID;
    private String denominacion;
    private String direccion;
    private List<Sala> salas = new ArrayList<>();

    /**
     * Default constructor
     */
    public Sucursal(int sucursalID, String denominacion, String direccion, ArrayList<Sala> sala) {
    	this.denominacion = denominacion;
    	this.direccion = direccion;
    	this.sucursalID = sucursalID;
    	this.salas = sala;
    }

    public Sucursal(int sucursalID, String denominacion, String direccion) {
        this.sucursalID = sucursalID;
        this.denominacion = denominacion;
        this.direccion = direccion;
    }

    public void addSala(Sala sala){
        salas.add(sala);
    }

    public List<Sala> getSalas(){
        return salas;
    }

    public Sala getSalaPorID(String salID){
        int salaID = Integer.parseInt(salID);
        for (Sala sala : salas){
            if (salaID == sala.getSalaID()){
                return sala;
            }
        }
        return null;
    }
    /**
     * @return
     */
    public int getSucursalID() {
        // TODO implement here
        return 0;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setSucursalID(int sucursalID) {
        this.sucursalID = sucursalID;
    }

    public void setSalas(List<Sala> salas) {
        this.salas = salas;
    }
}