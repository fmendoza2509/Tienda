package tienda;
public class Productos implements InterfaceProducto{
    private Object[] productos;
    public Productos(){
        this(20);
    }
    public Productos(int tam){
        productos = new Object[tam <= 0 ? 20: tam];
        for(int i = 0; i < productos.length; i++){
            productos[i] = null;
        }
    }
    public Productos(Productos p){
        productos = new Object[p.productos.length];
        for(int i = 0; i < p.productos.length;i++){
            productos[i] = p.productos[i];
        }
    }
    public void Imprimir(){
        for(int i = 0;i<productos.length;i++){
            System.out.println(productos[i].toString());
        }
    }
    public boolean Vacio(){
        for(int i = 0; i < productos.length; i++){
            if(productos[i] != null){
                return false;
            }
        }
        return true;
    }
    public int Tamano(){
        int tam;
        for(int i = 0; i < productos.length; i++){
            if(productos[i] != null){
                tam++;
            }
        }
        return tam;
    }
    public void Vaciar(){
        for(int i = 0; i < productos.length; i++){
            productos[i]=null;
        }
    }
    public boolean Contiene(Object elemento){
        if(!Vacio()){
            for(int i=0; i<productos.length;i++){
                if(elemento.equals(productos[i])){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean Eliminar(Object elemento){
        if(!Vacio()){
            for(int i=0;i<productos.length;i++){
                if(elemento.equals(productos[i])){
                    productos[i]=null;
                    return true;
                }
            }
        }
        return false;
    }
    public boolean Agregar(Object elemento){
        if(!Contiene(elemento)){
            for(int i=0;i<productos.length;i++){
                if(productos[i]==null){
                    productos[i]=elemento;
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean Editar(Object elemento){
        for(int i=0;i<productos.length;i++){
            if(Contiene(elemento)==false){
               productos[i]=elemento;
               return true;
            }
        }
        return false;
    }
}
