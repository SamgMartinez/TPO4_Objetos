package Controller;

import DTO.PeliculaDTO;
import Modelo.Pelicula;
import Tipo.TipoGenero;
import Tipo.TipoProyeccion;

import java.util.*;


/**
 * 
 */
    	
public class PeliculasController {

    /**
     * Default constructor
     */
	private static PeliculasController instancia;
	private List<Pelicula> peliculas;
	
    private PeliculasController() {
    	
    	peliculas= new ArrayList<Pelicula>();
    	peliculas.add(new Pelicula(TipoGenero.Suspenso, "Pelicula1",180 , "Director X")); //, TipoProyeccion.DosD, //Arrays.asList("Actriz Principal", "Actor Secundario"),null));

    }
    public static PeliculasController getInstance(){
        if(instancia==null){
            instancia = new PeliculasController();
        }
        return instancia;
    }
    public void crearPelicula(PeliculaDTO pelicula){
        if(pelicula.getTipoGenero() == "drama"){
            Pelicula pelicu = new Pelicula(TipoGenero.Drama, pelicula.getDirector(),
                    Integer.parseInt(pelicula.getDuracionEnMinutos()),
                    pelicula.getNombrePelicula());
            peliculas.add(pelicu);
        } else if (pelicula.getTipoGenero()=="romance") {
            Pelicula pelicu = new Pelicula(TipoGenero.Romance, pelicula.getDirector(),
                    Integer.parseInt(pelicula.getDuracionEnMinutos()),
                    pelicula.getNombrePelicula());
            peliculas.add(pelicu);
        } else if (pelicula.getTipoGenero()=="terror") {
            Pelicula pelicu = new Pelicula(TipoGenero.Terror, pelicula.getDirector(),
                    Integer.parseInt(pelicula.getDuracionEnMinutos()),
                    pelicula.getNombrePelicula());
            peliculas.add(pelicu);
        }  else if (pelicula.getTipoGenero()=="biografica") {
        Pelicula pelicu = new Pelicula(TipoGenero.Biografica, pelicula.getDirector(),
                Integer.parseInt(pelicula.getDuracionEnMinutos()),
                pelicula.getNombrePelicula());
            peliculas.add(pelicu);
    }else if (pelicula.getTipoGenero()=="suspenso") {
            Pelicula pelicu = new Pelicula(TipoGenero.Suspenso, pelicula.getDirector(),
                    Integer.parseInt(pelicula.getDuracionEnMinutos()),
                    pelicula.getNombrePelicula());
            peliculas.add(pelicu);
        }
    }

    //public List<Pelicula> getPeliculas(P) {
      //  return peliculas;
    //}
}