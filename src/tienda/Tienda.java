package tienda;
public class Tienda {
    private String codigo,nombre;
    private int cant;

    public Tienda() {
    }

    public Tienda(String codigo, String nombre, int cant) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cant = cant;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCant() {
        return cant;
    }
    public String toString() {
    	return getCodigo()+getNombre()+getCant();
    }
    public void LeerData() {
    	
    }
}
