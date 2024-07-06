package Controller;

import DTO.SalaDTO;
import DTO.SucursalDTO;
import Modelo.Sala;
import Modelo.Sucursal;

import java.util.*;


/**
 * 
 */
public class SucursalController {


	private static SucursalController instancia;
	private List<Sucursal> sucursales;
		
    private SucursalController() {
    	sucursales = new ArrayList<Sucursal>();
    	//sucursales.add(new Sucursal(1, "Barracas", "Av Montes de Oca 1100", null));
    }
    public static SucursalController getInstance(){
        if(instancia==null){
            instancia= new SucursalController();
        }
        return instancia;
    }

    /**
     * @param id 
     * @param denom 
     * @param dir
     */
    public void agregarSucursal(int id, String denom, String dir) {
        // TODO implement here
    }

    /**
     * @param idSucursal 
     * @param salaID 
     * @param denom 
     * @param nroasientos
     */
    public void agregarSala(int idSucursal, int salaID, String denom, int nroasientos) {
        // TODO implement here
    }
    public void agregarSucursalDePrueba(){
        if (sucursales.isEmpty()) {
            Sucursal suc1 = new Sucursal(sucursales.size() + 1, "Cinex abasto", "corriente 3000");
            suc1.addSala(new Sala(suc1.getSalas().size() + 1, 20));
            suc1.addSala(new Sala(suc1.getSalas().size() + 1, 24));
            suc1.addSala(new Sala(suc1.getSalas().size() + 1, 20));
            sucursales.add(suc1);
        }
    }

    public List<Sucursal> getSucursales(){
        return sucursales;
    }

    public Sucursal getSucursalPorID(String sucID){
        int sucursalID = Integer.parseInt(sucID);
        for (Sucursal sucursal : sucursales){
            if(sucursal.getSucursalID() == sucursalID){
                return sucursal;
            }
        }
        return null;
    }

    public List<SucursalDTO> getSucursalesDTO(){
        List<SucursalDTO> sucursalDTOS = new ArrayList<>();
        if(!sucursales.isEmpty()){
            for (Sucursal sucursal : sucursales) {
                List<SalaDTO> salaDTOS = new ArrayList<>();
                for (Sala sala : sucursal.getSalas()){
                    salaDTOS.add(new SalaDTO(
                            String.valueOf(sala.getAsientos()),
                            String.valueOf(sala.getSalaID())
                            ));
                }

                sucursalDTOS.add(new SucursalDTO(
                        salaDTOS,
                        sucursal.getDireccion(),
                        sucursal.getDenominacion(),
                        String.valueOf(sucursal.getSucursalID())
                ));
            }
        }
        return sucursalDTOS;
    }
}