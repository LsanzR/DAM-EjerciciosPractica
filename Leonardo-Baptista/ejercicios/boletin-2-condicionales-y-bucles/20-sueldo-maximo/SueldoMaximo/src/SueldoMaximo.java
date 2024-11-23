import java.util.Scanner;

//  20.Pedir un número N, introducir N sueldos, y mostrar el sueldo máximo.

public class SueldoMaximo {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Numero de sueldos a introducir:");
    int n = scan.nextInt();

    double sueldoMaximo = 0;
    boolean primerSueldoAsignado = false;
    
    for(int i = 1; i <= n; i++){
      System.out.println("Introduce sueldo:");
      double sueldos = scan.nextDouble();

      if(primerSueldoAsignado == false) {
        sueldoMaximo = sueldos;
        primerSueldoAsignado = true;
      }

      if(sueldos > sueldoMaximo ) {
        sueldoMaximo = sueldos;
      }
    }

    System.out.println("El sueldo maximo es de: " + sueldoMaximo);

    scan.close();
  }
}
