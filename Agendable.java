/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.List;
/**
 *
 * @author Daniel Camargo
 */

   public interface Agendable {
    void agendarConsulta(Consulta consulta);
    List<Consulta> obtenerConsultasAgendadas();
} 

