package es.Studium.Ejercicio6;


import java.awt.*;
public class Vista extends Frame {
	private static final long serialVersionUID = 1L;
	// Creaci�n de una lista con 4 elementos visibles y que no
		// permite multiselecci�n
		List choLista = new List(4, false); //Esto indica la cantidad de elementos que seran visibles, el false indica si podemos o no marcar mas de un elemento de la lista.
	
	public Vista() {
		setLayout(new FlowLayout());
		setTitle("Lista"); //Titulo de la ventana
		//A�adimos los elementos de la lista
		choLista.add("Baloncesto Fuenlabrada");
		choLista.add("Vilbao Basket");
		choLista.add("Cajasol");
		choLista.add("Valencia Basket Club");
		add(choLista); //A�adimos la lista
		setLocationRelativeTo(null);
		setSize(150,150);
		setVisible(true);
	}
}