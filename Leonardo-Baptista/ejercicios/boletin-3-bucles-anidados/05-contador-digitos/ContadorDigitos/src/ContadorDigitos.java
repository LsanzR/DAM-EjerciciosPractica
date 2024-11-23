// 5. Necesitamos mostrar un contador con 5 dígitos (X-X-X-X-X), que muestre los números del 0-0-0-0-0 al 9-9-9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E.

public class ContadorDigitos {
  public static void main(String[] args) {
    
    for(int i = 0; i <= 9; i++){
      for(int j = 0; j <= 9; j++) {
        
        for(int k = 0; k <= 9; k++) {

          for(int y = 0; y <= 9; y++){

            for(int h = 0; h <= 9; h++) {
             if(i == 3) {
              System.out.print("E");
             } else {
              System.out.print(i);
             }
             if(j == 3) {
              System.out.print("E");
             } else {
              System.out.print(j);
             }
             if(k == 3) {
              System.out.print("E");
             } else {
              System.out.print(k);
             }
             if(y == 3) {
              System.out.print("E");
             } else {
              System.out.print(y);
             }
             if(h == 3) {
              System.out.print("E");
              System.out.print("\n");
             } else {
              System.out.print(h);
              System.out.println("");
             }
            }
          }
        }
      }
    }
  }
}
