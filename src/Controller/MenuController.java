package Controller;

import Model.Contact;
import Model.LinkedList;
import View.ConsoleView;

public class MenuController {
    private LinkedList<Contact> contactList = new LinkedList<>();
    private ConsoleView view = new ConsoleView();

    public void start() {
        int option;
        do {
            option = view.displayMenu();

            switch (option) {
                case 1:
                    Contact newContact = view.getContactDetails();
                    contactList.appendToTail(newContact);
                    view.showMessage("Contacto agregado exitosamente.");
                    break;

                case 2:
                    String nameToSearch = view.getContactName();
                    Contact found = searchContact(nameToSearch);
                    if (found != null) {
                        view.showContact(found);
                    } else {
                        view.showMessage("Contacto no encontrado.");
                    }
                    break;

                case 3:
                    String nameToDelete = view.getContactName();
                    Contact contactToDelete = searchContact(nameToDelete);
                    if (contactToDelete != null) {
                        contactList.deleteByValue(contactToDelete);
                        view.showMessage("Contacto eliminado.");
                    } else {
                        view.showMessage("Contacto no encontrado.");
                    }
                    break;

                case 4:
                    contactList.printAll();
                    break;

                case 0:
                    view.showMessage("Saliendo del programa...");
                    break;

                default:
                    view.showMessage("Opción inválida.");
            }
        } while (option != 0);
    }

    private Contact searchContact(String name) {
        var current = contactList.getHead();
        while (current != null) {
            if (current.getData().getName().equalsIgnoreCase(name)) {
                return current.getData();
            }
            current = current.getNext();
        }
        return null;
    }
}
