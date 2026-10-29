package re.inherit;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Nguyen", "Van A", "anv@gmail.com","IT");
        System.out.println("First Name: " + t1.getFirstName());
        System.out.println("Last Name: " + t1.getLastName());
        System.out.println("Email: " + t1.getEmail());
        System.out.println("Major: " + t1.getMajor());
    }
}
