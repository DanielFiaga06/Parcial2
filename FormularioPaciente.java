/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.awt.GridLayout;
import javax.swing.*;
/**
 *
 * @author Daniel Camargo
 */
public class FormularioPaciente extends JDialog {

    public FormularioPaciente(Clinica clinica) {
        setTitle("Registrar Paciente");
        setModal(true);
        setSize(300, 200);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(4, 2));

        JLabel lblId = new JLabel("ID:");
        JTextField txtId = new JTextField();

        JLabel lblNombre = new JLabel("Nombre:");
        JTextField txtNombre = new JTextField();

        JLabel lblEdad = new JLabel("Edad:");
        JTextField txtEdad = new JTextField();

        JButton btnGuardar = new JButton("Guardar");

        add(lblId);
        add(txtId);
        add(lblNombre);
        add(txtNombre);
        add(lblEdad);
        add(txtEdad);
        add(new JLabel());
        add(btnGuardar);

        btnGuardar.addActionListener(e -> {
            String id = txtId.getText().trim();
            String nombre = txtNombre.getText().trim();
            String edadStr = txtEdad.getText().trim();

            if (id.isEmpty() || nombre.isEmpty() || edadStr.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios.");
                return;
            }

            try {
                int edad = Integer.parseInt(edadStr);
                clinica.agregarPaciente(new Paciente(id, nombre, edad));
                JOptionPane.showMessageDialog(this, "Paciente registrado con éxito.");
                dispose();
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Edad inválida.");
            }
            Paciente paciente = null;
            clinica.agregarPaciente(paciente);
            clinica.guardarTodo();
        });
    }
}

