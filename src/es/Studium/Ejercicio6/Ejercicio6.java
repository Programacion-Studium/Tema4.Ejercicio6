package es.Studium.Ejercicio6;
import java.awt.*;
/**
 * @author alvaro
 *
 */
public class Ejercicio6 extends Frame
{
	private static final long serialVersionUID = 1L;
	// Creación de una lista con 4 elementos visibles y que no
	// permite multiselección
	List choLista = new List(6, false); //Esto indica la cantidad de elementos que seran visibles, el false indica si podemos o no marcar mas de un elemento de la lista.
	public Ejercicio6()
	{
		setLayout(new FlowLayout());
		setTitle("Lista"); //Titulo de la ventana
		//Añadimos los elementos de la lista
		choLista.add("Álava");
		choLista.add("Albacete");
		choLista.add("Alicante");
		choLista.add("Zaragoza");
		choLista.add("Sevilla");
		choLista.add("Madrid");
		choLista.add("Barcelona");
		choLista.add("Huelva");
		add(choLista); //Añadimos la lista
		setLocationRelativeTo(null);
		setSize(150,150);
		setVisible(true);
	}
	public static void main(String[] args)
	{
		new Ejercicio6(); //Mostramos la lista
	}
}