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

        Vehiculo vehiculo = new Vehiculo("Toyota", "Corolla", 150);
        vehiculo.EstadoActual();

        vehiculo.Acelerar(55);
        vehiculo.EstadoActual();

        vehiculo.Frenar(100);
        vehiculo.EstadoActual();

    }
}
