import java.util.Scanner;

// 06 Pedir dos números y decir si uno es múltiplo del otro.

public class EsMultiple {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    int n1, n2;
   
    System.out.println("Introduce el primer numero: ");
    n1 = scan.nextInt();

    System.out.println("Introduce el segundo numero:");
    n2 = scan.nextInt();

    if(n1 % n2 == 0) {
      System.out.println("Los numeros introducidos son multiples");
    } else{
      System.out.println("Los numero introducidos no son multiples");
    }




    scan.close();
  }
}
