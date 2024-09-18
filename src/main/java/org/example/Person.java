package org.example;

public class Person {
    String firstname;
    String lastname;
    int age;
    boolean isTeen;

    public String getFirstName() {
        return firstname;
    }

    public String getLastName() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

    public boolean isTeen() {
        return age >= 13 && age <= 19;
    }

    public Person(String firstname, String lastname, int age){
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    public Person(String firstname, String lastname, boolean isTeen, int age) {
        this(firstname,lastname,age);
        this.isTeen = isTeen;
    }
}
