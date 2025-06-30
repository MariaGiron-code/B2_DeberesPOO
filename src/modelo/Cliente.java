package modelo;

public class Cliente {
    private String usuario;
    private String contraseña;
    private double saldo;

    public Cliente(String usuario, String contraseña, double saldo) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.saldo = saldo;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double monto) {
        saldo += monto;
    }

    public boolean retirar(double monto) {
        return saldo >= monto;
    }

    public boolean transferir(double monto) {
        return saldo >= monto;
    }
}
