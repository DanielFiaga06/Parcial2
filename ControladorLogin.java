/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import com.mycompany.usuario.Usuario;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Daniel Camargo
 */
public class ControladorLogin {
    private List<Usuario> usuarios;
    
    public ControladorLogin() {
        usuarios = new ArrayList<>();

        // Datos de prueba (puedes cargarlos desde archivo más adelante)
        usuarios.add(new Medico("medico1", "1234", "Dr. Juan Pérez", "Pediatría"));
        usuarios.add(new Administrativo("admin1", "adminpass", "Laura Gómez"));
    }

    public Usuario login(String usuario, String contraseña) {
        for (Usuario u : usuarios) {
            if (u.getUsuario().equals(usuario) && u.verificarContraseña(contraseña)) {
                return u;
            }
        }
        return null;
    }
}
    
    
    

