import java.util.Scanner;

//5. Leer por teclado dos tablas de 10 números enteros y mezclarlas en una tercera de la forma: el 1º de A, el 1º de B, el 2º de A, el 2º de B, etc.

public class TresArrays {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    int[] n1 = new int[10];
    int[] n2 = new int[10];
    int[] n3 = new int[20];

    for(int i=0; i<10; i++) {
      System.out.println("Introduce el " + (i+1) + " numero del primer array");
      n1[i] = scan.nextInt();
    }

    for(int i=0; i<10; i++) {
      System.out.println("Introduce el " + (i+1) + " numero del segundo array");
      n2[i] = scan.nextInt();
    }

    int j = 0;
    for(int i=0; i<10; i++) {
      n3[j] = n1[i];
      j++;
      n3[j] = n2[i];
      j++;
    }

    System.out.println("El valor del ultimo array es:");
    
    for(int i=0; i<20; i++){
      System.out.println(n3[i]);
    }

    scan.close();
  }
}
