import java.util.Scanner;

// 13.Pedir 10 números. Mostrar la media de los números positivos, la media de los números negativos y la cantidad de ceros.

public class MediaPositivoNegativo {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int input;
    int contadorCeros = 0;
    int nPositivos = 0;
    int contadorPositivos = 0;
    int nNegativos = 0;
    int contadorNegativos = 0;

    for(int i = 1; i <= 10; i++) {
      System.out.println("Introduce el " + i + " numero: ");
      input = scan.nextInt();

      if(input == 0){
        contadorCeros++;
      } else if(input > 0) {
        contadorPositivos++;
        nPositivos += input;
      } else if(input < 0) {
        contadorNegativos++;
        nNegativos += input;
      } else {
        System.out.println("Imposible clasificar el numero.");
      }
    }

    if(contadorCeros == 0) {
      System.out.println("No se han introducido ceros");
    } else {
      System.out.println("Se han introducido " + contadorCeros + " ceros.");
    }

    if(contadorNegativos == 0) {
      System.out.println("No se han introducido numeros negativos");
    } else {
      double mediaNegativos = (double) nNegativos / contadorNegativos;
      System.out.println("La media de numeros negativos es: " + mediaNegativos);
    }

    if(contadorPositivos == 0) {
      System.out.println("No se han introducido numeros positivos");
    } else {
      double mediaPositivos = (double) nPositivos / contadorPositivos;
      System.out.println("La media de numeros positivos es: " + mediaPositivos);
    }

    scan.close();
  }
}
