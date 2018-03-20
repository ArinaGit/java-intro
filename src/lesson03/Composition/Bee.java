package lesson03.Composition;

public class Bee extends Insect implements Attack {
    private Attack attack;

    public Bee(int size, String color, Attack attack) {
        super(size, color);
        this.attack = attack;
    }

    public static void main(String[] args) {

    AttackImpl imp = new AttackImpl ("fly", "sting");
    Bee bee = new Bee(12, "yellow",  imp);
    bee.attack();
}

    public void move(){
        attack.move();
    }

    public void attack(){
        attack.attack();
    }
}
