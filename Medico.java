
import com.mycompany.usuario.Usuario;
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author  Daniel Camargo
 */

public class Medico extends Usuario implements Agendable {
    private String especialidad;
    private List<Consulta> consultasAgendadas;

    public Medico(String usuario, String contraseña, String nombreCompleto, String especialidad) {
        super(usuario, contraseña, nombreCompleto);
        this.especialidad = especialidad;
        this.consultasAgendadas = new ArrayList<>();
    }

    @Override
    public void agendarConsulta(Consulta consulta) {
        consultasAgendadas.add(consulta);
    }

    @Override
    public List<Consulta> obtenerConsultasAgendadas() {
        return consultasAgendadas;
    }

    @Override
    public String getTipo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String getContraseña() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String getEspecialidad() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }





}
