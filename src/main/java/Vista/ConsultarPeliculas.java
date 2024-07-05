package Vista;

import Controller.PeliculasController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConsultarPeliculas extends JFrame implements ActionListener {

    JPanel panel;
    JMenu pelDrama, pelRomance, pelTerror, pelBiografica, pelSuspenso;
    PeliculasController PC = PeliculasController.getInstance();

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
