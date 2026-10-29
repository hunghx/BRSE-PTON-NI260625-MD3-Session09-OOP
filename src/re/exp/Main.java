package re.exp;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("EM0001","Nguyễn Văn A",1000,1.15f,"11/11/1998",true);
        Employee e2 = new Employee("EM0002","Nguyễn Thị D",800,1.25f,"10/1/2000",false);

        // tính và in lương
        e1.calSalaryAndPrint();
        e2.calSalaryAndPrint();
        // in thông tin nv1
        e1.printInfo();
        // thay đổi lương
        e1.salary = 10000000;
        // in ra sau khi thya đổi
        e1.printInfo();
    }
}
