import java.util.Scanner;

// 14.Pedir 10 sueldos. Mostrar su suma y cuantos hay mayores de 1000€.

public class PedirSueldos {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int input;
    int inputsum = 0;
    int count = 0;

    for(int i = 0; i < 10; i++){
      System.out.println("Introduce el " + i + " sueldo: ");
      input = scan.nextInt();
      inputsum += input;
      if(input > 1000) {
        count++;
      }
    }

    System.out.println("La suma total es de: " + inputsum + "eu, Mayores de 1000eu hay: " + count );

    scan.close();
  }
}
