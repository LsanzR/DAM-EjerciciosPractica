import java.util.Scanner;

//  08 Pedir dos números y decir cual es el mayor o si son iguales.

public class EsMayorIgual {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int a, b;

    System.out.println("Introduce un numero: ");
    a = scan.nextInt();

    System.out.println("Introduce el segundo numero: ");
    b = scan.nextInt();

    if(a == b) {
      System.out.println("Los numeros son iguales");
    } else if(a > b){
      System.out.println("El numero " + a + " es mayor que el numero " + b);
    } else {
      System.out.println("El numero " + b + " es mayor que el numero " + a);
    }



    scan.close();
  };
}
