package Modelo;

import Tipo.TipoGenero;
import Tipo.TipoProyeccion;

import java.util.*;

/**
 * 
 */
public class Pelicula {
    private TipoGenero generoID;
    private String nombrePelicula;
    private int duracionEnMinutos;
    private String director;
    private List<String> actores;
    private TipoProyeccion tipo;
    public Pelicula(TipoGenero generoID, String director, int duracionEnMinutos,
                    String nombrePelicula) {

    this.director = director;
    this.duracionEnMinutos = duracionEnMinutos;
    this.generoID = generoID;
    this.nombrePelicula = nombrePelicula;

    }
    public Pelicula(String nombrePelicula, List<String> actores) {
        this.nombrePelicula = nombrePelicula;
        this.actores = actores;
    }
    public TipoGenero getGeneroID() {
        return generoID;
    }

    public void setGeneroID(TipoGenero generoID) {
        this.generoID = generoID;
    }



    public CondicionesDescuento getCondicionesDescuento() {
        return condicionesDescuento;
    }

    private CondicionesDescuento condicionesDescuento;


    public int getPeliculaID() {
        // TODO implement here
        return 0;
    }
    public TipoGenero getGenero(){
        return this.generoID;
    }

    public String getNombrePelicula() {
        return nombrePelicula;
    }

    public void setNombrePelicula(String nombrePelicula) {
        this.nombrePelicula = nombrePelicula;
    }

    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}