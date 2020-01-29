package es.Studium.Ejercicio6;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
/**
 * @author alvaro
 *
 */
public class Ejercicio6 extends Frame implements WindowListener, ItemListener
{
	private static final long serialVersionUID = 1L;
	// Creación de una lista con 4 elementos visibles y que no
	// permite multiselección
	List choLista = new List(4, false); //Esto indica la cantidad de elementos que seran visibles, el false indica si podemos o no marcar mas de un elemento de la lista.
	public Ejercicio6()
	{
		setLayout(new FlowLayout());
		setTitle("Lista"); //Titulo de la ventana
		//Añadimos los elementos de la lista
		choLista.add("Baloncesto Fuenlabrada");
		choLista.add("Vilbao Basket");
		choLista.add("Cajasol");
		choLista.add("Valencia Basket Club");
		add(choLista); //Añadimos la lista
		setLocationRelativeTo(null);
		setSize(150,150);
		choLista.addItemListener(this);
		this.addWindowListener(this);
		
		setVisible(true);
	}
	public static void main(String[] args)
	{
		new Ejercicio6(); //Mostramos la lista
	}
	@Override
	public void itemStateChanged(ItemEvent ie) {
		// TODO Auto-generated method stub
		String ciudad= new String();
		if ("Baloncesto Fuenlabrada".equals(choLista.getSelectedItem())) {
			ciudad = "Fuenlabrada";
		}
		if ("Vilbao Basket".equals(choLista.getSelectedItem())) {
			ciudad = "Zaragoza";
		}
		if ("Cajasol".equals(choLista.getSelectedItem())) {
			ciudad = "Sevilla";
		}
		if ("Valencia Basket Club".equals(choLista.getSelectedItem())) {
			ciudad = "Valencia";
		}
		System.out.println(ciudad);	
	}
	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.exit(0); 
	}
	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
}