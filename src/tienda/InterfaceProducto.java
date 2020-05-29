package tienda;
public interface InterfaceProducto {
    /*************************************
     *Método para comprobar si esta vacio*
     *************************************/
    public boolean  Vacio();
    /************************************
     *Método para el tamaño del conjunto*
     ************************************/
    public int Tamano();
    /*******************************************************
     *Método para eliminar todos los elementos del conjunto*
     *******************************************************/
    public void Vaciar();
    /*********************************************
     *Método para agregar un elemento al conjunto*
     *********************************************/
    public boolean Agregar(Object elemento);
    /**********************************
     *Método para eliminar un producto*
     **********************************/
    public boolean Eliminar(Object elemento);
    /********************************
     *M�todo para editar un elemento*
     ********************************/
    public boolean Editar(Object elemento);
}
