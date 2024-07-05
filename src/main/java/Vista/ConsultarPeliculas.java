package Vista;

import Controller.PeliculasController;
import DTO.PeliculaDTO;
import Modelo.Pelicula;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class ConsultarPeliculas extends JFrame implements ActionListener {

    JPanel panel;
    JScrollPane sPanel;
    JMenuItem pelDrama, pelRomance, pelTerror, pelBiografica, pelSuspenso;
    PeliculasController PC = PeliculasController.getInstance();

    public ConsultarPeliculas(){
        PC.agregarDatosPrueba();
        setTitle("Consultar Peliculas");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //setLocationRelativeTo(null);
        setSize(700,500);

        JMenuBar navBar = new JMenuBar();
        setJMenuBar(navBar);

        pelDrama = new JMenuItem("Drama");
        pelDrama.addActionListener(this);
        navBar.add(pelDrama);

        pelRomance = new JMenuItem("Romance");
        pelRomance.addActionListener(this);
        navBar.add(pelRomance);

        pelTerror = new JMenuItem("Terror");
        pelTerror.addActionListener(this);
        navBar.add(pelTerror);

        pelBiografica = new JMenuItem("Biograficas");
        pelBiografica.addActionListener(this);
        navBar.add(pelBiografica);

        pelSuspenso = new JMenuItem("Suspenso");
        pelSuspenso.addActionListener(this);
        navBar.add(pelSuspenso);

        panel = new JPanel();
        panel.add(new JLabel("Elija el genero para ver las peliculas disponibles"));
        sPanel = new JScrollPane(panel);
        sPanel.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        sPanel.setHorizontalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

        add(sPanel);

    }

    //Metodos para desplegar las peliculas segun el boton//
    public void desplegarPelis(String genero){
        List<PeliculaDTO> listPeli = PC.consultarPeliculas(genero);
        panel.removeAll();
        if (!listPeli.isEmpty()) {
            panel.setLayout(new GridLayout(0, 4, 10, 30));

            // Identificador de columnas //
            panel.add(new JLabel(" Pelicula"));
            panel.add(new JLabel("Director"));
            panel.add(new JLabel("genero"));
            panel.add(new JLabel("Duracion"));

            for (PeliculaDTO peli : listPeli) {
                panel.add(new JLabel(peli.getNombrePelicula()));
                panel.add(new JLabel(peli.getDirector()));
                panel.add(new JLabel(peli.getTipoGenero()));
                panel.add(new JLabel(peli.getDuracionEnMinutos() + " min"));
            }
        }else{
            panel.add(new JLabel("No hay peliculas disponibles del genero "+ genero));
        }
        panel.revalidate();
        panel.repaint();

    }

    public void desplegar (){
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == pelDrama){
            desplegarPelis("drama");
        }
        if (e.getSource() == pelBiografica){
            desplegarPelis("biografica");
        }
        if (e.getSource() == pelRomance){
            desplegarPelis("romance");
        }
        if (e.getSource() == pelSuspenso){
            desplegarPelis("suspenso");
        }
        if (e.getSource() == pelTerror){
            desplegarPelis("terror");
        }
    }
}
