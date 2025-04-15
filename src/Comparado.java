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
    private byte cantVentaMay;
    private String ventaMayor;
    public Comparado() {
        cantVentaMay = 0;
        ventaMayor = "";
    }

    public byte getCantVentaMay() {
        return cantVentaMay;
    }

    public void setCantVentaMay(byte cantVentaMay) {
        this.cantVentaMay = cantVentaMay;
    }

    public String getVentaMayor() {
        return ventaMayor;
    }

    public void setVentaMayor(String ventaMayor) {
        this.ventaMayor = ventaMayor;
    }

    public boolean compararDatosA(String Venta, int cantVentaA) {
        if (cantVentaMay <= cantVentaA) {
            cantVentaMay = (byte) cantVentaA;
            ventaMayor = Venta;
            return true;
        }
        return false;
    }
}
