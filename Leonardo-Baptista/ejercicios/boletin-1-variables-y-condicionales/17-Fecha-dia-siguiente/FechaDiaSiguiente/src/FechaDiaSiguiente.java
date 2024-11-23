import java.util.Scanner;

// 17.  Pedir el día, mes y año de una fecha correcta y mostrar la fecha del día siguiente. suponer que todos los meses tienen 30 días.



public class FechaDiaSiguiente {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    int dia, mes, año;

    System.out.println("Introduce un dia valido entre 1 y 30: ");
    dia = scan.nextInt();

    System.out.println("Introduce un mes valido entre 1 y 12: ");
    mes = scan.nextInt();

    System.out.println("Introduce un año valido superior a 0: ");
    año = scan.nextInt();

    if((dia > 0 && dia < 31) && (mes > 0 && mes < 13) && (año > 0))
    {
      dia++;
      if (dia == 31) {
        dia = 1;
        mes++;
      }

      if(mes == 13) {
        mes = 1;
        año++;
      }

      System.out.println("Dia siguiente: " + dia + "/" + mes + "/" + año);
    } else {
      System.out.println("Introduce una fecha correcta.");
    }



    
    scan.close();
  }
}
