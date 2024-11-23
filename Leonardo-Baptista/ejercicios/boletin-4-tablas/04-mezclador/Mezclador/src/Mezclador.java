import java.util.Scanner;

// 4. Leer 10 números enteros. Debemos mostrarlos en el siguiente orden: el primero, el último, el segundo, el penúltimo, el tercero, etc.

public class Mezclador {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    int[] n = new int[10];

    for(int i=0; i<10; i++) {
      System.out.println("Introduce el " + (i+1) + " numero");
      n[i] = scan.nextInt();
    }

    for(int i=0; i<10; i++){
      System.out.println(n[i]);
      System.out.println(n[9-i]);
    }
    
    scan.close();
  }
}
