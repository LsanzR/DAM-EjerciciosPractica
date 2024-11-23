import java.util.Scanner;

// Leer un número y mostrar su cuadrado, repetir el proceso hasta que se introduzca un número negativo.


public class MostrarCuadrado {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int n, cuadrado;

    System.out.println("Introduce un numero: ");
    n = scan.nextInt();

    while(n >= 0){
      cuadrado = n * n;
      System.out.println("El numero: " + n + " al cuadrado es: " + cuadrado);
      System.out.println("Introduce otro numero: ");
      n = scan.nextInt();
    }

    scan.close();
  }
}
