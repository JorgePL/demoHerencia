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
public class cuentaDeCheques {
    private int numeroDeCuenta;
    private String cliente;
    private double saldo;
    private int contador;
    
    public cuentaDeCheques (int numeroDeCuenta, String cliente){
        this.cliente = cliente;
        this.numeroDeCuenta = numeroDeCuenta;
        this.saldo = 2000.0;
        this.contador = 0;
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
            this.contador = contador +1;
            this.saldo = saldo - cantidad;
            if (contador > 5){
                saldo = saldo -5;
            }
        }
        else {
            System.out.println("No se puede realizar el retiro, se le cobrara un monto de $100.");
            this.saldo = saldo -100;
        }
    }
    public boolean puedeDepositar(double cantidad){
        boolean siPuedeDepositar = false;
        if (cantidad > 0) {
            siPuedeDepositar = true;
        }
        return siPuedeDepositar;
    }
    public boolean puedeRetirar(double cantidad){
        boolean siPuedeRetirar = false;
        if (cantidad < this.saldo){
            siPuedeRetirar = true;
        }
        return siPuedeRetirar;
    }
    public double getSaldo(){
        return this.saldo;
    }  
}

