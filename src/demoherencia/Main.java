/*
    Pérez Lira Jorge Alberto
    Ingenieria en Sistemas Computacionales
    Programacion Orientada a Objetos
    MS2     15470147
 */
package demoherencia; import java.util.Scanner;

/**
 *
 * @author Jorge Perez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("¿Que cuenta desea abrir?");
            System.out.println("1 = Bancaria");
            System.out.println("2 = Ahorro");
            System.out.println("3 = Cheques");
            int cuenta = entrada.nextInt();
        
        if (cuenta == 1){    
        System.out.println("Proporcione el numero de la cuenta.");
        int numeroDeCuenta = entrada.nextInt();
        System.out.println("Proporcione el nombre del cliente.");
        String cliente = entrada.next();
        cuentaBancaria cuentaBancaria = 
                new cuentaBancaria(numeroDeCuenta,cliente);
        int contador = 0;
        while (contador == 0){
            System.out.println("¿Que accion desea realizar?");
            System.out.println("1 = Depositar");
            System.out.println("2 = Retirar");
            System.out.println("3 = Finalizar");
            int accion = entrada.nextInt();
            if (accion == 1){
                System.out.println("¿Cuanto dinero deseas depositar?");
                double cantidad = entrada.nextDouble();
                cuentaBancaria.Depositar(cantidad);
            }
            if (accion == 2){
                System.out.println("¿Cuanto dinero deseas retirar?");
                double cantidad = entrada.nextDouble();
                cuentaBancaria.Retirar(cantidad);
            }
            if (accion == 3){
                System.out.println("Fin");
                contador = 1;
            }
            double saldo = cuentaBancaria.getSaldo();
            System.out.println(+saldo);
            }   
        }
    }
    
}
