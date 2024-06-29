package Controller;

import Modelo.CondicionesDescuento;

import java.util.*;


/**
 * 
 */
public class DescuentoController {
	// Singleton implementado Sam //
	private static DescuentoController instancia;
	
	private List<CondicionesDescuento> Descuento;
	
    private DescuentoController() {
    	Descuento = new ArrayList<CondicionesDescuento>();
    }

	public static DescuentoController getInstance(){
		if (instancia == null) {
			instancia = new DescuentoController();
		}
		return instancia;
	}

    /**
     * 
     */
    public void ABM() {
	}


}