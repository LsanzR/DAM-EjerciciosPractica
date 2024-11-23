import java.util.Scanner;

// 12. Pedir un número entre 0 y 9.999 y mostrarlo con las cifras al revés.

public class AlReves {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Introduce un numero entre el 0 y el 9.999");
    String stringN = scan.nextLine();

    String reverseN = "";

    for(int i = stringN.length()-1; i >= 0; i--) {
      reverseN += stringN.charAt(i);
    }

    System.out.println(reverseN);
    






    scan.close();
  }
}
