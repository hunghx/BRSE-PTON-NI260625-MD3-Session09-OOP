package re.brse;

import re.it.Product;

public class Oop {
    // OOP - Lập trình hướng đối tượng là phương pháp lập trình xoay quanh các đối tượng\
    // Đối tượng : Đặc điểm (thuộc tính) và Hành vi (phương thức)

    // Class (Lớp) và Object (Đối tượng) : Ví dụ Lớp Sinh viên có 1 sinh viên là Nguyễn Văn A(Đối tượng của lớp Sinh viên)


    public static void main(String[] args) {
        // Tạo đối tượng từ lớp re.brse.Student
        Student sv1 = new Student(); // cấp phát động bộ nhớ chương trình
        Student sv2 = new Student(); // cấp phát động bộ nhớ chương trình
        Student sv3 = new Student("SV0003","Nguyễn Văn B","20/12/2000",4.0f);
        Student sv4 = new Student("SV0004","Nguyễn Văn C","21/12/2000",3.8f);
        // sv1 sẽ có gì ?
        // Gọi thành phần của lớp : sử dụng tên đối tượng kết hợp dấu (.)
        sv1.printInfo();
        sv2.printInfo();
        sv3.printInfo();
        sv4.printInfo();
        // tạo đối tượng sản phẩm
        Product p = new Product();
//        p.id = "P002";
//        p.name = "Sản phẩm 1";
//        p.price = 1000.0f;
        p.createdAt = "01/01/2024";
        p.quantity = 100;
    }
}
// Tạo lớp Sinh viên có 4 thông tin: Mã sinh viên, Họ tên, Ngày sinh, Điểm trung bình

class Student{ // Bộ khung tạo ra đối tượng
    // Thuộc tính - là các biến
    String studentId;
    String studentName;
    String dateOfBirth;
    float avgPoint;
    // Phương thức
        // Phương thức khởi tạo: dùng để tạo ra đối tượng
    Student(){
        // logic
        studentId= "SV0001";
        studentName="Nguyễn Văn A";
        dateOfBirth="19/04/1994";
        avgPoint= 3.6f;
    }
    Student(String studentIdIn, String studentName, String dateOfBirth, float avgPoint){
        // tại sao lại cần this ?????
        studentId=studentIdIn;
        this.studentName=studentName;
        this.dateOfBirth=dateOfBirth;
        this.avgPoint=avgPoint;
    }
        // Phương thức khác
    void printInfo(){
        System.out.println("+--------------re.brse.Student Info-------------+");
        System.out.println("re.brse.Student Id: " + studentId);
        System.out.println("re.brse.Student Name: " + studentName);
        System.out.println("re.brse.Student Date of Birth: " + dateOfBirth);
        System.out.println("re.brse.Student Avg Point: " + avgPoint);
        System.out.println("+--------------re.brse.Student Info-------------+");
    }
}
