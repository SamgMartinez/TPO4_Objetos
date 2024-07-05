package Vista;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame implements ActionListener {
private JMenuBar navbar;
private JMenu crearPelicula, crearfuncion, consulPelicula;
private JMenuItem pelDrama, pelRomance, pelTerror, pelBiografica, pelSuspenso;
private JMenuItem funDrama, funRomance, funTerror, funBiografica, funSuspenso;

    public Menu(){
        setTitle("MenuPrincipal");
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        //setLayout();

        // iniciar el menu bar y asociarlo al frame //
        navbar = new JMenuBar();
        setJMenuBar(navbar);

        //Iniciarlizar menus y agregarlos al main  //
        crearPelicula = new JMenu("Crear nueva Pelicula");
        navbar.add(crearPelicula);
        crearfuncion = new JMenu("Crear nueva Funcion");
        navbar.add(crearfuncion);

        // Inicializamos los menus Items de peliculas, y le decimos el texto que va a mostrar //
        pelDrama = new JMenuItem("Drama");
        pelRomance = new JMenuItem("Romance");
        pelTerror = new JMenuItem("Terror");
        pelBiografica = new JMenuItem("Biografica");
        pelSuspenso = new JMenuItem("Suspenso");

        //  Le agregamos el actionListener a cada uno  //
        pelDrama.addActionListener(this);
        pelRomance.addActionListener(this);
        pelTerror.addActionListener(this);
        pelBiografica.addActionListener(this);
        pelSuspenso.addActionListener(this);

        // Se agregan los JmenuItem a su menu correspondiente  //
        crearPelicula.add(pelDrama);
        crearPelicula.add(pelRomance);
        crearPelicula.add(pelTerror);
        crearPelicula.add(pelBiografica);
        crearPelicula.add(pelSuspenso);

        //  Repetimos el proceso con los Jmenu de Funciones  //
        funDrama = new JMenuItem("Drama");
        funRomance = new JMenuItem("Romance");
        funTerror = new JMenuItem("Terror");
        funBiografica = new JMenuItem("Biografica");
        funSuspenso = new JMenuItem("Suspenso");

        funDrama.addActionListener(this);
        funRomance.addActionListener(this);
        funTerror.addActionListener(this);
        funBiografica.addActionListener(this);
        funSuspenso.addActionListener(this);

        crearfuncion.add(funDrama);
        crearfuncion.add(funRomance);
        crearfuncion.add(funTerror);
        crearfuncion.add(funBiografica);
        crearfuncion.add(funSuspenso);

        consulPelicula = new JMenu("Consulta Peliculas");
        consulPelicula.addActionListener(this);
        navbar.add(consulPelicula);

        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
    public static void main(String[] args){
        new Menu();
    }
}
