import java.util.Scanner;

// 10.Pedir 15 números y escribir la suma total.

public class Suma15 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int input;
    int suma = 0;

    for(int i = 1; i <= 15; i++){
      System.out.println("Introduce el numero " + i + " a sumar: ");
      input = scan.nextInt();
      suma += input;
    }

    System.out.println("La suma total de numeros es: " + suma);


    scan.close();
  }
}
