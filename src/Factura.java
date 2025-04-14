public class Factura {
    public float productoMayorVenta;
    public float totalVenta;
    public float mayorVenta;
    public String factura;
    public int numVentaF;
    public float sumaVentaF;
    public Factura() {
        productoMayorVenta = 0;
        totalVenta = 0;
        mayorVenta = 0;
        factura = "";
        numVentaF = 1;
        sumaVentaF = 0;
    }

    boolean RegistrarVenta(String venta,float costo, int valorVenta){
        sumaVentaF = sumaVentaF + costo*valorVenta;
        factura =factura+"\t"+ numVentaF+ "\t"+venta+"\t"+valorVenta+ "\n";
        numVentaF++;
        return true;
    }
    boolean cerrarFactura(){
        factura= factura+ "\n\n"+"El coste a pagar sera:\t"+sumaVentaF;
        return true;
    }
    String imprimirFactura (){
        return factura;
    }

}
