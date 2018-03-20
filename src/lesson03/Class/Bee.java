package lesson03.Class;

class Bee extends Insect {
    public Bee (int size, String color){
        super(size,color);
    }

    public void move(){
        Print();
    }

    private void Print() {
        System.out.println("Fly");
    }

   /* public void attack(){
        Print();
        super.attack();
    }*/
   public static void main(String[] args) {
       Bee bee = new Bee(12, "yellow");
       bee.attack();
   }
}
