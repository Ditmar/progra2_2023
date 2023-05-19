package animal;

public class Bird extends Animal {

    public Bird(String name) {
        super(name);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void move() {
        System.out.println("El pajaro esta volando");
    }

}
