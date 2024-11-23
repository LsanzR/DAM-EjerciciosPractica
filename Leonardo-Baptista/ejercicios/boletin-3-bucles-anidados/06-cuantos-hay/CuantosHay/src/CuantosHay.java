import java.util.Scanner;

//6. Realizar un programa que nos pida un número n, y nos diga cuantos números hay entre 1 y n que son primos. 

public class CuantosHay {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int contador = 0;

    System.out.println("Introduce un numero:");
    int n = scan.nextInt();

    for(int i = 1; i <= n; i++) {
     
      for(int j = 2; j <= i-1; j++) {

        if(i%j == 0) {
          System.out.println("El numero "+ i + " no es primo.");
          break;
        } else {
          System.out.println("El numero " + i + " es primo");
          contador++;
          break;
        }
      }
    }

    System.out.println("Tenemos " + contador + " numeros primnos.");

    scan.close();
  }
}
