package Vista;

import Controller.FuncionController;
import Controller.PeliculasController;
import Controller.SucursalController;
import DTO.FuncionDTO;
import DTO.PeliculaDTO;
import DTO.SalaDTO;
import DTO.SucursalDTO;
import Modelo.Sucursal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.List;

public class CrearFuncion extends JFrame {
    private PeliculasController PC = PeliculasController.getInstance();
    private SucursalController SC = SucursalController.getInstance();
    private FuncionController FC = FuncionController.getInstance();
    private JPanel panel;
    private JScrollPane sPanel;
    private JTextField horario, fecha;

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

        panel.add(new JLabel("Sala ID"));
        panel.add(new JLabel("Asientos"));
        panel.add(new JLabel(""));

        for(SalaDTO salaDTO : sucursalDTO.getSalasID()){
            panel.add(new JLabel(salaDTO.getSalaID()));
            panel.add(new JLabel(salaDTO.getAsientos()));
            JButton elegir = new JButton("Elegir");
            elegir.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    crearfuncion(peli,sucursalDTO.getSucursalID(), salaDTO.getSalaID());
                }
            });
            panel.add(elegir);
        }


        panel.revalidate();
        panel.repaint();
    }

    public void crearfuncion(String peli, String sucursalID, String salaID){
        setSize(400,400);
        panel.removeAll();
        panel.setLayout(new GridLayout(0,2,20,50));

        panel.add(new JLabel("Ingrese el horario: "));
        horario = new JTextField();
        panel.add(horario);

        panel.add(new JLabel("Ingrese la fecha de la funcion"));
        fecha = new JTextField();
        panel.add(fecha);

        JButton guardar = new JButton("Guardar");
        guardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FuncionDTO FDTO = new FuncionDTO(
                        horario.getText(),
                        fecha.getText(),
                        salaID,
                        sucursalID,
                        peli
                );
                try {
                    FC.crearFuncion(FDTO);
                } catch (ParseException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        panel.add(guardar);

        panel.revalidate();
        panel.repaint();
    }
}
