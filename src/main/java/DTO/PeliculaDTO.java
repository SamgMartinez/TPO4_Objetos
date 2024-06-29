package DTO;

import Tipo.TipoProyeccion;

import java.util.List;

public class PeliculaDTO {
    private String tipoGenero;
    private String nombrePelicula;
    private String duracionEnMinutos;
    private String director;
    private List<String> actores;
    private String tipoproyec;

    public PeliculaDTO(String tipoGenero, String nombrePelicula, String duracionEnMinutos, String director) {
        this.tipoGenero = tipoGenero;
        this.nombrePelicula = nombrePelicula;
        this.duracionEnMinutos = duracionEnMinutos;
        this.director = director;
    }

    public PeliculaDTO(String nombrePelicula, List<String> actores) {
        this.nombrePelicula = nombrePelicula;
        this.actores = actores;
    }

    public String getTipoGenero() {
        return tipoGenero;
    }

    public void setTipoGenero(String tipoGenero) {
        this.tipoGenero = tipoGenero;
    }

    public String getNombrePelicula() {
        return nombrePelicula;
    }

    public void setNombrePelicula(String nombrePelicula) {
        this.nombrePelicula = nombrePelicula;
    }

    public String getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public void setDuracionEnMinutos(String duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public List<String> getActores() {
        return actores;
    }

    public void setActores(List<String> actores) {
        this.actores = actores;
    }

    public String getTipoproyec() {
        return tipoproyec;
    }

    public void setTipoproyec(String tipoproyec) {
        this.tipoproyec = tipoproyec;
    }
}
