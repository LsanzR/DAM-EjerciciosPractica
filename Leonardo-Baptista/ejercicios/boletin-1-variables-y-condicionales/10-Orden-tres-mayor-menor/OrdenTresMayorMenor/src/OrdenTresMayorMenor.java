import java.util.Scanner;

// 10 Pedir tres números y mostrarlos ordenados de mayor a menor.

public class OrdenTresMayorMenor {
  public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

    int a,b,c;

    System.out.println("Introduce el primer numero:");
    a = scan.nextInt();

    System.out.println("Introduce el segundo numero:");
    b = scan.nextInt(); 

    System.out.println("Introduce el tercer numero:");
    c = scan.nextInt(); 

    if(a > b && a > c && b > c) {
      System.out.println(a + " " + b + " " + c);
    } else if(a > b && a > c && b < c) {
      System.out.println(a + " " + c + " " + b);
    } else if(b > a && b > c && a > c) {
      System.out.println(b + " " + a + " " + c);
    } else if(b > a && b > c && a < c) {
      System.out.println(b + " " + c + " " + a);
    } else if(c > a && c > b && a > b) {
      System.out.println(c + " " + a + " " + b);
    } else {
      System.out.println(c + " " + b + " " + a);
    }

    scan.close();
  }
}
