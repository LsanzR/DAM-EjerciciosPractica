// 3. Diseña una aplicación que muestre las tablas de multiplicar del 1 al 10.

public class TablaMultiplicar {
  public static void main(String[] args) {
    for(int i = 0; i<=10; i++){
      System.out.println("La tabla del " + i);
      for(int j = 0; j<=10; j++) {
        System.out.println(i + " x " + j + " = " + i*j);
      }
    }
  }
}
