import java.util.Scanner;

// 15.Dadas las edades y alturas de 5 alumnos, mostrar la edad y la estatura media, la cantidad de alumnos mayores de 18 años, y la cantidad de alumnos que miden más de 1.75.

public class DatosAlumnos {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int edad;
    int sumaEdad = 0;
    int sumaAltura = 0;
    double estatura;
    int mayorEdad = 0;
    int mayorAltura = 0;


    for(int i = 1; i <= 5; i++) {
      System.out.println("Introduce la edad del " + i + " Alumno: ");
      edad = scan.nextInt();
      sumaEdad += edad;
      if(edad > 18){
        mayorEdad++;
      }
      System.out.println("Introduce la altura del " + i + " Alumno: ");
      estatura = scan.nextDouble();
      sumaAltura += estatura;
      if(estatura > 1.75) {
        mayorAltura++;
      }

    }

    System.out.println("La media de edad de los alumnos es: " + sumaEdad/5 );
    System.out.println("La media de altura de los alumnos es: " + sumaAltura/5 );

    System.out.println("El numero de alumnos mayores de edad es: " + mayorEdad );
    System.out.println("El numero de alumnos de mayor altura es: " + mayorAltura );




    scan.close();
  }
}