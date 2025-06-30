package formularios;
import javax.swing.*;
import java.awt.*; // Librerías necesarias para el uso de componentes Swing
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Cliente;

public class LoginForm extends JFrame {
    private JPasswordField contraseñaPasswordField;
    private JTextField usuarioTextField;
    private JButton ingresarButton;
    private JPanel LoginForm;

    // Constructor de la clase LoginForm para inicializar la interfaz gráfica
public LoginForm(){
    Cliente cliente = new Cliente("cliente123", "clave456", 1000.0);
    // Diseño de la ventana login
    setSize(350, 500);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //setLayout(new GridLayout(3, 2)); // Usamos un GridLayout para organizar los componentes
    setContentPane(LoginForm);
    pack();
    setLocationRelativeTo(null);

    // Diseño
    LoginForm.setBackground(new Color(230, 240, 250));

    usuarioTextField.setFont(new Font("Arial", Font.PLAIN, 14));
    contraseñaPasswordField.setFont(new Font("Arial", Font.PLAIN, 14));

    ingresarButton.setFont(new Font("Arial", Font.BOLD, 14));
    ingresarButton.setBackground(new Color(76, 175, 80)); // Verde
    ingresarButton.setForeground(Color.WHITE);

    ingresarButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (usuarioTextField.getText().equals(cliente.getUsuario()) &&
                new String(contraseñaPasswordField.getPassword()).equals(cliente.getContraseña())) {
                JOptionPane.showMessageDialog(LoginForm, "Bienvenido " + cliente.getUsuario());
                dispose(); // Cierra la ventana de login

                // Abrimos la ventana del banco
                new BancoForm(cliente).setVisible(true);
            } else {
                JOptionPane.showMessageDialog(LoginForm, "Usuario o contraseña incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    });
  }
}