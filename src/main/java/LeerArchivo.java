


import java.util.*;
import java.io.*;

/**
 *
 * @author YAZMIN
 */
public class LeerArchivo {
    String archivo1;



    public LeerArchivo(String archivo1) {
        this.archivo1 = archivo1;
        }
    
    void leer(//List <Articulo> lArticulos,
              ListaArticulos lArticulos,
              //List <Categoria> lCategorias,
              ListaCategorias lCategorias,
              //List <Venta> lVentas
              ListaVentas lVentas) {
        String c;
        StringBuffer pc1, pc2, pc3, pc4, pc5;
        int i = 0, apar = 0;
        //Aeropuertos ar = new Aeropuertos();
        Articulo articulo = new Articulo();
        //Vuelos vuelo =new Vuelos ();
        Categoria categoria = new Categoria();
        Venta venta = new Venta();

        try {
            BufferedReader br = new BufferedReader(new FileReader(archivo1));
            while ((c = br.readLine()) != null) {
                c = c.trim();
                pc1 = new StringBuffer();
                pc2 = new StringBuffer();
                pc3 = new StringBuffer();
                pc4 = new StringBuffer();
                pc5 = new StringBuffer();


                if (c.length() != 0) {//if1
                    if (c.charAt(0) != '.') {//if2

                        if (c.compareTo("#Articulos") == 0) {
                            apar = 2;
                            i = 0;
                        } else if (c.compareTo("#Categorias") == 0) {
                            apar = 1;
                            i = 0;
                        } else if (c.compareTo("#Ventas") == 0) {
                            apar = 3;
                            i = 0;
                        } else {


                            if (apar == 1 && i > 0) {//Cuando es categoria
                                asignar_cadena(c, pc1, pc2, pc3);
                                categoria = new Categoria(pc1.toString(), pc2.toString(), Float.parseFloat(pc3.toString()));
                                //System.out.println(categoria.getCodigo() + " " + categoria.getCategoria());
                                lCategorias.agregar(categoria);
                            }// fin de else if es categoari
                            else if (apar == 2 && i > 0) {//Cuando es articulos
                                asignar_cadena(c, pc1, pc2, pc3, pc4, pc5);
                                articulo = new Articulo(pc1.toString(), pc2.toString(), ListaCategorias.buscar(pc3.toString()), Integer.parseInt(pc4.toString()), Float.parseFloat(pc5.toString()));
                                lArticulos.agregar(articulo);
                                System.out.println(articulo.getCodigo() + " " + articulo.getArticulo() + " " + articulo.getCategoria());

                            }//del if es un articulo
                            else if (apar == 3 && i > 0) {//Cuando es venta
                                asignar_cadena(c, pc1, pc2, pc3);
                                venta = new Venta(pc1.toString(), ListaArticulos.buscar(pc2.toString()), Integer.parseInt(pc3.toString()));
                                lVentas.agregar(venta);
                            }// fin de else if es venta
                        } //del else
                    } //del if2
                    i++;
                }//del if1
                i++;
            } //del while
            br.close();
        } catch (IOException ioe) {
            System.out.println(ioe);
        }//del catch
    }
        
  /*      File fichero2 = new File(cantidades);
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter(cantidades));
            bw.write("Numero de Aeropuertos: " + LAeropuertos.size() + "\r\n");
            bw.write("Numero de vuelos: " + LVuelos.size() + "\n");
            System.out.println("Numero de Aeropuertos: " + LAeropuertos.size());
            System.out.println("Numero de vuelos: " + LVuelos.size());
            bw.close();
        } catch (IOException ioe){
            ioe.printStackTrace(); 
        }
    }//fin funcion leer archivo
*/
    void asignar_cadena(String c, StringBuffer ... a)  {
        StringTokenizer tokens;
        tokens = new StringTokenizer(c,";"); //StringTokenizer tokens = new StringTokenizer(linea);
        for (StringBuffer x : a){
            x.append(tokens.nextToken());  
        }
    }
    

    

    

    
}//fin de clase LeerArchivo
