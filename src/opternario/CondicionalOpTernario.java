package opternario;

import javax.swing.JOptionPane;

public class CondicionalOpTernario {

	public static void main(String[] args) {
		
		
		int numero;
		String diez;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digita un número:"));

		diez = (numero%10==0) ? "Es múltiplo de 10 " : "No es múltiplo de 10";
		
		JOptionPane.showMessageDialog(null, diez);
		
		if(numero%10==0) {
			JOptionPane.showMessageDialog(null, "Es múltiplo de diez con el if");
		}
		else {
			JOptionPane.showMessageDialog(null,"No es múltiplo de diez con el if");
		}
		
	}

	
	}


