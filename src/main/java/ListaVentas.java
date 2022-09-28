import java.util.ArrayList;
import java.util.List;

public class ListaVentas {
     static List<Venta> listaVentas=new ArrayList<>();

    public ListaVentas(List<Venta> listaVentas) {
        this.listaVentas = listaVentas;
    }

    public ListaVentas() {
        this.listaVentas = new ArrayList<>();
    }

    public List<Venta> getListaVentas() {
        return listaVentas;
    }

    public void setListaVentas(List<Venta> listaVentas) {
        this.listaVentas = listaVentas;
    }

    public void agregar(Venta venta){
        listaVentas.add(venta);
    }

    public static Venta buscar(String codigo){
        for(Venta v:listaVentas){
            if(v.getCodigo()==codigo){
                return v;
            }
        }
        return null;
    }

    public static void reportarVentas(){
        String codigo;
        codigo=listaVentas.get(0).getCodigo(); //capturé el codigo de la 1era venta
        float totalVenta = 0;




        for(Venta venta: listaVentas){

            if(codigo == venta.getCodigo()) {
                totalVenta = operaciones(venta ,totalVenta);


            }
            else if(codigo != venta.getCodigo()) {
                System.out.println(totalVenta);
                totalVenta = 0;
                codigo = venta.getCodigo();
                totalVenta = operaciones(venta ,totalVenta);

            }


        }

    }

    public static float operaciones(Venta venta, float totalVenta){
        float valorVenta = (venta.getArticulo().getValorCompra() *
                venta.getArticulo().getCategoria().getGanancia() +
                venta.getArticulo().getValorCompra());
        float subTotal = valorVenta * venta.getCantidad();
        totalVenta += subTotal;

        //saber si estoy en la ultima venta
        //listaVentas.get(listaVentas.get(listaVentas.size());
        Venta ultimaVenta;
        ultimaVenta =  listaVentas.get(listaVentas.size()-1);
        if(venta!=ultimaVenta) {
            System.out.println(venta.getCodigo() + " " +
                    venta.getArticulo().getCodigo() + " " +
                    venta.getArticulo().getArticulo() + " " +
                    venta.getCantidad() + " " +
                    valorVenta + " " +
                    subTotal);
        }
        return totalVenta;
    }

}
