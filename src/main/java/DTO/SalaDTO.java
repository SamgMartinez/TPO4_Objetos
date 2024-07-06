package DTO;

public class SalaDTO {
    private String salaID;
    private String denominacion;
    private String asientos;

    public String getSalaID() {
        return salaID;
    }

    public void setSalaID(String salaID) {
        this.salaID = salaID;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public String getAsientos() {
        return asientos;
    }

    public void setAsientos(String asientos) {
        this.asientos = asientos;
    }

    public SalaDTO(String asientos, String salaID) {
        this.asientos = asientos;
        this.salaID = salaID;
    }
}
