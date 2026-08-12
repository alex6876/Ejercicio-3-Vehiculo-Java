import java.util.Scanner;

public class Vehiculo {
    String Marca;

    String Modelo;

    Double VelocidadActual;

    public Vehiculo(String Marca, String Modelo, Double VelocidadActual) {

        this.Marca = Marca;
        this.Modelo = Modelo;
        this.VelocidadActual = VelocidadActual;

    }

    public double Acelerar(double cantidad) {

        return VelocidadActual += cantidad;

    }

    public void Frenar(double cantidad) {

        VelocidadActual -= cantidad;

        if (VelocidadActual < 0) {

            VelocidadActual = (double) 0;

        }
    }

    public void EstadoActual(){

        System.out.println("===== Información =====");
        System.out.println("Marca: " + Marca);
        System.out.println("Modelo: " + Modelo);
        System.out.println("Velocidad Actual: " + VelocidadActual+ "Km/h");
        System.out.println("============================");
    }


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //Ingresar los datos

        System.out.println("Ingrese Marca: ");
        String Marca = teclado.nextLine();

        System.out.println("Ingrese Modelo: ");
        String Modelo = teclado.nextLine();

        System.out.println("Ingrese Velocidad Actual: ");
        Double VelocidadActual = teclado.nextDouble();

        Vehiculo vehiculo = new Vehiculo(Marca, Modelo, VelocidadActual);
        vehiculo.EstadoActual();

        System.out.println("Ingrese cantidad de aceleración: ");
        double Cantidad = teclado.nextDouble();

        vehiculo.Acelerar(Cantidad);

        vehiculo.EstadoActual();

        System.out.println("Cuanto desea frenar?: ");
        double Frenar = teclado.nextDouble();

        vehiculo.Frenar(Frenar);

        vehiculo.EstadoActual();

    }
}
