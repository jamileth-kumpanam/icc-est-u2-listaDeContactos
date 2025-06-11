package Model;

public class Contact {
    private String name;
    private String phone;

    public Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return "Nombre: " + name + ", Teléfono: " + phone;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Contact)) return false;
        Contact other = (Contact) obj;
        if (name == null || other.name == null) return false;
        return name.equals(other.name) &&
               ((phone == null && other.phone == null) || (phone != null && phone.equals(other.phone)));
    }
}
