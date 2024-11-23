import java.util.Scanner;

// 13. Pedir un número entre 0 y 9.999, decir si es capicúa

public class Capicua {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);  

    String stringNumeroReversed = "";
    String stringNumero = "";

    System.out.println("Introduce un numero entre 0 y 99.999");
    stringNumero += scan.nextLine();

    for(int i = stringNumero.length()-1; i >= 0; i--) {
      stringNumeroReversed += stringNumero.charAt(i);
    }

    int numero = Integer.parseInt(stringNumero);
    int numeroReversed = Integer.parseInt(stringNumeroReversed);

    if(numero == numeroReversed) {
      System.out.println("Es capicua");
    } else if(numero != numeroReversed) {
      System.out.println("No es capicua");
    } else {
      System.out.println("TOOOOooOooOOOonto");
    }





  }
}
