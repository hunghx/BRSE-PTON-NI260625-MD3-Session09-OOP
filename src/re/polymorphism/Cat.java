package re.polymorphism;

public class Cat extends Animals{
    // ghi đè lại phương thức kế thừa từ Animals

    @Override // phuong thức bị ghi đè
    public void makeSound() {
        System.out.println("Meo Meo .............");
    }
}
