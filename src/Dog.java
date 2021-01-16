public class Dog {
    String name;
    Dog fluffy = new Dog("fluffy");


    public Dog(String name) {

        this.name = name;

    }


    void bark() {

        System.out.println("woof woof");

    }

}
