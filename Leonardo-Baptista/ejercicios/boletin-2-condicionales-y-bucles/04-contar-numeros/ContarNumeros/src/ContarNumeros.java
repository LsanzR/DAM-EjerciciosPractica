import java.util.Scanner;

// 4. Pedir números hasta que se teclee uno negativo, y mostrar cuántos números se han introducido.

public class ContarNumeros {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int n;
    int contador = 0;

    System.out.println("Introduce un numero: ");
    n = scan.nextInt();

    while(n >= 0) {
      System.out.println("Introduce otro numero: ");
      n = scan.nextInt();
      contador++;
    }
    if(contador == 1){
      System.out.println("Has tenido " + contador + " intento");
    }else {
      System.out.println("Has tenido " + contador + " intentos");
    }
    scan.close();
  }
}
