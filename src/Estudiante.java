import java.util.Scanner;

public class Estudiante {

    String nombre;
    int legajo;
    double Calificacion1, Calificacion2;

    static int CantidadAprobados = 0;

    public Estudiante(String nombre, int legajo, double Calificacion1, double Calificacion2) {

        this.nombre = nombre;
        this.legajo = legajo;
        this.Calificacion1 = Calificacion1;
        this.Calificacion2 = Calificacion2;

        int CantidadAprobados = 0;

    }
    public double Promedio() {
        return (Calificacion1 + Calificacion2) / 2;
    }

    public boolean Aprobado() {
        return Promedio() >= 6;

    }

    public void MostrarEstudiante() {

        System.out.println("=======Resultados========");
        System.out.println("Nombre: " +nombre);
        System.out.println("Legajo: " +legajo);
        System.out.println("Calificacion1: " +Calificacion1);
        System.out.println("Calificacion2: " +Calificacion2);
        System.out.println("Promedio: " +Promedio());

        //Verifica si estan aprobados o no y un contador para saber cuantos aprobaron

        if (Aprobado()) {
            System.out.println("Aprobado");
            CantidadAprobados++;
        }else  {
            System.out.println("No Aprobado");
        }

    }

    public static void main(String[] args) {

        //Estudiante 1

        System.out.println("Introduce el nombre del estudiante: ");
        Scanner teclado = new Scanner(System.in);
        String nombre = teclado.nextLine();

        System.out.println("Introduce la legajo del estudiante: ");
        int legajo = teclado.nextInt();

        System.out.println("Introduce la Calificacion del estudiante: ");
        Double calificacion1 = teclado.nextDouble();

        System.out.println("Introduce otra Calificacion del estudiante: ");
        Double calificacion2 = teclado.nextDouble();

        teclado.nextLine();

        Estudiante estudiante = new Estudiante(nombre, legajo, calificacion1, calificacion2);
        estudiante.MostrarEstudiante();


        //Estudiante 2


        System.out.println("Introduce el nombre del estudiante: ");
        nombre = teclado.nextLine();

        System.out.println("Introduce la legajo del estudiante: ");
        legajo = teclado.nextInt();

        System.out.println("Introduce la Calificacion del estudiante: ");
        calificacion1 = teclado.nextDouble();

        System.out.println("Introduce otra Calificacion del estudiante: ");
        calificacion2 = teclado.nextDouble();

        teclado.nextLine();

        Estudiante estudiante2 = new Estudiante(nombre, legajo, calificacion1, calificacion2);
        estudiante2.MostrarEstudiante();

        //Estudiante 3

        System.out.println("Introduce el nombre del estudiante: ");

        nombre = teclado.nextLine();

        System.out.println("Introduce la legajo del estudiante: ");
        legajo = teclado.nextInt();

        System.out.println("Introduce la Calificacion del estudiante: ");
        calificacion1 = teclado.nextDouble();

        System.out.println("Introduce otra Calificacion del estudiante: ");
        calificacion2 = teclado.nextDouble();

        teclado.nextLine();

        Estudiante estudiante3 = new Estudiante(nombre, legajo, calificacion1, calificacion2);
        estudiante3.MostrarEstudiante();

        System.out.println("Cantidad de alumnos aprobados: "+Estudiante.CantidadAprobados);
    }
}
