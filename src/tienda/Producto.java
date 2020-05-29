package tienda;
public class Producto implements InterfaceProducto{
    private Object[] productos;
    /********************************************
     *Constructor por defecto que crea un vector*
     *de productos con 20 objetos               *
     ********************************************/
    public Producto(){
        this(20);
    }
    /************************************************
     *Constructor sobrecargado que me crea un vector*
     *con un tamaño de elementos que le paso como   *
     *parametros                                    *
     ************************************************/
    public Producto(int tam){
        productos = new Object[tam <= 0 ? 20: tam];
        for(int i = 0; i < productos.length; i++){
            productos[i] = null;
        }
    }
    /************************************************
     *Constructor sobrecargado que me crea una copia*
     *de otro vector de objetos identico            *
     ************************************************/
    public Producto(Producto p){
        productos = new Object[p.productos.length];
        for(int i = 0; i < p.productos.length;i++){
            productos[i] = p.productos[i];
        }
    }
    /*********************************************
     *Metodo para imprimir los datos que contiene*
     *los productos                              *
     *********************************************/
    public void Imprimir(){
        for(int i = 0;i<productos.length;i++){
            System.out.println(productos[i].toString());
        }
    }
    /**************************************************
     *Metodo para saber si el elemento en esa posicion*
     *esta vacio o no - Requerimiento no funcional    *
     **************************************************/
    public boolean Vacio(){
        for(int i = 0; i < productos.length; i++){
            if(productos[i] != null){
                return false;
            }
        }
        return true;
    }
    /**********************************************
     *Metodo que me reti¿orna el tamaño del vector*
     *de objetos productos, retorna el numero     *
     * Requerimiento no funcional                 *
     **********************************************/
    public int Tamano(){
        int tam =0;
        for(int i = 0; i < productos.length; i++){
            if(productos[i] != null){
                tam++;
            }
        }
        return tam;
    }
    /***************************************************
     *M{etodo que sirve para vaciar todos los elementos*
     *del vector de objetos productos - Requerimiento  *
     *no funcional                                     *
     ***************************************************/
    public void Vaciar(){
        for(int i = 0; i < productos.length; i++){
            productos[i]=null;
        }
    }
    /**********************************************
     *Metodo para saber si el producto lo contiene*
     *el vector de producto y si lo contiene me   *
     *devuelve un true ocaso contrario un false   *
     *Requerimiento no funcional                  *
     **********************************************/
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
    /*********************************************
     *Metodo para eliminar un producto del vector*
     *de objetos si lo elimina devuelve un true  *
     *caso contrario devuelve un false           *
     *Requerimiento no funcional                 *
     *********************************************/
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
    /**********************************************
     *Metodo para agregar un producto al vector de*
     *objetos si lo agrega devuelve un true, caso *
     *contrario devuelve un false                 *
     *Requerimiento no funcional                  *
     **********************************************/
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
    /*********************************************
     *Metodo para editar un producto en el vector*
     *de objetos, si lo modifica devuelve un true*
     *caso contrario devuelve un false           *
     *Requerimiento no funcional                 *
     *********************************************/
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
