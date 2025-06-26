/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.awt.GridLayout;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 *
 * @author Daniel Camargo
 */

   public class VentanaPrincipal extends JFrame {

    private Clinica clinica;

    public VentanaPrincipal(Clinica clinica) {
        this.clinica = clinica;

        setTitle("Gestión Clínica - Menú Principal");
        setSize(300, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 1, 10, 10));

        JButton btnRegistrarPaciente = new JButton("Registrar Paciente");
        JButton btnRegistrarMedico = new JButton("Registrar Médico");
        JButton btnSalir = new JButton("Guardar y Salir");
        JButton btnRegistrarConsulta = new JButton("Registrar Consulta");
        add(btnRegistrarPaciente);
        add(btnRegistrarMedico);
        add(btnSalir);
        add(btnRegistrarConsulta);


        
        btnRegistrarPaciente.addActionListener(e -> {
            new FormularioPaciente(clinica).setVisible(true);
        });

        btnRegistrarMedico.addActionListener(e -> {
            new FormularioMedico(clinica).setVisible(true);
        });
        btnRegistrarConsulta.addActionListener(e -> {
            new FormularioConsulta(clinica).setVisible(true);
        });
        btnSalir.addActionListener(e -> {
            clinica.guardarTodo();
            System.exit(0);
        });
    }
   }
    
    