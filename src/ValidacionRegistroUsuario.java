import java.util.Scanner;

public class ValidacionRegistroUsuario {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String nombre = "", apellidos = "", direccion = "", email = "", contrase�a = "";

		System.out.println("Nombre.");
		nombre = sc.nextLine();

		System.out.println("Apellidos.");
		apellidos = sc.nextLine();

		System.out.println("Direcci�n.");
		direccion = sc.nextLine();

		System.out.println("Correo electr�nico.");
		email = sc.nextLine();

		System.out.println("Contrase�a.");
		contrase�a = sc.nextLine();

		if (nombre.length() > 50) {
			System.out.println(
					"Su nombre es muy largo o no ha usado las may�sculas de forma correcta, por favor compruebe.");
		} else if (apellidos.length() > 100) {
			System.out.println("Compruebe sus apellidos, por favor.");
		} else if (direccion.length() > 150) {
			System.out.println("Su direcci�n es muy larga. Revise por favor.");
		} else if (email.length() > 80) {
			System.out.println("Su correo electr�nico sobrepasa los ochenta d�gitos. Compruebe, por favor.");
		} else if (contrase�a.length() < 6 && contrase�a.length() > 15) {
			System.out.println("Asegure que la longitud de su contrase�a sea la correcta.");
		}
		sc.close();
	}

}
