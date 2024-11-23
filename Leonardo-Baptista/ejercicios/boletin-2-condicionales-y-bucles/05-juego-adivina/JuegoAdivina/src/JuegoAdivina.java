import java.util.Scanner;

public class JuegoAdivina {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    
    int inputN, rango, randomN;

    System.out.println("Introduce un rango con el que jugar");
    System.out.println("10 facil | 50 medio | 100 dificil");
    rango = scan.nextInt();

    randomN = (int) Math.random() * rango;
    
    System.out.println("Juego iniciado");
    System.out.println("Introduce un numero: ");
    inputN = scan.nextInt();

    while(inputN != randomN){
      if(inputN < randomN) {
        System.out.println("Has elegido un numero mas pequeño");
        System.out.println("Introduce otro numero: ");
        inputN = scan.nextInt();
      } else if(inputN > randomN) {
        System.out.println("Has elegido un numero mayor");
        System.out.println("Introduce otro numero: ");
        inputN = scan.nextInt();
      } else {
        System.out.println("Error!");
      }
    }

    System.out.println("Victoria!");
    scan.close();
  }
}
