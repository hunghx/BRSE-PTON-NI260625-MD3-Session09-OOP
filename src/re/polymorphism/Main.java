package re.polymorphism;

public class Main {
    public static void main(String[] args) {
//        Animals a1 = new Cat(); // ép kiểu
//        Animals a2 = new Dog(); // ép kiểu
//        Animals a3 = new Animals();
//        a1.makeSound(); // Meo Meo ..............
//        a2.makeSound(); // Gâu Gâu ...............
//        a3.makeSound(); // Animals sound


        // Nạp chồng
        Calculate calculate = new Calculate();
        calculate.sum(1, 2);
        calculate.sum(3, 4,5);
        calculate.sum(3, 4,5,6);
        calculate.sum(3, 4,5,6,7);
    }
}
