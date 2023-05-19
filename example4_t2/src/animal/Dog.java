package animal;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("El perro esta caminando");
    }

}
