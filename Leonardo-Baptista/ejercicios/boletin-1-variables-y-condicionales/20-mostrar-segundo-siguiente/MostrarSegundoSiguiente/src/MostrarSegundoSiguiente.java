import java.util.Scanner;

// 20.Pedir una hora de la forma hora, minutos y segundos, y mostrar la hora en el segundo siguiente.

public class MostrarSegundoSiguiente {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int h,m,s;

    System.out.println("Introduce hora: ");
    h = scan.nextInt();

    System.out.println("Introduce minutos: ");
    m = scan.nextInt();

    System.out.println("Introduce segundos: ");
    s = scan.nextInt();

    s++;

    if(s > 59){
      s = 0;
      m++;

      if(m > 59){
        m = 0;
        h++;

        if(h > 23) {
          h = 0;
        }
      }
    }

    System.out.println("la hroa es la siguiente: " + h + ":" + m + ":" + s);


    scan.close();
  }
}
