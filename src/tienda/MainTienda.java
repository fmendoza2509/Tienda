/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tienda;

import java.util.Scanner;

/**
 *
 * @author Franklin
 */
public class MainTienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	/****************************************
    	 * Declaramos un objeto de tipo Scanner *
    	 * para poder ingresar por consola los  *
    	 * datos de cada producto o las opciones*
    	 * requeridas                           *
    	 ****************************************/
    	Scanner lector = new Scanner(System.in);
    	int op,nProd;//Declaramos las variables necesarias
    	System.out.println("Ingrese la cantidad de productos para esta tienda");
    	nProd=lector.nextInt();//Leemos el numero de productos para la tienda
    	Producto tienda = new Producto(nProd);//creamos un vertor de produsctos para la tienda
    	do {
    		System.out.println("Estimado usuario que desea hacer?");
        	System.out.println("1.- Para ingresar productos");
        	System.out.println("2.- Para eliminar productos");
        	System.out.println("3.- Para editar productos");
        	System.out.println("4.- Para imprimir productos");
        	System.out.println("5.- Para salir");
        	op=lector.nextInt();
        	switch (op) {
			case 1:
				Productos p1 = new Productos();
				p1.LeerData();
				if(tienda.Agregar(p1)) {System.out.println("Producto agregado correctamente");};
			break;
			case 2:
			break;
			case 3:
			break;
			case 4:
				tienda.Imprimir();
			break;
			}
		} while (op>0 && op<5);
    	
        /*Productos p1 = new Productos();
        Productos p2 = new Productos();
        p1.LeerData();
        p2.LeerData();
        Producto tienda = new Producto(2);
        if(tienda.Agregar(p1)==true) {System.out.println("Producto agregado correctamente");}
        if(tienda.Agregar(p2)==true) {System.out.println("Producto agregado correctamente");}
        tienda.Imprimir();*/
    }

}
