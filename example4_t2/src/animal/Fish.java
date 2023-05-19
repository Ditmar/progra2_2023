package animal;

public class Fish extends Animal {

    public Fish(String name) {
        super(name);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void move() {
        System.out.println("El pez esta nadando");
    }

}
