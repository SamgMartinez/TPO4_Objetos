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
    }
    public static PeliculasController getInstance(){
        if(instancia==null){
            instancia = new PeliculasController();
        }
        return instancia;
    }
    public void crearPelicula(PeliculaDTO pelicula){
        TipoGenero tg;
        if(pelicula.getTipoGenero() == "drama") {
            tg = TipoGenero.Drama;
        } else if (pelicula.getTipoGenero()=="romance") {
            tg = TipoGenero.Romance;
        } else if (pelicula.getTipoGenero()=="terror") {
            tg = TipoGenero.Terror;
        }
        else if (pelicula.getTipoGenero()=="biografica") {
            tg = TipoGenero.Biografica;
        }
        else{
            tg = TipoGenero.Suspenso;
        }
        Pelicula pelicula1 = new Pelicula(tg,pelicula.getDirector(),
                Integer.parseInt(pelicula.getDuracionEnMinutos()),pelicula.getNombrePelicula());
        peliculas.add(pelicula1);

    }
    public List<PeliculaDTO> consultarPeliculas(String genero){
        TipoGenero tg;
        if(genero == "drama") {
            tg = TipoGenero.Drama;
        } else if (genero=="romance") {
            tg = TipoGenero.Romance;
        } else if (genero=="terror") {
            tg = TipoGenero.Terror;
        }
        else if (genero=="biografica") {
            tg = TipoGenero.Biografica;
        }
        else{
            tg = TipoGenero.Suspenso;
        }
        List<PeliculaDTO> peliculasDto = new ArrayList<>();

        for(Pelicula peli :peliculas){
            if(peli.getGenero()==tg){
                PeliculaDTO peliculaDTO = new PeliculaDTO(String.valueOf(peli.getGenero()),
                        peli.getNombrePelicula(),String.valueOf(peli.getDuracionEnMinutos()),
                        peli.getDirector());
            peliculasDto.add(peliculaDTO);
            }
        }
        return peliculasDto;
    }

    public Pelicula getPeliPorNombre (String nombre){
        for (Pelicula peli : peliculas){
                if (peli.getNombrePelicula() == nombre){
                    return peli;
            }
        }
        return null;
    }

    public void agregarDatosPrueba(){
        if (peliculas.isEmpty()) {
            crearPelicula(new PeliculaDTO(
                    "romance",
                    "Pelicula de Prueba Romance",
                    "120",
                    "Sam"
            ));
            crearPelicula(new PeliculaDTO(
                    "terror",
                    "Pelicula de Prueba terror",
                    "130",
                    "Sam"
            ));
            crearPelicula(new PeliculaDTO(
                    "suspenso",
                    "Pelicula de Prueba suspenso",
                    "110",
                    "Sam"
            ));
            crearPelicula(new PeliculaDTO(
                    "romance",
                    "Otra Pelicula de Prueba Romance",
                    "122",
                    "Sam"
            ));
        }
    }
}