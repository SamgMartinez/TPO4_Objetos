package DTO;

import Modelo.Funcion;

public class FuncionDTO {
    String funcionID;
    String horario;
    String date;
    String salaID;
    String sucursalID;
    String nombrePelicula;

    public FuncionDTO(String funcionID, String horario, String date, String salaID, String sucursalID, String nombrePelicula) {
        this.funcionID = funcionID;
        this.horario = horario;
        this.date = date;
        this.salaID = salaID;
        this.sucursalID = sucursalID;
        this.nombrePelicula = nombrePelicula;
    }

    public FuncionDTO(String horario, String date, String salaID, String sucursalID, String nombrePelicula) {
        this.horario = horario;
        this.date = date;
        this.salaID = salaID;
        this.sucursalID = sucursalID;
        this.nombrePelicula = nombrePelicula;
    }

    public String getFuncionID() {
        return funcionID;
    }

    public void setFuncionID(String funcionID) {
        this.funcionID = funcionID;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSalaID() {
        return salaID;
    }

    public void setSalaID(String salaID) {
        this.salaID = salaID;
    }

    public String getNombrePelicula() {
        return nombrePelicula;
    }

    public void setNombrePelicula(String nombrePelicula) {
        this.nombrePelicula = nombrePelicula;
    }

    public String getSucursalID() {
        return sucursalID;
    }

    public void setSucursalID(String sucursalID) {
        this.sucursalID = sucursalID;
    }
}
