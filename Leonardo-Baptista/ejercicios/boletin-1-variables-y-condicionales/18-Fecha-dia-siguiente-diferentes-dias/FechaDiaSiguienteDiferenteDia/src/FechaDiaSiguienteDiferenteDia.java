import java.util.Scanner;

//  18.Ídem que el ej. 17, suponiendo que cada mes tiene un número distinto de días (suponer que febrero tiene siempre 28 días).

public class FechaDiaSiguienteDiferenteDia {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in); // Instancia de la clase Scanner.

    // Imputs del dia, mes y año.
    System.out.println("Introduce un dia valido:");
    int dia = scan.nextInt();

    System.out.println("Introduce un mes valido");
    int mes = scan.nextInt();

    System.out.println("Introduce un año valido");
    int año = scan.nextInt();

    // Comprobacion de los imputs introducidos.
    if(año>0) {

      if(mes == 2 && dia >=1 && dia <= 28){
        dia++;

        if(dia == 29){ 
          dia = 1;
          mes++;
        }

        System.out.println(dia + "/" + mes + "/" + año); // output fecha bien introducida.

      } else if((mes == 4 || mes == 6 || mes == 9 || mes == 11) && (dia >= 1 && dia <= 30)) {
        dia++;

        if(dia == 31 ){
          dia = 1;
          mes++;
        }

        System.out.println(dia + "/" + mes + "/" + año); // output fecha bien introducida.

      } else if((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && (dia >= 1 && dia <= 31)) {
        dia++;

        if(dia == 32){
          dia = 1;
          mes++;
          if(mes == 13){
            mes = 1;
            año++;
          }
        }
        System.out.println(dia + "/" + mes + "/" + año); // output fecha bien introducida.
      } else {
        System.out.println("Introduce una fecha valida"); // output de fecha mal introducida.
      }

    }

    scan.close();
  }
}
