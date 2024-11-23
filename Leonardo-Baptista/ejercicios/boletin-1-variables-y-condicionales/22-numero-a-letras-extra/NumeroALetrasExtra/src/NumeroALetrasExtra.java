import java.util.Scanner;

// 22.Pedir un número de 0 a 99 y mostrarlo escrito. Por ejemplo, para 56 mostrar: cincuenta y seis.

public class NumeroALetrasExtra {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    int n,unidades,decenas;


    System.out.println("Introduce un numero entre 0 y 99: ");
    n = scan.nextInt();

    unidades = n % 10;
    decenas = (n / 10) % 10;

    if(n >= 0 && n <= 20){
      switch (n) {
        case 0: System.out.println("CERO");
        break;
        case 1: System.out.println("UNO");
        break;
        case 2: System.out.println("DOS");
        break;
        case 3: System.out.println("TRES");
        break;
        case 4: System.out.println("CUATRO");
        break;
        case 5: System.out.println("CINCO");
        break;
        case 6: System.out.println("SEIX");
        break;
        case 7: System.out.println("SIETE");
        break;
        case 8: System.out.println("OCHO");
        break;
        case 9: System.out.println("NUEVE");
        break;
        case 10: System.out.println("DIEZ");
        break;
        case 11: System.out.println("ONCE");
        break;
        case 12: System.out.println("DOCE");
        break;
        case 13: System.out.println("TRECE");
        break;
        case 14: System.out.println("CATORCE");
        break;
        case 15: System.out.println("QUINCE");
        break;
        case 16: System.out.println("DIECISEIS");
        break;
        case 17: System.out.println("DIECISIETE");
        break;
        case 18: System.out.println("DIECIOCHO");
        break;
        case 19: System.out.println("DIECINUEVE");
        break;
        case 20: System.out.println("VEINTE");
        break;
      
        default: System.out.println("ERROR");
          break;
      }
    } else if(n > 20) {
      switch(decenas) {
        case 2 : System.out.print("VEINTI");
        break;
        case 3 : System.out.print("TREINTA");
        break;
        case 4 : System.out.print("CUARENTA");
        break;
        case 5 : System.out.print("CINCUENTA");
        break;
        case 6 : System.out.print("SESENTA");
        break;
        case 7 : System.out.print("SETENTA");
        break;
        case 8 : System.out.print("OCHENTA");
        break;
        case 9 : System.out.print("NOVENTA");
        break;

        default : System.out.println("ERROR");
        break;
      }

      if(decenas != 2 && unidades != 0){
        System.out.print(" Y ");
      }

      switch (unidades) {
        case 0 : System.out.println("");
        break;
        case 1 : System.out.println("UNO");
        break;
        case 2 : System.out.println("DOS");
        break;
        case 3 : System.out.println("TRES");
        break;
        case 4 : System.out.println("CUATRO");
        break;
        case 5 : System.out.println("CINCO");
        break;
        case 6 : System.out.println("SEIS");
        break;
        case 7 : System.out.println("SIETE");
        break;
        case 8 : System.out.println("OCHO");
        break;
        case 9 : System.out.println("NUEVE");
        break;
      }
    }

    scan.close();
  }
}
