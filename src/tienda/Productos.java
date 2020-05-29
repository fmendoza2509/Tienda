package tienda;

import java.util.Scanner;

public class Productos {
    private String codigo,nombre;
    private int cant;
    private Scanner lector = new Scanner(System.in);
    public Productos() {
    }

    public Productos(String codigo, String nombre, int cant) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cant = cant;
    }
    /*******************
     * M�todos Setters *
     *******************/
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }
    /*******************
     * M�todos Getters *
     *******************/
    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCant() {
        return cant;
    }
    /***********************************************
     * M�todo para imprimir los datos del productos*
     ***********************************************/
    public String toString() {
    	return getCodigo()+" "+getNombre()+" "+getCant();
    }
    /******************************************
     * M�todo para leer los datos del producto*
     ******************************************/
    public void LeerData() {
    	String cod,nomb;
    	int cant;
    	System.out.println("Ingrese el c�digo del producto");
    	cod = lector.next();
    	setCodigo(cod);
    	System.out.println("Ingrese el nombre del producto");
    	nomb = lector.next();
    	setNombre(nomb);
    	System.out.println("Ingrese la cantidad del producto");
    	cant = lector.nextInt();
    	setCant(cant);
    }
    
}
