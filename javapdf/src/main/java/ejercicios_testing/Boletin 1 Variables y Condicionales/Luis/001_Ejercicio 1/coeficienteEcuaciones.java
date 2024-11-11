// Pedir los coeficientes de una ecuación e 2º grado, y muestre sus soluciones reales. Si no existen, debe indicarlo.
import java.util.Scanner;


class coeficienteEcuaciones {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        // Solicitamos por pantalla el numero del primer coeficiente
        System.out.println("Porfavor introduce el primer coeficiente de la ecuacion: ");
        double a = input.nextDouble();
        
        // Solicitamos por pantalla el numero del segundo coeficiente
        System.out.println("Porfavor introduce el segundo coeficiente de la ecuacion: ");
        double b = input.nextDouble();

        // Solicitamos por pantalla el numero del tercer coeficiente
        System.out.println("Porfavor introduce el termino independiente de la ecuacion: ");
        double c = input.nextDouble();

        // Calculamos el determinante
        double d = calcularDeterminante(a, b, c);

        // Resolvemos la ecuacion
        resolverEcuacion(a, b, d);

        input.close();
    }




    
    public static double calcularDeterminante(double a, double b, double c) {
        System.out.println("El determinante es: " + ((b * b ) - (4 * a * c)));
        return (b * b ) - (4 * a * c);

    }

   public static void resolverEcuacion(double a, double b, double d){
    if (d < 0) {
        System.out.println("No existen soluciones reales");
    } else {
        double x1 = (- b + Math.sqrt(d)) / (2 * a);
        double x2 = (- b - Math.sqrt(d)) / (2 * a);

        System.out.println("Solucion 1: " + x1);
        System.out.println("Solucion 2: " + x2);

    }
   }
}
