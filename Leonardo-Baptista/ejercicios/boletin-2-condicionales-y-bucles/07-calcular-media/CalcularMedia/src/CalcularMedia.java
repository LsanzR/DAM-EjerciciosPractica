import java.util.Scanner;

// 7. Pedir números hasta que se introduzca uno negativo, y calcular la media.

public class CalcularMedia {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int input = 0;
    int contador = 0;
    int suma = 0;

    do{
      
      System.out.println("Introduce un numero: ");
      input = scan.nextInt();
      if(input >= 0) {
        suma+=input;
        contador++;
      }

    } while(input >= 0);

    if(contador == 0){
      System.out.println("No se puede dividir por 0");
    } else {
      double media = (double) suma / contador;
      System.out.println("La media de todos los numeros introducidos es: " + media);
    }

    




    scan.close();
  }
}
