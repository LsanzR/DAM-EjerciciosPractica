import java.util.Scanner;
public class areaCirculo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Inicializamos la variable radio que es la llamada al metodo para pedir los datos al usuario
        double radio = solicitarDatos(input);
        // Llamamos al metodo que calcula el area segun los datos registrados en el metodo radio.
        calcularArea(radio);
        input.close();
    }

    public static double solicitarDatos(Scanner input) {
        
        System.out.println("Porfavor introduce el radio del circulo: ");
        double radio = input.nextDouble();
        return radio; 
    }
    public static void calcularArea(double radio) {
        final double pi = Math.PI;
        double area = pi * (radio * radio);
        System.out.println("El resultado del area del circulo es : " + area);
    }
}