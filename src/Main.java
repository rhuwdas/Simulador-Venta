import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Factura factura = new Factura();
        Comparado comparado = new Comparado();
        Producto producto ;
        Scanner sc = new Scanner(System.in);
        int i= 0, leave=0;
        while(true){
            producto = new Producto();
            System.out.println("Ingrese el nombre del producto: ");
            String texto = sc.next();
            producto.setNombre(texto);
            System.out.println("Ingrese el precio del producto: ");
            while (!(producto.setPrecio(sc.nextFloat()))) {
                System.out.println("El producto no se encuentra en un parametro incorecto introucalo de nuevo");
            }
            producto.setCodigo("" + 8294042 + i);
            System.out.println("Ingrese una descripción del producto: ");
            texto = "";
            texto = sc.next();
            producto.setDescripcion(texto);
            System.out.println("Ingrese la cantidad de producto: ");
            producto.setCantidad(sc.nextInt());
            System.out.println("Ingrese un valor negativo imprimir la venta: ");
            leave = sc.nextInt();
            factura.RegistrarVenta(producto.getNombre(), producto.getPrecio(), producto.getCantidad());
            comparado.compararDatosA(producto.getNombre(), producto.getCantidad());
            i++;
            if (leave < 0) {
                factura.cerrarFactura();
                break;
            }

        }
        System.out.println("La factura se ha finalizado");
        System.out.println(factura.imprimirFactura());
        System.out.println("EL PRODUCTO MAS COMPRADO ES: "+ comparado.getVentaMayor());
    }
}