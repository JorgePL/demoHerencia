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
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("¿Cual de las siguientes cuentas desea abrir?");
        System.out.print("Bancaria = Presione 1, ");
        System.out.print(" Ahorro = Presione 2, ");
        System.out.println("Cheques = Presione 3");
            int cuenta = entrada.nextInt();
            
        cliente clienteObjeto = new cliente();
            
        if (cuenta == 1){
            System.out.println("Ingrese el numero de la cuenta:");
                int numeroDeCuenta = entrada.nextInt();
            System.out.println("Ingrese el nombre del cliente:");
                String nombreCliente = entrada.next();
                clienteObjeto.setNombre(nombreCliente);
            
            System.out.println("Ingrese el apellido del cliente.");
                String apellidoCliente = entrada.next();
                clienteObjeto.setApellido(apellidoCliente);
            
            System.out.println("Ingrese la fecha de nacimiento del cliente.");
                String nacimientoCliente = entrada.next();
                clienteObjeto.setfechaDeNacimiento(nacimientoCliente);
        
            System.out.println("Ingrese la direccion del cliente.");
                String direccionCliente = entrada.next();
                clienteObjeto.setdireccion(direccionCliente);
         
            System.out.println("Ingrese la ocupacion del cliente.");
                String ocupacionCliente = entrada.next();
                clienteObjeto.setocupacion(ocupacionCliente);
        
            System.out.println("Ingrese el telefono del cliente.");
                String telefonoCliente = entrada.next();
                clienteObjeto.settelefono(telefonoCliente);
            
            System.out.println("Ingrese el email del cliente.");
                String emailCliente = entrada.next();
                clienteObjeto.setemail(emailCliente);
            
            System.out.println(clienteObjeto);
            
            cuentaBancaria cuentaBancaria = 
                new cuentaBancaria(numeroDeCuenta,nombreCliente);
        int contador = 0;
        while (contador == 0){
            
            System.out.println("¿Que accion desea realizar?");
            System.out.print("Depositar = Presione 1, ");
            System.out.print("Retirar = Presione 2, ");
            System.out.println("Finalizar = Presione 3");
            int operacion = entrada.nextInt();
            
            if (operacion == 1){
                System.out.println("¿Que cantidad desea depositar?");
                double cantidadADepositar = entrada.nextDouble();
                    cuentaBancaria.Depositar(cantidadADepositar);
            }
            if (operacion == 2){
                System.out.println("¿Que cantidad desea retirar?");
                double cantidadARetirar = entrada.nextDouble();
                    cuentaBancaria.Retirar(cantidadARetirar);
            }
            if (operacion == 3){
                System.out.println("Gracias por su operacion");
                contador = 1;
            }
            double saldo = cuentaBancaria.getSaldo();
            System.out.println(+saldo);
            }   
        }
        if(cuenta == 2){
            System.out.println("Ingrese el numero de la cuenta.");
            int numeroDeCuenta = entrada.nextInt();
            
            System.out.println("Ingrese el nombre del cliente.");
                String nombreCliente = entrada.next();
                clienteObjeto.setNombre(nombreCliente);
            
            System.out.println("Ingrese el apellido del cliente.");
                String apellidoCliente = entrada.next();
                clienteObjeto.setApellido(apellidoCliente);
            
            System.out.println("Ingrese la fecha de nacimiento del cliente.");
                String nacimientoCliente = entrada.next();
                clienteObjeto.setfechaDeNacimiento(nacimientoCliente);
        
            System.out.println("Ingrese la direccion del cliente.");
                String direccionCliente = entrada.next();
                clienteObjeto.setdireccion(direccionCliente);
         
            System.out.println("Ingrese la ocupacion del cliente.");
                String ocupacionCliente = entrada.next();
                clienteObjeto.setocupacion(ocupacionCliente);
        
            System.out.println("Ingrese el telefono del cliente.");
                String telefonoCliente = entrada.next();
                clienteObjeto.settelefono(telefonoCliente);
            
            System.out.println("Ingrese el email del cliente.");
                String emailCliente = entrada.next();
                clienteObjeto.setemail(emailCliente);
            
            System.out.println(clienteObjeto);
            
            cuentaDeAhorro nuevaCuenta = 
                    new cuentaDeAhorro(numeroDeCuenta,nombreCliente);
            
            System.out.println(nuevaCuenta.getSaldo());
                nuevaCuenta.Depositar(200);
            System.out.println(nuevaCuenta.getSaldo());
                nuevaCuenta.corteMensual();
            System.out.println(nuevaCuenta.getSaldo());    
                nuevaCuenta.Retirar(500);
            System.out.println(nuevaCuenta.getSaldo());
                nuevaCuenta.corteMensual();
            System.out.println(nuevaCuenta.getSaldo());
        }
        if (cuenta == 3){    
        System.out.println("Ingrese el numero de la cuenta.");
        int numeroDeCuenta = entrada.nextInt();
        
        System.out.println("Ingrese el nombre del cliente.");
            String nombreCliente = entrada.next();
            clienteObjeto.setNombre(nombreCliente);
            
        System.out.println("Ingrese el apellido del cliente.");
            String apellidoCliente = entrada.next();
            clienteObjeto.setApellido(apellidoCliente);
            
        System.out.println("Ingrese la fecha de nacimiento del cliente.");
            String nacimientoCliente = entrada.next();
            clienteObjeto.setfechaDeNacimiento(nacimientoCliente);
        
        System.out.println("Ingrese la direccion del cliente.");
            String direccionCliente = entrada.next();
            clienteObjeto.setdireccion(direccionCliente);
         
        System.out.println("Ingrese la ocupacion del cliente.");
            String ocupacionCliente = entrada.next();
            clienteObjeto.setocupacion(ocupacionCliente);
        
        System.out.println("Ingrese el telefono del cliente.");
            String telefonoCliente = entrada.next();
            clienteObjeto.settelefono(telefonoCliente);
            
        System.out.println("Ingrese el email del cliente.");
            String emailCliente = entrada.next();
            clienteObjeto.setemail(emailCliente);
            
        System.out.println(clienteObjeto);
        
        cuentaDeCheques cuentaDeCheques = 
                new cuentaDeCheques(numeroDeCuenta,nombreCliente);
        int contador = 0;
        while (contador == 0){
            
            System.out.println("¿Que operacion desea realizar?");
            System.out.print("Depositar = Presione 1, ");
            System.out.print("Retirar = Presione 2, ");
            System.out.println("Finalizar = Presione 3");
            int accion = entrada.nextInt();
            if (accion == 1){
                System.out.println("¿Que cantidad desea depositar?");
                double cantidadADepositar = entrada.nextDouble();
                    cuentaDeCheques.Depositar(cantidadADepositar);
            }
            if (accion == 2){
                System.out.println("¿Que cantidad desea retirar?");
                double cantidadADepositar = entrada.nextDouble();
                    cuentaDeCheques.Retirar(cantidadADepositar);
            }
            if (accion == 3){
                System.out.println("Gracias por su operacion");
                contador = 1;
            }
            double saldo = cuentaDeCheques.getSaldo();
            System.out.println( + saldo);
            }   
        }
    }
}    
