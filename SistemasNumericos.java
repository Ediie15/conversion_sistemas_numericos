import javax.swing.JOptionPane;

public class SistemasNumericos {
	public static void main(String[] args) {
		
		String numeroStr = JOptionPane.showInputDialog(null, "Ingrese un número decimal:");
		
		int numeroDecimal = 0;
		try {
			numeroDecimal = Integer.parseInt(numeroStr);
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null,"Error debe ingresar un número entero");
			main(args);
			System.exit(0);
		}
		System.out.println("numero decimal = "+ numeroDecimal );
		System.out.println("numero binario de "+ numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal));
		
		int numeroBinario = 0b111110100;
		System.out.println("numeroBinario = "+ numeroBinario);
		
		System.out.println("numero octal de "+ numeroBinario + " = " + Integer.toOctalString(numeroDecimal));
		int numeroOctal = 0764;
		System.out.println("numero octal =  "+ numeroOctal );
		System.out.println("numero hexadecimal de "+ numeroDecimal + " = " + Integer.toHexString(numeroDecimal) );
		
		int numeroHex = 0x11f4;
		System.out.println("numeroHex =  "+ numeroHex );
		System.out.println("\n\n");
		
		String mensaje = "numero binario de "+ numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
		mensaje += "\nnumero octal de "+ numeroBinario + " = " + Integer.toOctalString(numeroDecimal);
		mensaje += "\nnumero hexadecimal de "+ numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
		JOptionPane.showMessageDialog(null,mensaje);
		
	}
}
