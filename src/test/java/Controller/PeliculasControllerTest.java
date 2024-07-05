package Controller;

import DTO.PeliculaDTO;
import Modelo.Pelicula;
import Tipo.TipoGenero;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
class PeliculasControllerTest {
    private PeliculasController PC = PeliculasController.getInstance();

    @org.junit.jupiter.api.Test
    void crearPelicula() {
        PC.crearPelicula(new PeliculaDTO(
                "romance",
                "Pelicula de Prueba Romance",
                "120",
                "Sam"
        ));

        Pelicula peli = PC.getPeliPorNombre("Pelicula de Prueba Romance");
        assertEquals(120, peli.getDuracionEnMinutos());
    }

    @org.junit.jupiter.api.Test
    void consultarPeliculas() {
        PC.agregarDatosPrueba();

        List<PeliculaDTO> pelisRomance = PC.consultarPeliculas("romance");

        assertEquals(2, pelisRomance.size());
    }
}