package FormularioTaller;

import javax.swing.*;
//
public class DatosDocentes extends JFrame {
    private JTextField NombreCompleto;
    private JTextField Facultad;
    private JTextField Carrera;
    private JTextField Edad;
    private JButton limpiarInformacionButton;
    private JPanel panelNotas;

    public DatosDocentes() {
        setTitle("Formulario Notas");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(panelNotas);
        setLocationRelativeTo(null);
        setVisible(true);
//
        limpiarInformacionButton.addActionListener(e -> {
            NombreCompleto.setText("");
            Facultad.setText("");
            Carrera.setText("");
            Edad.setText("");
        });
    }
}




