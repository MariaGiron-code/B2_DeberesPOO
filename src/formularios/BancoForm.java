package formularios;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Cliente;

public class BancoForm extends JFrame {
    private JPanel PanelTransacciones;
    private JButton transferirButton;
    private JButton depositarButton;
    private JButton salirButton;
    private JTextArea historial_textArea;
    private JLabel nombreCliente;
    private JLabel saldo;
    private JButton retirarButton;

    private Cliente cliente;

    public BancoForm(Cliente cliente) {
        this.cliente = cliente;

        setContentPane(PanelTransacciones);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setSize(500, 400);
        // Fondo del panel principal
        PanelTransacciones.setBackground(new Color(245, 245, 245));
        JPanel panelTitulo = new JPanel(new GridLayout(2, 1));
        panelTitulo.setBackground(PanelTransacciones.getBackground());
        panelTitulo.add(nombreCliente);
        panelTitulo.add(saldo);
        nombreCliente.setHorizontalAlignment(SwingConstants.CENTER);
        saldo.setHorizontalAlignment(SwingConstants.CENTER);

        // Fuentes
        Font fuenteTitulo = new Font("Arial", Font.BOLD, 18);
        Font fuenteTexto = new Font("Arial", Font.PLAIN, 14);

        // Estilo para etiquetas
        nombreCliente.setFont(fuenteTitulo);
        saldo.setFont(fuenteTexto);

        // Scroll con tamaño limitado para historial
        historial_textArea.setLineWrap(true);
        historial_textArea.setWrapStyleWord(true);
        JScrollPane scroll = new JScrollPane(historial_textArea);
        scroll.setPreferredSize(new Dimension(400, 120));
        // Estilo para JTextArea
        historial_textArea.setFont(fuenteTexto);
        historial_textArea.setBackground(Color.WHITE);
        historial_textArea.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));

        // Panel de botones con espacio entre ellos
        JPanel panelBotones = new JPanel(new GridLayout(2, 2, 15, 15));
        panelBotones.setBackground(PanelTransacciones.getBackground());
        panelBotones.setBorder(BorderFactory.createEmptyBorder(10, 30, 10, 30));
        panelBotones.add(depositarButton);
        panelBotones.add(retirarButton);
        panelBotones.add(transferirButton);
        panelBotones.add(salirButton);
        // Estilo para botones
        estilizarBoton(depositarButton, new Color(33, 150, 243));  // Azul
        estilizarBoton(retirarButton, new Color(33, 150, 243));
        estilizarBoton(transferirButton, new Color(156, 39, 176)); // Morado
        estilizarBoton(salirButton, new Color(244, 67, 54));       //Rojo


// Limpiar y agregar los componentes al panel principal
        PanelTransacciones.setLayout(new BorderLayout(10, 10));
        PanelTransacciones.add(panelTitulo, BorderLayout.NORTH);
        PanelTransacciones.add(panelBotones, BorderLayout.CENTER);
        PanelTransacciones.add(scroll, BorderLayout.SOUTH);


        nombreCliente.setText("Bienvenido, " + cliente.getUsuario());
        actualizarSaldo();

        // Botón Depósito
        depositarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = JOptionPane.showInputDialog("Ingrese el monto a depositar:");
                if (input != null && !input.isEmpty()) {
                    try {
                        double monto = Double.parseDouble(input);
                        if (monto > 0) {
                            cliente.setSaldo(cliente.getSaldo() + monto);
                            historial_textArea.append("Depósito: $" + monto + "\n");
                            actualizarSaldo();
                        } else {
                            mostrarError("El monto debe ser mayor a cero.");
                        }
                    } catch (NumberFormatException ex) {
                        mostrarError("Monto inválido.");
                    }
                }
            }
        });

        // Botón Retiro
        retirarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = JOptionPane.showInputDialog("Ingrese el monto a retirar:");
                if (input != null && !input.isEmpty()) {
                    try {
                        double monto = Double.parseDouble(input);
                        if (monto > 0 && monto <= cliente.getSaldo()) {
                            cliente.setSaldo(cliente.getSaldo() - monto);
                            historial_textArea.append("Retiro: $" + monto + "\n");
                            actualizarSaldo();
                        } else {
                            mostrarError("Fondos insuficientes o monto inválido.");
                        }
                    } catch (NumberFormatException ex) {
                        mostrarError("Monto inválido.");
                    }
                }
            }
        });

        // Botón Transferencia
        transferirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JTextField destinatarioField = new JTextField();
                JTextField montoField = new JTextField();
                Object[] fields = {
                        "Nombre del destinatario:", destinatarioField,
                        "Monto a transferir:", montoField
                };
                int option = JOptionPane.showConfirmDialog(null, fields, "Transferencia", JOptionPane.OK_CANCEL_OPTION);
                if (option == JOptionPane.OK_OPTION) {
                    try {
                        String destinatario = destinatarioField.getText();
                        double monto = Double.parseDouble(montoField.getText());

                        if (monto > 0 && monto <= cliente.getSaldo()) {
                            cliente.setSaldo(cliente.getSaldo() - monto);
                            historial_textArea.append("Transferencia a " + destinatario + ": $" + monto + "\n");
                            actualizarSaldo();
                        } else {
                            mostrarError("Monto inválido o saldo insuficiente.");
                        }
                    } catch (NumberFormatException ex) {
                        mostrarError("Monto inválido.");
                    }
                }
            }
        });

        // Botón Salir
        salirButton.addActionListener(e -> {
            dispose();
            JOptionPane.showMessageDialog(null, "Sesión cerrada.");
        });
    }

    private void actualizarSaldo() {
        saldo.setText("Saldo: $" + String.format("%.2f", cliente.getSaldo()));
    }

    private void mostrarError(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
    }
// Metodo para diseño
    private void estilizarBoton(JButton boton, Color color) {
        boton.setBackground(color);
        boton.setForeground(Color.WHITE);
        boton.setFont(new Font("Arial", Font.BOLD, 14));
        boton.setFocusPainted(false);
    }
}

