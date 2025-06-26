
import com.mycompany.usuario.Usuario;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Daniel Camargo
 */
public class Administrativo extends Usuario {
    public Administrativo(String usuario, String contraseña, String nombreCompleto) {
        super(usuario, contraseña, nombreCompleto);
    }

    @Override
    public String getTipo() {
        return "Administrativo";
    }
}
