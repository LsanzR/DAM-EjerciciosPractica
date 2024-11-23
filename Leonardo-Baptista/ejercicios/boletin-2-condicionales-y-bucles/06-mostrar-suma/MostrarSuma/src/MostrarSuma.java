import java.util.Scanner;

//  6. Pedir números hasta que se teclee un 0, mostrar la suma de todos los números introducidos.

public class MostrarSuma {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int input;
    int contador = 0;

    do {
      System.out.println("Introduce un numero: ");
      input = scan.nextInt();
      contador += input;
    } while(input != 0);


    System.out.println("La suma total es: " + contador);

    scan.close();
  }
}
