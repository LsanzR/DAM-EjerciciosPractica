import java.util.Scanner;

// 16. Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Con meses de 28, 30 y 31  días. sin años bisientos.

public class FechaCorrectaDiferentesDias {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int dia, mes, año;

    System.out.println("Introduce un año superior a 0: ");
    año = scan.nextInt();

    System.out.println("Introduce un mes valido entre 1 y 12: ");
    mes = scan.nextInt();

    System.out.println("Introduce un dia valido");
    dia = scan.nextInt();

    if((año > 0) &&
    (((mes == 2) && dia > 0 && dia < 29) || 
    ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 0 && dia < 31) ||
    ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && dia > 0 && dia < 32 )))
    {
      System.out.println("Fecha correcta!");
    }
    else{
      System.out.println("Introduce una fecha correcta.");
    }

    scan.close();
  }
}
