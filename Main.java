/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import javax.swing.*;
/**
 *
 * @author Daniel Camargo
 */
public class Main {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            Clinica clinica = new Clinica();
            clinica.cargarConsultas();
            new VentanaPrincipal(clinica).setVisible(true);
        });
    }
}
    


