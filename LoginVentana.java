/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import com.mycompany.usuario.Usuario;
import javax.swing.*;
/**
 *
 * @author Daniel Camargo
 */
public class LoginVentana extends JFrame {
    private JTextField usuarioField;
    private JPasswordField contraseñaField;
    private JButton loginButton;

    public LoginVentana() {
        setTitle("Login");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel usuarioLabel = new JLabel("Usuario:");
        usuarioLabel.setBounds(30, 30, 80, 25);
        add(usuarioLabel);

        usuarioField = new JTextField();
        usuarioField.setBounds(110, 30, 140, 25);
        add(usuarioField);

        JLabel contraseñaLabel = new JLabel("Contraseña:");
        contraseñaLabel.setBounds(30, 70, 80, 25);
        add(contraseñaLabel);

        contraseñaField = new JPasswordField();
        contraseñaField.setBounds(110, 70, 140, 25);
        add(contraseñaField);

        loginButton = new JButton("Iniciar Sesión");
        loginButton.setBounds(80, 110, 120, 30);
        add(loginButton);

        loginButton.addActionListener(e -> {
            String usuario = usuarioField.getText();
            String contraseña = new String(contraseñaField.getPassword());

            ControladorLogin loginController = new ControladorLogin();
            Usuario u = loginController.login(usuario, contraseña);

            if (u != null) {
                JOptionPane.showMessageDialog(this, "Bienvenido " + u.getNombreCompleto() + " (" + u.getTipo() + ")");
                // Aquí abrirías la siguiente ventana de menú principal
            } else {
                JOptionPane.showMessageDialog(this, "Credenciales incorrectas", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new LoginVentana().setVisible(true));
    }
}
