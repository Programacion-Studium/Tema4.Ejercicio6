package es.Studium.Ejercicio6;

//import java.awt.event.ItemListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
//public class Controlador implements WindowListener, ItemListener { //ItemListener para que funcione con un solo clip 
public class Controlador implements WindowListener, ActionListener { //ActionListener para que funcione con 2 clip
	Modelo modelo = null;
	Vista vista = null;
	public Controlador(Modelo modelo, Vista vista) {
		this.modelo = modelo;
		this.vista = vista;
		vista.addWindowListener(this);
		//vista.choLista.addItemListener(this);
		vista.choLista.addActionListener(this);
	}
	public void itemStateChanged(ItemEvent ie) {
	 //En caso de usar ItemListener
	}
		// TODO Auto-generated method stub
	
	@Override
	public void actionPerformed(ActionEvent ev) {
		String ciudad= new String();
		if ("Baloncesto Fuenlabrada".equals(vista.choLista.getSelectedItem())) {
			ciudad = modelo.ciudadBaloncesto ("Fuenlabrada");
		}
		if ("Vilbao Basket".equals(vista.choLista.getSelectedItem())) {
			ciudad = modelo.ciudadBaloncesto ("Zaragoza");
		}
		if ("Cajasol".equals(vista.choLista.getSelectedItem())) {
			ciudad = modelo.ciudadBaloncesto ("Sevilla");
		}
		if ("Valencia Basket Club".equals(vista.choLista.getSelectedItem())) {
			ciudad = modelo.ciudadBaloncesto ("Valencia");
		}
		System.out.println(ciudad);	
	}
	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
	}
	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
	}
	@Override
	public void windowClosing(WindowEvent arg0) {
		System.exit(0);
	}
	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
	}
	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
	}
	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
	}
	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
	}
}