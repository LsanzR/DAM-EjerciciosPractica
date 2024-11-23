import java.util.Scanner;

//  18.Igual que el anterior pero suponiendo que no se introduce el precio por litro. Solo existen tres productos con precios:    1- 0,6 €/litro, 2- 3 €/litro y 3- 1,25 €/litro.

public class FacturaEmpresaCodigo {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int codigoArticulo, litros;

    double facturacionTotal = 0;
    int litrosVendidosArticulo1 = 0;
    int facutrasMayoresDe600 = 0;

    for(int i = 1; i <= 3; i++) {
      System.out.println("Factura " + i);

      System.out.println("Introduce el codigo del articulo:");
      codigoArticulo = scan.nextInt();

      System.out.println("Litros:");
      litros = scan.nextInt();

      if(i == 1) {
        litrosVendidosArticulo1 = litros;
      }

      double precioTotal = 0;

      switch(codigoArticulo) {
        case 1: precioTotal = 0.6 * litros;
        break;

        case 2: precioTotal = 3.0 * litros;
        break;

        case 3: precioTotal = 1.25 * litros;
        break;

        default: System.out.println("Error!");
        break;
      }

      if(precioTotal > 600) {
        facutrasMayoresDe600++;
      }

      facturacionTotal += precioTotal;

    }

    System.out.println("La facturacion total es de: " + facturacionTotal);
    System.out.println("Litros del primer artiuclo: " + litrosVendidosArticulo1);
    System.out.println("Facturas mayores de 600eu: " + facutrasMayoresDe600);


    scan.close();
  }
}
