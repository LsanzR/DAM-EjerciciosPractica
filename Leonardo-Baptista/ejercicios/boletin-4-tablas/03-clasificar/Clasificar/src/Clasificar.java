import java.util.Scanner;

// 3. Leer 5 números por teclado y a continuación realizar la media de los números positivos, la media de los negativos y contar el número de ceros.

public class Clasificar {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int contadorCeros = 0;
    int contadorPositivos = 0;
    double contadorNegativos = 0.0;
    int sumaPositivos = 0;
    int sumaNegativos = 0;

    int[] n = new int[5];

    for(int i=0; i<5; i++){
      System.out.println("Introduce el " + (i+1) + " numero:");

      n[i] = scan.nextInt();

      if(n[i] == 0) {
        contadorCeros++;
      } else if(n[i] > 0) {
        contadorPositivos++;
        sumaPositivos += n[i];
      } else if(n[i] < 0) {
        contadorNegativos++;
        sumaNegativos += n[i];
      } else {
        System.out.println("Ha ocurrido un error");
      }
    }

    if(contadorPositivos == 0) {
      System.out.println("No hay numeros positivos");
    } else {
      System.out.println("La media de los numeros positivos es: " + (double)(sumaPositivos / contadorPositivos));
    }

    if(contadorNegativos == 0) {
      System.out.println("No hay numero negativos");
    } else {
      System.out.println("La media de los numero negativos es: " + (sumaNegativos / contadorNegativos));
    }

    if(contadorCeros == 0) 
      System.out.println("No se han introducido ceros");
    else
      System.out.println("Se han introducido " + contadorCeros + " ceros.");
    
    

    scan.close();

  }
}
