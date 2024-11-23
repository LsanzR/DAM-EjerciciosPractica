public class Suma {
  public static void main(String[] args) {

    int suma = 0;
    for(int i = 1; i <= 4; i++){
      for(int j = 3; j > 0; j--){
        suma = i*10 + j;
        System.out.println(suma);
      }
    }
  }
}
