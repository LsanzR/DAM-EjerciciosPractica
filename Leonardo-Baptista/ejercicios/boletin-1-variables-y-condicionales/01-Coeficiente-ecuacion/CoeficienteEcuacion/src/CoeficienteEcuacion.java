import java.util.Scanner;

// Ejercicio 01 Coeficiente ecuacion de segundo grado.

public class CoeficienteEcuacion {
  public static void main(String[] args) {
    double a, b, c; // numeros a calcular. inputs
    double x1, x2, d; // solucion 1, solucion 2 y discriminante.

    a = introduceNumero();
    b = introduceNumero();
    c = introduceNumero();

    d = ((b*b) -4 * a * c); // resolvemos el determinante.

    if(d < 0) {
      System.out.println("No existen soluciones reales");
    } else {
      x1 = (-b + Math.sqrt(d)) / (2*a);
      x2 = (-b - Math.sqrt(d)) / (2*a);

      System.out.println("x1 es igual a: " + x1); // calculamos solucion 1
      System.out.println("x2 es igual a: " + x2); // calculamos solucion 2
    }
  }

  /**
   * Permite al usuario introducir un numero decimal.
   * @return numero decimal introducido por el usuario.
   */
  public static double introduceNumero() {
    try{
      Scanner scan = new Scanner(System.in);
      System.out.println("Introduce un valor: ");
      double valor = scan.nextDouble();
      return valor;
    }
    catch(Exception e){
      System.out.println("Introduce un valor correcto.");
      introduceNumero();
    }
    return 0.0;
  }
}
