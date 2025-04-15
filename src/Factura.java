public class Factura {
    private float productoMayorVenta;
    private float totalVenta;
    private float mayorVenta;
    private String factura;
    private int numVentaF;
    private float sumaVentaF;
    public Factura() {
        productoMayorVenta = 0;
        totalVenta = 0;
        mayorVenta = 0;
        factura = "";
        numVentaF = 1;
        sumaVentaF = 0;
    }
    public Factura(float productoMayorVenta, float totalVenta, float mayorVenta, String factura, int numVentaF, float sumaVentaF) {
        this.productoMayorVenta = productoMayorVenta;
        this.totalVenta = totalVenta;
        this.mayorVenta = mayorVenta;
        this.factura = factura;
        this.numVentaF = numVentaF;
        this.sumaVentaF = sumaVentaF;
    }

    boolean RegistrarVenta(String venta, float costo, int valorVenta){
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
