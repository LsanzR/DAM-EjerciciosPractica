import java.util.Scanner;

// 21.Pedir una nota numérica entera entre 0 y 10, y mostrar dicha nota de la forma: cero, uno, dos, tres...

public class NotaALetras {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int nota;

    System.out.println("Introduce la nota");
    nota = scan.nextInt();

    switch (nota) {
      case 0: System.out.println("CERO");
      break;
      case 1: System.out.println("UNO");
      break;
      case 2: System.out.println("DOS");
      break;
      case 3: System.out.println("TRES");
      break;
      case 4: System.out.println("CUATRO");
      break;
      case 5: System.out.println("CINCO");
      break;
      case 6: System.out.println("SEIS");
      break;
      case 7: System.out.println("SIETE");
      break;
      case 8: System.out.println("OCHO");
      break;
      case 9: System.out.println("NUEVE");
      break;
      case 10: System.out.println("DIEZ");
      break;
    
      default:
        System.out.println("Introduce una nota correcta");
        break;
    }
    scan.close();
  }
}
