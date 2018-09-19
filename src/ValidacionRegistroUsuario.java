
import java.util.Scanner;

public class ValidacionRegistroUsuario {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String nombre = "", apellidos = "", direccion = "", email = "", contraseña = "";
		boolean mayus = "" != null;

		do {
			mayus = false;
			System.out.println("¿ Cuál es tu nombre?");
			nombre = sc.nextLine();
			char inicial = nombre.charAt(0);
			if (nombre.length() > 5) {
				System.out.println("Verifique la longitud de su nombre, no puede superar los cinco dígitos.");
			} else if (Character.isUpperCase(inicial)) {
				mayus = true;
			} else {
				System.out.println("Introduzca su inicial en mayúsula, por favor.");
			}
		} while ((nombre.length() > 5 == true) | mayus == false);

		do {
			mayus = false;
			System.out.println("¿Y tus apellidos?");
			apellidos = sc.nextLine();
			char inicial = apellidos.charAt(0);
			if (apellidos.length() > 80) {
				System.out.println("Verifique la longitud de sus apellidos, no puede superar los ochenta dígitos.");
			} else if (Character.isUpperCase(inicial)) {
				mayus = true;
			} else {
				System.out.println("Introduzca las inciales en mayúsula, por favor.");
			}
		} while ((apellidos.length() > 80 == true) | mayus == false);

		do {
			System.out.println("Dirección.");
			direccion = sc.nextLine();
			if (direccion.length() > 150) {
				System.out.println("Su dirección es muy larga. Revise por favor.");
			}
		} while (direccion.length() > 150);

		System.out.println("Introduzca su correo");
		email = sc.nextLine();
		boolean arroba = false;
		do {

			for (int i = 0; i < email.length(); i++) {
				if (email.charAt(i) == '@') {
					arroba = true;
				}
				if (arroba == true) {

				} else {
					System.out.println("Asegurese de haber escrito correctamente su correo.");
				}
				if (email.length() > 80) {
					System.out.println("Su correo electrónico sobrepasa los ochenta dígitos. Compruebe, por favor.");
				}
			}
		} while (arroba = false | email.length() > 80);

		System.out.println("Contraseña.");
		contraseña = sc.nextLine();

		if (contraseña.length() < 6 && contraseña.length() > 15) {
			System.out.println("Asegure que la longitud de su contraseña sea la correcta.");
		}
		System.out.println("Datos introducidos correctos.");
		sc.close();
	}

}
