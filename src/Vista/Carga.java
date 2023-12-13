package Vista;

import javax.swing.*;

public class Carga extends JFrame{

	JLabel pantallacarga = new JLabel();
	
	public Carga() {
		Componentes();
		
	}
	private void Componentes() {
		this.setVisible(true); //Hace que la pantalla se vea
		this.setSize(500, 100); //Le da tamaño a la pantalla
		this.setTitle("Cargando programa");
		this.setResizable(false); //No puede cambiar la dimension de la ventana
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		this.add(pantallacarga);
		
		cargar();
	}

	void cargar() {
		try {
			pantallacarga.setText("Loading");
			pantallacarga.setHorizontalAlignment(SwingConstants.CENTER);
			pantallacarga.setVerticalAlignment(SwingConstants.CENTER);
			Thread.sleep(1000);
			
			pantallacarga.setText("Loading.");
			pantallacarga.setHorizontalAlignment(SwingConstants.CENTER);
			pantallacarga.setVerticalAlignment(SwingConstants.CENTER);
			Thread.sleep(1000);
			
			pantallacarga.setText("Loading..");
			pantallacarga.setHorizontalAlignment(SwingConstants.CENTER);
			pantallacarga.setVerticalAlignment(SwingConstants.CENTER);
			Thread.sleep(1000);
			
			pantallacarga.setText("Loading...");
			pantallacarga.setHorizontalAlignment(SwingConstants.CENTER);
			pantallacarga.setVerticalAlignment(SwingConstants.CENTER);
			Thread.sleep(1000);
			//Aquiva la interfaz
			dispose();
			
		}catch(Exception ex){
		
		}
	}
}
