import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Persona extends JFrame {
    private JPanel Persona;
    private JButton guardarInformaciónButton;
    private JButton verInformaciónButton;
    private JTextField textField1nombre;
    private JTextField textField2apellido;
    private JTextField textField3direccion;
    private JTextField textField4telefono;
    private JTextField textField5anoNacimiento;
    private JTextField textField6estatura;
    private JTextPane informacionPane1;


    public Persona() {
        setTitle("Información de la Persona");
        setSize(800, 500); // Establece el tamaño de la ventana
        Persona.setBackground(new java.awt.Color(255, 255, 0)); // Establece el color de fondo del JPanel Persona a amarillo}
        guardarInformaciónButton.setBackground(new java.awt.Color(0, 255, 0)); // Establece el color de fondo del botón guardar a verde
        verInformaciónButton.setBackground(new java.awt.Color(0, 0, 255)); // Establece el color de fondo del botón ver a azul
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(Persona); // Establece el contenido de la ventana como el JPanel Persona
        setVisible(true); // Hace visible la ventana

        // Configura los botones para guardar y ver la información
        guardarInformaciónButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String datosPersona =
                        "Nombre: " + textField1nombre.getText() + "\n" +
                        "Apellido: " + textField2apellido.getText() + "\n" +
                        "Dirección: " + textField3direccion.getText() + "\n" +
                        "Teléfono: " + textField4telefono.getText() + "\n" +
                        "Año de Nacimiento: " + textField5anoNacimiento.getText() + "\n" +
                        "Estatura: " + textField6estatura.getText();
                JOptionPane .showMessageDialog(null, datosPersona ,"Información guardada correctamente", JOptionPane.INFORMATION_MESSAGE);


            }
        });
        verInformaciónButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String nombre = textField1nombre.getText();
                String apellido = textField2apellido.getText();
                String direccion = textField3direccion.getText();
                String telefono = textField4telefono.getText();
                String anoNacimiento = textField5anoNacimiento.getText();
                String estatura = textField6estatura.getText();

                informacionPane1.setText("Nombre: " + nombre + "\n" +
                        "Apellido: " + apellido + "\n" +
                        "Dirección: " + direccion + "\n" +
                        "Teléfono: " + telefono + "\n" +
                        "Año de Nacimiento: " + anoNacimiento + "\n" +
                        "Estatura: " + estatura);
            }
        });
    }

}
