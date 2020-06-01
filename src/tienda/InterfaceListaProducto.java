package tienda;

public interface InterfaceListaProducto extends InterfaceProducto{
	/*
	 * Método para agregar el primer elemento
	 */
	public void AgregarPrimero(Object obj);
	/*
	 * Método para obtener el valor de un objeto
	 * de la lista
	 */
	public Object Obtener(int i);
	/*
	 * Método para eliminar el primer elemento
	 * de la lista
	 */
	public void EliminarPrimero();
}
