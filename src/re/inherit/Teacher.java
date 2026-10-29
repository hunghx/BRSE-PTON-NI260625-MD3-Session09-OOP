package re.inherit;

import re.encapsulation.Person;

// Trong java ko có đa kế thừa, 1 lớp chỉ có thể kế thừa từ 1 lớp cha duy nhất.
public class Teacher extends Person{
    private String email;
    private String major;


    public Teacher(){

    }
    public Teacher(String firstName, String lastName, String email, String major) {
        super(firstName, lastName); // gọi đến constructor của lớp person
        this.email = email;
        this.major = major;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
