package re.encapsulation;

public class Main {
    public static void main(String[] args) {
        // Tạo ối tượng
        Person p1 = new Person();
        p1.setFirstName("John");
        p1.setLastName("Smith");

        System.out.println("Last name : "+ p1.getLastName());
        System.out.println("First name : "+ p1.getFirstName());
    }
}
