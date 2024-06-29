package Controller;

import Modelo.Sucursal;

import java.util.*;


/**
 * 
 */
public class SucursalController {


	private static SucursalController instancia;
	private List<Sucursal> sucursal;
		
    private SucursalController() {
    	sucursal = new ArrayList<Sucursal>();
    	sucursal.add(new Sucursal(1, "Barracas", "Av Montes de Oca 1100", null));
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

}