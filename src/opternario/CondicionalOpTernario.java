package opternario;

import javax.swing.JOptionPane;

public class CondicionalOpTernario {

	public static void main(String[] args) {
		
		
		int numero;
		String diez;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digita un n�mero:"));

		diez = (numero%10==0) ? "Es m�ltiplo de 10 " : "No es m�ltiplo de 10";
		
		JOptionPane.showMessageDialog(null, diez);
		
		if(numero%10==0) {
			JOptionPane.showMessageDialog(null, "Es m�ltiplo de diez con el if");
		}
		else {
			JOptionPane.showMessageDialog(null,"No es m�ltiplo de diez con el if");
		}
		
	}

	
	}


