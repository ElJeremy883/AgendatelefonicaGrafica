package agendatelefonica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ventanas extends JFrame {

    public JPanel panell;
    JTextField txt1 = new JTextField();
    JTextField txt2 = new JTextField();
    JTextField txt3 = new JTextField();

    public Ventanas() {
        this.setSize(600, 220);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Agenda telefonica");
        Componentes();
    }

    private void Componentes() {
        Paneles();
        Etiquetas();
        Texto();
        Botones();
    }

    private void Paneles() {
        panell = new JPanel();
        this.getContentPane().add(panell);
        panell.setLayout(null);
    }

    private void Etiquetas() {
        JLabel et1 = new JLabel("Telefono");
        et1.setBounds(20, 20, 100, 50);
        panell.add(et1);
        JLabel et2 = new JLabel("Nombre");
        et2.setBounds(20, 60, 100, 50);
        panell.add(et2);
        JLabel et3 = new JLabel("Correo");
        et3.setBounds(20, 100, 100, 50);
        panell.add(et3);
    }

    public void Texto() {
        txt1.setBounds(100, 30, 200, 30);
        panell.add(txt1);
        txt2.setBounds(100, 70, 200, 30);
        panell.add(txt2);
        txt3.setBounds(100, 110, 200, 30);
        panell.add(txt3);
    }

    public void Botones() {
        JButton boton1 = new JButton("Guardar");
        boton1.setBounds(325, 25, 100, 40);
        panell.add(boton1);
        JButton boton2 = new JButton("Buscar");
        boton2.setBounds(450, 25, 100, 40);
        panell.add(boton2);
        JButton boton3 = new JButton("Actualizar");
        boton3.setBounds(325, 105, 100, 40);
        panell.add(boton3);
        JButton boton4 = new JButton("Eliminar");
        boton4.setBounds(450, 105, 100, 40);
        panell.add(boton4);
    }
}
