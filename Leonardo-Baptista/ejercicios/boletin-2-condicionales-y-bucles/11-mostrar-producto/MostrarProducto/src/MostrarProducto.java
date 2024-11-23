import java.util.Scanner;

// 11.Diseñar un programa que muestre el producto de los 10 primeros números impares.

public class MostrarProducto {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int i = 0;
    int count = 10;
    int producto = 1;

    while(count > 0){
      if(i % 2 != 0){
        producto *= i;
        count--;
      }
      i++;
    }

    System.out.println("El producto de los 10 primeros numeros impares es: " + producto);


    

    scan.close();
  }
}
