package re.encapsulation;

public class Person {
    // các thuộc tính phải định nghĩa với phạm vi là private
    private String firstName;
    private String lastName;

    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // phương thức getter và setter để truy cập và thay đổi giá trị của các thuộc tính
    // Getter : phương thức lấy thông tin ra bên ngoài
    // Setter : thay đổi thông tin từ bên ngoài
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
}
