/*    String ventaMediana;
    byte cantVentaMed;
    String ventaChica;
    byte cantVentaCh;
    int numVenta;
    Producto productoDeMasVenta;

    public boolean compararDatosA(int ventaA){
        numVenta++;
        if(ventaMayor.equals(ventaA+"")){
            cantVentaMay++;

            return true;
        }
        if(ventaMediana.equals(ventaA+"")){
            cantVentaMed++;
            return true;
        }
        if(ventaChica.equals(ventaA+"")){
            cantVentaCh++;
            return true;
        }
        else{
            return false;
        }

    }
}*/
public class Comparado {
    byte cantVentaMay;
    String ventaMayor;
    public boolean compararDatosA(String Venta, int cantVentaA) {
        if (cantVentaMay <= cantVentaA) {
            cantVentaMay = (byte) cantVentaA;
            ventaMayor = Venta;
            return true;
        }
        return false;
    }
}
