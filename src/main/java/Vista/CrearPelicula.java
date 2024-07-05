package Vista;
import Controller.PeliculasController;
import DTO.PeliculaDTO;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class CrearPelicula extends JFrame implements ActionListener {
    private String genero;
    private  JTextField nombreDirector, duracion, nombrePelicula;
    private JButton guardar, cancelar;

    CrearPelicula (String g){
        genero = g;
        setTitle("Crear pelicula");
        setSize(500,500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4,2, 10,10));
        add(panel);
        JLabel nombre = new JLabel(" Nombre Director");
        panel.add(nombre);
        nombreDirector = new JTextField();
        panel.add(nombreDirector);
        JLabel duracion = new JLabel(" Duracion de la peli");
        panel.add(duracion);
        this.duracion = new JTextField();
        panel.add(this.duracion);
        panel.add(new JLabel(" Nombre de la pelicula"));
        nombrePelicula = new JTextField();
        panel.add(nombrePelicula);
        guardar = new JButton(" Guardar");
        guardar.addActionListener(this);
        panel.add(guardar);
        cancelar = new JButton(" Cancelar");
        cancelar.addActionListener(this);
        panel.add(cancelar);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==cancelar){
            dispose();
        }
        if(e.getSource()==guardar){
            PeliculasController pelicula= PeliculasController.getInstance();
            PeliculaDTO peliculaDTO = new PeliculaDTO(genero,nombrePelicula.getText(),duracion.getText(),nombreDirector.getText());
            pelicula.crearPelicula(peliculaDTO);
            JOptionPane.showMessageDialog(CrearPelicula.this, "Se creo la pelicula: " + nombrePelicula.getText());
            dispose();
        }
    }
}
