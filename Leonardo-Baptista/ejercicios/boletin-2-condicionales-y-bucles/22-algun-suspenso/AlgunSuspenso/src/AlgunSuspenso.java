import java.util.Scanner;

// 22.Pedir 5 calificaciones de alumnos y decir al final si hay algún suspenso.

public class AlgunSuspenso {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    boolean haySuspenso = false;

    for(int i = 1; i <= 5; i++) {
      System.out.println("Introduce " + i + " nota:");
      int n = scan.nextInt();

      if(n < 5){
        haySuspenso = true;
      }
    }

    if(haySuspenso){
      System.out.println("Hay suspensos");
    } else {
      System.out.println("No hay suspensos");
    }


    scan.close();
  }
}
