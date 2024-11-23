import java.util.Scanner;

//  19.Dadas 6 notas, escribir la cantidad de alumnos aprobados, condicionados (=4) y suspensos.

public class DecirAprobados {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int nota;
    int aprobados = 0;
    int condicionados = 0;
    int suspensos = 0;

    for(int i = 1; i <= 6; i++) {
      System.out.println("nota alumno " + i + ":");
      nota = scan.nextInt();

      switch (nota) {
        case 0: 
        case 1:
        case 2:
        case 3: suspensos++;
          break;
        case 4: condicionados++;
          break;
        case 5: 
        case 6:
        case 7:
        case 8:
        case 9:
        case 10: aprobados++;
          break;
        default: System.out.println("Introduce una nota correcta.");
          break;
      }
    }

    System.out.println("El numero de aprobados es: " + aprobados);
    System.out.println("El numero de condicionados es: " + condicionados);
    System.out.println("El numero de suspensos es: " + suspensos);

    scan.close();
  }
}
