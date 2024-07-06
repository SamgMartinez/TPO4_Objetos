package DTO;

import Modelo.Sala;

import java.util.ArrayList;
import java.util.List;

public class SucursalDTO {
    private String sucursalID;
    private String denominacion;
    private String direccion;
    private List<SalaDTO> salas = new ArrayList<>();

    public SucursalDTO(List<SalaDTO> salas, String direccion, String denominacion, String sucursalID) {
        this.salas = salas;
        this.direccion = direccion;
        this.denominacion = denominacion;
        this.sucursalID = sucursalID;
    }

    public String getSucursalID() {
        return sucursalID;
    }

    public void setSucursalID(String sucursalID) {
        this.sucursalID = sucursalID;
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

    public List<SalaDTO> getSalasID() {
        return salas;
    }

    public void setSalasID(List<SalaDTO> salasID) {
        this.salas = salasID;
    }
}
