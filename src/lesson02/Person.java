package src.lesson02;

public class Person {
    String firstName;
    String secondName;
    int age;
    private static int count = 0;

    Person (String firstName, String secondName, int age){
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        count++;
    }

    void DoSomething() {
        String end = " is doing something.";
                System.out.println(firstName + " " + secondName + end);
    }

    static {
        System.out.println("First class loading.");
    }

    {
        System.out.println(count + " class loading.");
    }
    public static void main (String[] args)

    {
        Person A = new Person("Aryna", "Shvydka",25);
        Person B = new Person ("Name", "Surname", 24);

    }
}



