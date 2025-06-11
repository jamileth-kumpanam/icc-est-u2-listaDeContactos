import Controller.MenuController;
import Model.Contact;

public class App {
    public static void main(String[] args) throws Exception {
        Controller.MenuController MenuController = new MenuController();
        MenuController.start();

        Contact c1 = new Contact ("Juan", "123");
        Contact c4 = new Contact ("Juan","");
        Contact c2 = new Contact ("Juan" , null);
        Contact c3 = new Contact ("Juan" , "456");
        Contact c5 = new Contact ("Juan" , "123");

        System.out.println(c1.equals(c2));
        System.out.println(c1.equals(c3));
        System.out.println(c1.equals(c4));
        System.out.println(c1.equals(c5));
    }
}
