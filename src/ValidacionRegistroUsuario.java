import java.util.Scanner;

public class ValidacionRegistroUsuario {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String nombre = "", apellidos = "", direccion = "", email = "", contraseña = "";

		System.out.println("Nombre.");
		nombre = sc.nextLine();

		System.out.println("Apellidos.");
		apellidos = sc.nextLine();

		System.out.println("Dirección.");
		direccion = sc.nextLine();

		System.out.println("Correo electrónico.");
		email = sc.nextLine();

		System.out.println("Contraseña.");
		contraseña = sc.nextLine();

		if (nombre.length() > 50) {
			System.out.println(
					"Su nombre es muy largo o no ha usado las mayúsculas de forma correcta, por favor compruebe.");
		} else if (apellidos.length() > 100) {
			System.out.println("Compruebe sus apellidos, por favor.");
		} else if (direccion.length() > 150) {
			System.out.println("Su dirección es muy larga. Revise por favor.");
		} else if (email.length() > 80) {
			System.out.println("Su correo electrónico sobrepasa los ochenta dígitos. Compruebe, por favor.");
		} else if (contraseña.length() < 6 && contraseña.length() > 15) {
			System.out.println("Asegure que la longitud de su contraseña sea la correcta.");
		}
		sc.close();
	}

}
