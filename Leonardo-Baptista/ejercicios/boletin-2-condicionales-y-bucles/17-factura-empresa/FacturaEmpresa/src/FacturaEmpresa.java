import java.util.Scanner;

// 17.Una empresa que se dedica a la venta de desinfectantes necesita un programa para gestionar las facturas.
// En cada factura figura: el código del artículo, la cantidad vendida en litros y el precio por litro.
// Se pide de 5 facturas introducidas: Facturación total, cantidad en litros vendidos del artículo 1 y cuantas facturas se emitieron de más de 600 €.

public class FacturaEmpresa {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int codigoProducto, litros;
    int litrosPrimerProducto = 0;
    double facturacionTotal = 0;
    double precioXLitro;
    int facturasSuperiores600 = 0;

    for(int i = 1; i <= 5; i++) {
      System.out.println("Introduce los datos de la factura: " + i);

      System.out.println("codigo de producto:");
      codigoProducto = scan.nextInt();

      System.out.println("Litros vendidos:");
      litros = scan.nextInt();
      
      if(i == 1){
        litrosPrimerProducto = litros;
      }
      
      System.out.println("Precio por litro:");
      precioXLitro = scan.nextDouble();
      
      double precioTotal = precioXLitro * litros;
      
      if(precioTotal > 600 ){
        facturasSuperiores600++;
      }
      
      facturacionTotal += precioTotal;
    }

    System.out.println("La facturacion total es de: " + facturacionTotal);
    System.out.println("Los litros del primer producto son: " + litrosPrimerProducto);
    System.out.println("Numero de facturas de mas de 600eu: " + facturasSuperiores600);

    scan.close();
  }
}
