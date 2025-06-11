package View;

import java.util.Scanner;
import Model.Contact;

public class ConsoleView {
    private Scanner scanner = new Scanner(System.in);

    public int displayMenu() {
        System.out.println("\n--- MENÚ DE AGENDA ---");
        System.out.println("1. Agregar contacto");
        System.out.println("2. Buscar contacto");
        System.out.println("3. Eliminar contacto");
        System.out.println("4. Mostrar todos los contactos");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opción: ");
        return Integer.parseInt(scanner.nextLine());
    }

    public Contact getContactDetails() {
        System.out.print("Ingrese nombre del contacto: ");
        String name = scanner.nextLine();
        System.out.print("Ingrese teléfono del contacto: ");
        String phone = scanner.nextLine();
        return new Contact(name, phone);
    }

    public String getContactName() {
        System.out.print("Ingrese el nombre del contacto: ");
        return scanner.nextLine();
    }

    public void showContact(Contact contact) {
        System.out.println(contact);
    }

    public void showMessage(String message) {
        System.out.println(message);
    }
}

