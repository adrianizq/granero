import java.util.ArrayList;
import java.util.List;

public class ListaArticulos {
    private static List<Articulo> listaArticulo = new ArrayList<Articulo>();

    public ListaArticulos(List<Articulo> listaArticulo) {
        this.listaArticulo = listaArticulo;
    }

    public ListaArticulos() {
        this.listaArticulo = new ArrayList<>();
    }

    public List<Articulo> getListaArticulo() {
        return listaArticulo;
    }

    public void setListaArticulo(List<Articulo> listaArticulo) {
        this.listaArticulo = listaArticulo;
    }

    public void agregar(Articulo articulo){
        listaArticulo.add(articulo);
    }

    //buscar
    //que tiene que retornar -> un articulo
    //que recibe -> un codigo de articulo String
    public  Articulo buscar(String codigo){
        Articulo articuloVacio = new Articulo();
        articuloVacio.setCodigo("00");
        articuloVacio.setArticulo("Articulo Vacio");
        articuloVacio.setCantidad(0);
        articuloVacio.setValorCompra(0);
        for(Articulo articulo: listaArticulo){
            if(codigo.compareTo(articulo.getCodigo())==0){
                return articulo;
            }
        }
        return articuloVacio;
    }


    public static void reportarArticulos(){
        for(Articulo articulo: listaArticulo){
            System.out.println(articulo.getCodigo() + " " +
                    articulo.getArticulo() + " " +
                    articulo.getCantidad() + " " +
                    articulo.getCategoria().getCategoria());
        }
    }
}
