/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.io.*;
import java.util.*;
/**
 *
 * @author Daniel Camargo
 */


    public class Persistencia {

    // ----------- PACIENTES -----------

    public static List<Paciente> cargarPacientes(String ruta) {
        List<Paciente> lista = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(";");
                if (partes.length == 3) {
                    String id = partes[0];
                    String nombre = partes[1];
                    int edad = Integer.parseInt(partes[2]);
                    lista.add(new Paciente(id, nombre, edad));
                }
            }
        } catch (IOException e) {
            System.err.println("Error al cargar pacientes: " + e.getMessage());
        }
        return lista;
    }

    public static void guardarPacientes(List<Paciente> lista, String ruta) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(ruta))) {
            for (Paciente p : lista) {
                pw.println(p.getId() + ";" + p.getNombre() + ";" + p.getEdad());
            }
        } catch (IOException e) {
            System.err.println("Error al guardar pacientes: " + e.getMessage());
        }
    }

    // ----------- MÉDICOS -----------

    public static List<Medico> cargarMedicos(String ruta) {
        List<Medico> lista = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(";");
                if (partes.length == 4) {
                    String usuario = partes[0];
                    String clave = partes[1];
                    String nombre = partes[2];
                    String especialidad = partes[3];
                    lista.add(new Medico(usuario, clave, nombre, especialidad));
                }
            }
        } catch (IOException e) {
            System.err.println("Error al cargar médicos: " + e.getMessage());
        }
        return lista;
    }

    public static void guardarMedicos(List<Medico> lista, String ruta) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(ruta))) {
            for (Medico m : lista) {
                pw.println(m.getUsuario() + ";" + m.getContraseña() + ";" + m.getNombreCompleto() + ";" + m.getEspecialidad());
            }
        } catch (IOException e) {
            System.err.println("Error al guardar médicos: " + e.getMessage());
        }
    }

    // ----------- CONSULTAS -----------

    public static List<Consulta> cargarConsultas(String ruta, List<Paciente> pacientes, List<Medico> medicos) {
        List<Consulta> lista = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(";");
                if (partes.length == 5) {
                    String idPaciente = partes[0];
                    String usuarioMedico = partes[1];
                    String sintomas = partes[2];
                    String diagnostico = partes[3];
                    String tratamiento = partes[4];

                    Paciente paciente = buscarPacientePorId(pacientes, idPaciente);
                    Medico medico = buscarMedicoPorUsuario(medicos, usuarioMedico);

                    if (paciente != null && medico != null) {
                        Consulta c = new Consulta(paciente, medico, sintomas, diagnostico, tratamiento);
                        medico.agendarConsulta(c); // Agregar al médico también
                        lista.add(c);
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Error al cargar consultas: " + e.getMessage());
        }
        return lista;
    }

    public static void guardarConsultas(List<Consulta> lista, String ruta) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(ruta))) {
            for (Consulta c : lista) {
                pw.println(c.getPaciente().getId() + ";" +
                           c.getMedico().getUsuario() + ";" +
                           c.getSintomas() + ";" +
                           c.getDiagnostico() + ";" +
                           c.getTratamiento());
            }
        } catch (IOException e) {
            System.err.println("Error al guardar consultas: " + e.getMessage());
        }
    }

    // ----------- MÉTODOS AUXILIARES -----------

    private static Paciente buscarPacientePorId(List<Paciente> lista, String id) {
        for (Paciente p : lista) {
            if (p.getId().equals(id)) return p;
        }
        return null;
    }

    private static Medico buscarMedicoPorUsuario(List<Medico> lista, String usuario) {
        for (Medico m : lista) {
            if (m.getUsuario().equals(usuario)) return m;
        }
        return null;
    }
}


