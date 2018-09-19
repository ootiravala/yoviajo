
import java.util.Scanner;

public class ValidacionRegistroUsuario {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String nombre = "", apellidos = "", direccion = "", email = "", contrase�a = "";
		boolean mayus = "" != null;

		do {
			mayus = false;
			System.out.println("� Cu�l es tu nombre?");
			nombre = sc.nextLine();
			char inicial = nombre.charAt(0);
			if (nombre.length() > 5) {
				System.out.println("Verifique la longitud de su nombre, no puede superar los cinco d�gitos.");
			} else if (Character.isUpperCase(inicial)) {
				mayus = true;
			} else {
				System.out.println("Introduzca su inicial en may�sula, por favor.");
			}
		} while ((nombre.length() > 5 == true) | mayus == false);

		do {
			mayus = false;
			System.out.println("�Y tus apellidos?");
			apellidos = sc.nextLine();
			char inicial = apellidos.charAt(0);
			if (apellidos.length() > 80) {
				System.out.println("Verifique la longitud de sus apellidos, no puede superar los ochenta d�gitos.");
			} else if (Character.isUpperCase(inicial)) {
				mayus = true;
			} else {
				System.out.println("Introduzca las inciales en may�sula, por favor.");
			}
		} while ((apellidos.length() > 80 == true) | mayus == false);

		do {
			System.out.println("Direcci�n.");
			direccion = sc.nextLine();
			if (direccion.length() > 150) {
				System.out.println("Su direcci�n es muy larga. Revise por favor.");
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
					System.out.println("Su correo electr�nico sobrepasa los ochenta d�gitos. Compruebe, por favor.");
				}
			}
		} while (arroba = false | email.length() > 80);

		System.out.println("Contrase�a.");
		contrase�a = sc.nextLine();

		if (contrase�a.length() < 6 && contrase�a.length() > 15) {
			System.out.println("Asegure que la longitud de su contrase�a sea la correcta.");
		}
		System.out.println("Datos introducidos correctos.");
		sc.close();
	}

}
