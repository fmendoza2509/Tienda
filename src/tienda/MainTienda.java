/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tienda;

/**
 *
 * @author Franklin
 */
public class MainTienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	//int op,nProd;
        Productos p1 = new Productos();
        p1.LeerData();
        Producto tienda = new Producto(2);
        if(tienda.Agregar(p1)==true) {System.out.println("Producto agregado correctamente");}
    }

}
