import java.util.Scanner;

// 11. Pedir un número entre 0 y 9.999 y decir cuantas cifras tiene.


public class CuantasCIfras {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    String n;

    System.out.println("Escribe un numero entre 0 y 9,999");
    n = scan.nextLine();

    System.out.println("El numero " + n + " tiene " + n.length() + " Cifras.");
  }
}
