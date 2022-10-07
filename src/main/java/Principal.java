import java.util.Collections;

public class Principal {
    public static void main(String[] args) {


      ListaCategorias lCategorias = new ListaCategorias();
      ListaArticulos lArticulos = new ListaArticulos();
      ListaVentas lVentas = new ListaVentas();

      LeerArchivo leerArchivo = new LeerArchivo("Granero.txt");

      leerArchivo.leer(lArticulos, lCategorias, lVentas);

        //ordenar las ventas por el codigo
        //Collections.sort(lVentas.getListaVentas(),new Comparador());


        //lCategorias.reportarCategorias();  //bien
        //Categoria cat = lCategorias.buscar("0A"); //bien
        //System.out.println(cat.getCodigo() + " " + cat.getCategoria() + " " + cat.getGanancia());

        //Articulo art = lArticulos.buscar("01");  //bien
        //System.out.println(art.getCodigo() + " " + art.getArticulo());

        lVentas.reportarVentas();





    }
}
