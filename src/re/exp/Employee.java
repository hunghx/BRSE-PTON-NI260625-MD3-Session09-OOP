package re.exp;

public class Employee {
    public String id;
    public String name;
    public int salary;
    public float rate;
    public String birthday;
    public boolean sex;

    public Employee(){

    }
    public Employee(String id, String name, int salary, float rate, String birthday, boolean sex){
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.rate = rate;
        this.birthday = birthday;
        this.sex = sex;
    }

    public void calSalaryAndPrint(){
        double totalSalary = salary * rate;
        System.out.println("Salary is: " + totalSalary);
    }

    public void printInfo(){
        System.out.println("----------------------Employee Info----------------------");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Rate: " + rate);
        System.out.println("Birthday: " + birthday);
        System.out.println("Sex: " + (sex ? "Male" : "Female"));
        System.out.println("----------------------------------------------------------");
    }
}
