import java.util.Scanner;

public class CuentaBancaria {

    String nombre;
    String numeroCuenta;
    double saldo;

    public CuentaBancaria(String nombre, String numeroCuenta, double saldo) {
        this.nombre = nombre;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;

    }

    public void Depositar(double monto){

        saldo = saldo + monto;

        System.out.println("Depositando monto "+monto);
    }

    public void Retiro(double monto){
        if (monto>=0){
            saldo -= monto;
            System.out.println("Retiro de monto "+monto);
        }else {
            System.out.println("Saldo Insuficiente!");
        }

    }

    public void mostrarEstado(){
        System.out.println("======== Cuenta Actual ========");
        System.out.println("Nombre: "+nombre);
        System.out.println("Numero Cuenta: "+numeroCuenta);
        System.out.println("Saldo Disponible: "+saldo);
        System.out.println("===============================");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CuentaBancaria cuenta1 = new CuentaBancaria("Alex", "001", 5000);
        CuentaBancaria cuenta2 = new CuentaBancaria("Martin", "002", 10000);

        cuenta1.Depositar(5000);
        cuenta2.Depositar(5000);

        cuenta1.mostrarEstado();
        cuenta2.mostrarEstado();
    }
}