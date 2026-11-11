package interfaz;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import parcial2.parcial;

public class Ventana extends JFrame implements ActionListener {

    private JTextField txtA;
    private JTextField txtB;
    private JTextField txtC;
    private JButton boton;
    private JLabel resultado;

    private parcial logica;

    public Ventana() {

        logica = new parcial();

        setTitle("Calculadora de Raices");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));

        txtA = new JTextField();
        txtB = new JTextField();
        txtC = new JTextField();

        panel.add(new JLabel("Valor de a:"));
        panel.add(txtA);

        panel.add(new JLabel("Valor de b:"));
        panel.add(txtB);

        panel.add(new JLabel("Valor de c:"));
        panel.add(txtC);

        add(panel, BorderLayout.CENTER);

        JPanel panelInferior = new JPanel();

        boton = new JButton("Calcular");
        resultado = new JLabel("Resultado:");

        boton.addActionListener(this);

        panelInferior.add(boton);
        panelInferior.add(resultado);

        add(panelInferior, BorderLayout.SOUTH);

        setVisible(true);}

    public void actionPerformed(ActionEvent e) {

        try {
            double a = Double.parseDouble(txtA.getText());
            double b = Double.parseDouble(txtB.getText());
            double c = Double.parseDouble(txtC.getText());

            String respuesta = logica.calcularRaices(a, b, c);

            resultado.setText(respuesta);} 
          catch (NumberFormatException ex) {
            resultado.setText("Valores invalidos");}
          catch (IllegalArgumentException ex) {
            resultado.setText(ex.getMessage());}}

    public static void main(String[] args) {
        new Ventana();}}