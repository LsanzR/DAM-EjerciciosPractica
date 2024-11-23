import java.util.Scanner;

// 9. Escribir todos los números del 100 al 0 de 7 en 7.

public class RetrocesoEn7 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    for(int i = 100; i >= 0; i-=7){
      System.out.println(i);
    }
  
  
  
  
    scan.close();
  }

}
