/*
    Pérez Lira Jorge Alberto
    Ingenieria en Sistemas Computacionales
    Programacion Orientada a Objetos
    MS2     15470147
 */
package demoherencia;

/**
 *
 * @author Jorge Perez
 */
public class cuentaBancaria {
    private int numeroDeCuenta;
    private String cliente;
    private double saldo;
    
    public cuentaBancaria (int numeroDeCuenta, String cliente){
        this.cliente = cliente;
        this.numeroDeCuenta = numeroDeCuenta;
        this.saldo =0.0;
    }
    private void NumeroDeCuenta(int numeroDeCuenta){
        this.numeroDeCuenta = numeroDeCuenta;
    }
    private void Cliente(String cliente){
        this.cliente = cliente;
    }
    public void Depositar(double cantidad){
        if (this.puedeDepositar(cantidad)){
            this.saldo = saldo + cantidad;
        }
        else {
            System.out.println("No se puede realizar el deposito.");
        }
    }
    public void Retirar(double cantidad){
        if (this.puedeRetirar(cantidad)){
            this.saldo = saldo - cantidad;
        }
        else {
            System.out.println("No se puede realizar el retiro.");
        }
    }
    public boolean puedeDepositar(double cantidad){
        boolean siSePuedeDepositar = false;
        if (cantidad > 0) {
            siSePuedeDepositar = true;
        }
        return siSePuedeDepositar;
    }
    public boolean puedeRetirar(double cantidad){
        boolean siSePuedeRetirar = false;
        if (cantidad < this.saldo){
            siSePuedeRetirar = true;
        }
        return siSePuedeRetirar;
    }
    public double getSaldo(){
        return this.saldo;
    }
}
