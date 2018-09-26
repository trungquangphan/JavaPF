package oop.reference;

public class TestPassByReference {
    public static void main(String[] args) {
        int counter = 1;
        System.out.println("Gia tri cua counter truoc: " + counter);
        increment(counter);
        System.out.println("Gia tri cua counter sau: " + counter);

        Person person = new Person(10);
        System.out.println("Tuoi truoc khi tang: " + person.age);
        increment(person);
        System.out.println("Tuoi sau khi tang: " + person.age);
    }

    private static void increment(Person person) {
        person.age += 1;
    }

    private static void increment(int counter) {
        counter++;
    }


}
