package Vista;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame implements ActionListener {
private JMenuBar navbar;
private JMenu crearPelicula, crearfuncion;
private JMenuItem pelDrama, pelRomance, pelTerror, pelBiografica, pelSuspenso;
private JMenuItem funDrama, funRomance, funTerror, funBiografica, funSuspenso;

    public Menu(){
        setTitle("MenuPrincipal");
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // iniciar el menu bar y asociarlo al frame //
        navbar = new JMenuBar();
        setJMenuBar(navbar);
        //Iniciarlizar menus y agregarlos al main  //
        crearPelicula = new JMenu("Crear nueva Pelicula");
        navbar.add(crearPelicula);
        crearfuncion = new JMenu("Crear nueva Funcion");
        navbar.add(crearfuncion);
        // Inicializamos los menus Item y agregamos
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
