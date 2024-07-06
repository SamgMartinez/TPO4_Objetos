package Vista;

import Controller.PeliculasController;
import Controller.SucursalController;
import DTO.PeliculaDTO;
import DTO.SucursalDTO;
import Modelo.Sucursal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class CrearFuncion extends JFrame {
    private PeliculasController PC = PeliculasController.getInstance();
    private SucursalController SC = SucursalController.getInstance();
    private JPanel panel;
    private JScrollPane sPanel;

    public CrearFuncion(String genero){
        PC.agregarDatosPrueba();
        SC.agregarSucursalDePrueba();

        setSize(700,500);
        setTitle("Crear Funcion");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        panel = new JPanel();
        sPanel = new JScrollPane(panel);
        sPanel.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        add(sPanel);

        List<PeliculaDTO> listPeli = PC.consultarPeliculas(genero);
        if (!listPeli.isEmpty()) {
            panel.setLayout(new GridLayout(0, 5, 10, 30));

            // Identificador de columnas //
            panel.add(new JLabel(" Pelicula"));
            panel.add(new JLabel("Director"));
            panel.add(new JLabel("genero"));
            panel.add(new JLabel("Duracion"));
            panel.add(new JLabel(""));

            for (PeliculaDTO peli : listPeli) {
                panel.add(new JLabel(peli.getNombrePelicula()));
                panel.add(new JLabel(peli.getDirector()));
                panel.add(new JLabel(peli.getTipoGenero()));
                panel.add(new JLabel(peli.getDuracionEnMinutos() + " min"));
                JButton elegir = new JButton("Elegir");
                elegir.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        selecSucursal(peli.getNombrePelicula());
                    }
                });
                panel.add(elegir);
            }
        }else{
            panel.add(new JLabel("No hay peliculas disponibles del genero "+ genero));
        }

        setVisible(true);
    }

    public void selecSucursal(String peli){
        panel.removeAll();
        panel.setLayout(new GridLayout(0,3,20,30));
        List<SucursalDTO> sucursales = SC.getSucursalesDTO();

        if (!sucursales.isEmpty()) {
            panel.add(new JLabel("Sucursal Descripcion"));
            panel.add(new JLabel("Direccion"));
            panel.add(new JLabel(""));

            for (SucursalDTO sucursal : sucursales) {
                panel.add(new JLabel(sucursal.getDenominacion()));
                panel.add(new JLabel(sucursal.getDireccion()));
                JButton elegir = new JButton("Elegir");
                elegir.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        selecSala(peli, sucursal);
                    }
                });
                panel.add(elegir);
            }
        }else{
            panel.add(new JLabel("No hay sucursales para elegir"));
        }

        panel.revalidate();
        panel.repaint();
    }

    public void selecSala (String peli, SucursalDTO sucursalDTO){
        panel.removeAll();
        panel.setLayout(new GridLayout(0,3,20,30));

    }
}
