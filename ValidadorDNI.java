package EntornosDesarrollo.Examen;

public class ValidadorDNI {

	private String dni;

	ValidadorDNI miDNI = new ValidadorDNI("43202729N");
	
	public ValidadorDNI(String dni) {
		this.dni = dni;
	}

	/** Valida el formato del DNI **/
	private boolean numero() {

		int i = 0;
		int j = 0;

		String dni = "";
		String numero = "";

		String numeros[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9" };

		for (i = 0; i < this.dni.length() - 1; i++) {

			numero = this.dni.substring(i, i + 1);

			for (j = 0; j < numeros.length; i++) {

				if (numeros.equals(numeros[j])) {

					dni += numeros[j];

				}

			}

		}

		if (dni.length() != 8) {

			return false;

		} else {

			return true;

		}

	}
	
	
	
	/** Validador de DNI **/
	private boolean validar() {

		String letraMayuscula = "";

		if (dni.length() != 9 || Character.isLetter(this.dni.charAt(8)) == false) {

			return false;

		}

		return false;

	}

	
	
	/** Generador de letra según el resto de los 8 digitos del DNI **/
	private String letra() {

		int dni = Integer.parseInt(this.dni.substring(0, 8));

		int resto = 0;

		String letra = "";

		String asigLetra[] = { "T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V",
				"H", "L", "C", "K", "E" };

		resto = dni % 23;

		letra = asigLetra[resto];

		return letra;

	}

}
