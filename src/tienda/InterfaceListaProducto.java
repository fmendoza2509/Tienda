package tienda;

public interface InterfaceListaProducto extends InterfaceProducto{
	/*
	 * M�todo para agregar el primer elemento
	 */
	public void AgregarPrimero(Object obj);
	/*
	 * M�todo para obtener el valor de un objeto
	 * de la lista
	 */
	public Object Obtener(int i);
	/*
	 * M�todo para eliminar el primer elemento
	 * de la lista
	 */
	public void EliminarPrimero();
}
