/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;
/**
 *
 * @author Daniel Camargo
 */
public class Clinica {
    private List<Paciente> pacientes;
    private List<Medico> medicos;
    private List<Consulta> consultas;

    public Clinica() {
        pacientes = new ArrayList<>();
        medicos = new ArrayList<>();
        consultas = new ArrayList<>();
    }

    // ---------------- MÉTODOS DE PACIENTE ----------------
    public void registrarPaciente(Paciente paciente) {
        pacientes.add(paciente);
    }

    public Paciente buscarPacientePorId(String id) {
        for (Paciente p : pacientes) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }

    public List<Paciente> getPacientes() {
        return pacientes;
    }

    // ---------------- MÉTODOS DE MÉDICO ----------------
    public void registrarMedico(Medico medico) {
        medicos.add(medico);
    }

    public Medico buscarMedicoPorUsuario(String usuario) {
        for (Medico m : medicos) {
            if (m.getUsuario().equals(usuario)) {
                return m;
            }
        }
        return null;
    }

    public List<Medico> getMedicos() {
        return medicos;
    }

    
    
    public void registrarConsulta(Consulta consulta) {
        consultas.add(consulta);
    }

    public List<Consulta> historialPorPaciente(String idPaciente) {
        List<Consulta> resultado = new ArrayList<>();
        for (Consulta c : consultas) {
            if (c.getPaciente().getId().equals(idPaciente)) {
                resultado.add(c);
            }
        }
        return resultado;
    }

    public List<Consulta> historialPorMedico(String usuarioMedico) {
        List<Consulta> resultado = new ArrayList<>();
        for (Consulta c : consultas) {
            if (c.getMedico().getUsuario().equals(usuarioMedico)) {
                resultado.add(c);
            }
        }
        return resultado;
    }

    public List<Consulta> getConsultas() {
        return consultas;
    }

    

    public void cargarConsultas() {
    this.pacientes = Persistencia.cargarPacientes("data/pacientes.txt");
    this.medicos = Persistencia.cargarMedicos("data/medicos.txt");
    this.consultas = Persistencia.cargarConsultas("data/consultas.txt", pacientes, medicos);
}

  

    public void guardarTodo() {
    Persistencia.guardarPacientes(pacientes, "data/pacientes.txt");
    Persistencia.guardarMedicos(medicos, "data/medicos.txt");
    Persistencia.guardarConsultas(consultas, "data/consultas.txt");
}

    public void agregarMedico(Medico medico) {
    if (medico == null) return;
    this.medicos.add(medico);
}

    public void agregarPaciente(Paciente paciente) {
    if (paciente == null) return;
    this.pacientes.add(paciente);
}

    Paciente buscarPaciente(String usuarioPaciente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    Medico buscarMedico(String usuarioMedico) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void agregarConsulta(Consulta consulta) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}