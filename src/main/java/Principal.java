import java.util.Collections;

public class Principal {
    public static void main(String[] args) {


      ListaCategorias lCategorias = new ListaCategorias();
      ListaArticulos lArticulos = new ListaArticulos();
      ListaVentas lVentas = new ListaVentas();

      LeerArchivo leerArchivo = new LeerArchivo("Granero.txt");

      leerArchivo.leer(lArticulos, lCategorias, lVentas);

        //ordenar las ventas por el codigo
        Collections.sort(lVentas.getListaVentas(),new Comparador());


        System.out.println( ListaCategorias.buscar("0A"));





    }
}
