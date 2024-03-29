package main;

public class Person {
    private String name;

    public String getName(){
        return name;
//TODO: return the person's name
    }

    public void setName(String name){
        this.name = name;
//TODO: change the name field to the passed value
    }

    public void sayHello(){
        System.out.println("Hello, " + name);
//TODO: print a message to the console using the person's name
    }
//    The class should have a constructor that accepts a `String` value and sets
//    the person's name to the passed string.

    public Person(String name) {
        this.name = name;
    }

//    Create a `main` method on the class that creates a new `Person` object and
//    tests the above methods.

    public static void main(String[] args) {
        Person person3 = new Person("Jennifer");
        System.out.println(person3.getName());
        person3.sayHello();
        person3.setName("Deleon");
        System.out.println(person3.getName());
        person3.sayHello();

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
    }
}
