/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import javax.swing.*;
import java.awt.*;
import java.util.List;
/**
 *
 * @author Daniel
 */
public class FormularioConsulta extends JDialog {

    public FormularioConsulta(Clinica clinica) {
        setTitle("Registrar Consulta");
        setModal(true);
        setSize(500, 350);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(6, 2, 10, 10));

        JComboBox<String> cmbPacientes = new JComboBox<>();
        for (Paciente p : clinica.getPacientes()) {
            cmbPacientes.addItem(p.getUsuario());
        }

        JComboBox<String> cmbMedicos = new JComboBox<>();
        for (Medico m : clinica.getMedicos()) {
            cmbMedicos.addItem(m.getUsuario());
        }

        JTextField txtSintomas = new JTextField();
        JTextField txtDiagnostico = new JTextField();
        JTextField txtTratamiento = new JTextField();
        JButton btnGuardar = new JButton("Guardar");

        add(new JLabel("Paciente:")); add(cmbPacientes);
        add(new JLabel("Médico:")); add(cmbMedicos);
        add(new JLabel("Síntomas:")); add(txtSintomas);
        add(new JLabel("Diagnóstico:")); add(txtDiagnostico);
        add(new JLabel("Tratamiento:")); add(txtTratamiento);
        add(new JLabel("")); add(btnGuardar);

        btnGuardar.addActionListener(e -> {
            String sintomas = txtSintomas.getText().trim();
            String diagnostico = txtDiagnostico.getText().trim();
            String tratamiento = txtTratamiento.getText().trim();

            // Aquí debes buscar los objetos reales
            Paciente paciente = clinica.buscarPaciente((String) cmbPacientes.getSelectedItem());
            Medico medico = clinica.buscarMedico((String) cmbMedicos.getSelectedItem());

            if (paciente != null && medico != null) {
                Consulta consulta = new Consulta(paciente, medico, sintomas, diagnostico, tratamiento);
                clinica.agregarConsulta(consulta);
                clinica.guardarTodo();
                JOptionPane.showMessageDialog(this, "Consulta registrada con éxito");
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Error al registrar la consulta.");
            }
            System.out.println("Pacientes encontrados:");
for (Paciente p : clinica.getPacientes()) {
    System.out.println("- " + p.getUsuario());
}
        });
    }
}
