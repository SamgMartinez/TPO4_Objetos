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


}