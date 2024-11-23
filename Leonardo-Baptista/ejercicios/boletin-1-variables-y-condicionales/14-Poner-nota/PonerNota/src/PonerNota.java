import java.util.Scanner;

// 14. Pedir una nota de 0 a 10 y mostrarla de la forma: Insuficiente, Suficiente, Bien...

public class PonerNota {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Introduce una nota entre 0 y 10");
    int n = scan.nextInt();

    switch (n) {
      case 0:
      case 1:
      case 2:
      case 3:
      case 4:
        System.out.println("Insuficiente");
        break;
      case 5:
        System.out.println("Suficiente");
        break;
      case 6:
      case 7:
        System.out.println("Bien");
        break;
      case 8:
      case 9:
        System.out.println("Notable");
        break;
      case 10:
        System.out.println("Sobresaliente");
        break;
      default:
        System.out.println("ERROR!");
        break;
    }
    scan.close();
  }
}
