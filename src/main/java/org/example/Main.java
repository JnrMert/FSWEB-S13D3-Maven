package org.example;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("John", "Doe", 20);
        Person person2 = new Person("Mert", "Yazıcı", 30);
        Person person3 = new Person("Berkay", "Emir", 24);

        System.out.println("Firstname: " + person.getFirstname());
        System.out.println("LastName: " + person.getLastname());
        System.out.println("Age: " + person.getAge());

        System.out.println("Firstname: " + person2.getFirstname());
        System.out.println("LastName: " + person2.getLastname());
        System.out.println("Age: " + person2.getAge());

        System.out.println("Firstname: " + person3.getFirstname());
        System.out.println("LastName: " + person3.getLastname());
        System.out.println("Age: " + person3.getAge());
    }
}
