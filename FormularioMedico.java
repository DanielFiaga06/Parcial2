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
public class FormularioMedico extends JDialog {

    public FormularioMedico(Clinica clinica) {
        setTitle("Registrar Médico");
        setModal(true);
        setSize(350, 250);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(5, 2));

        JLabel lblUsuario = new JLabel("Usuario:");
        JTextField txtUsuario = new JTextField();

        JLabel lblClave = new JLabel("Contraseña:");
        JTextField txtClave = new JTextField();

        JLabel lblNombre = new JLabel("Nombre completo:");
        JTextField txtNombre = new JTextField();

        JLabel lblEspecialidad = new JLabel("Especialidad:");
        JTextField txtEspecialidad = new JTextField();

        JButton btnGuardar = new JButton("Guardar");

        add(lblUsuario);
        add(txtUsuario);
        add(lblClave);
        add(txtClave);
        add(lblNombre);
        add(txtNombre);
        add(lblEspecialidad);
        add(txtEspecialidad);
        add(new JLabel());
        add(btnGuardar);

        btnGuardar.addActionListener(e -> {
            String usuario = txtUsuario.getText().trim();
            String clave = txtClave.getText().trim();
            String nombre = txtNombre.getText().trim();
            String especialidad = txtEspecialidad.getText().trim();

            if (usuario.isEmpty() || clave.isEmpty() || nombre.isEmpty() || especialidad.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios.");
                return;
            }

            clinica.agregarMedico(new Medico(usuario, clave, nombre, especialidad));
            JOptionPane.showMessageDialog(this, "Médico registrado con éxito.");
            dispose();
            Medico medico = null;
            
            clinica.agregarMedico(medico);
            clinica.guardarTodo();
        });
    }
    
}
