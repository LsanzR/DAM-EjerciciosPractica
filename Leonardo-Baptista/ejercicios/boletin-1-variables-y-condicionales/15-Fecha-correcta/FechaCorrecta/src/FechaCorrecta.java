import java.util.Scanner;

// 15. Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Suponiendo todos los meses de 30 dias.


public class FechaCorrecta {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Introduce un dia:");
    int dia = scan.nextInt();

    System.out.println("Introduce un mes:");
    int mes = scan.nextInt();

     System.out.println("Introduce un año:");
    int año = scan.nextInt();

    if(dia > 0 && dia < 31 && mes > 0 && mes < 13 && año != 0){
      System.out.println("Fecha correcta!");
    } else if(dia <= 0 || dia >= 31) {
      System.out.println("Dia incorrecto");
    } else if(mes <= 0 || mes >= 13 ) {
      System.out.println("Introduce un mes correcto");
    } else if(año <= 0) {
      System.out.println("Introduce un año valido");
    } else {
      System.out.println("Introduce valores correctos.");
    }

    scan.close();
  }
}
