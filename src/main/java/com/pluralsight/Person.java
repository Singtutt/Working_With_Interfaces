package com.pluralsight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Person implements Comparable<Person> {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person's..." +
                "\nFirst Name: " + firstName +
                "\nLast Name: " + lastName +
                "\nAge: " + age;
    }

    @Override // Bonus
    public int compareTo(Person queryPerson) {
        int checkLastName = this.lastName.compareTo(queryPerson.lastName);
        if (checkLastName != 0) {
            return checkLastName;
        }
        int checkFirstName = this.firstName.compareTo(queryPerson.firstName);
        if (checkFirstName != 0) {
            return checkFirstName;
        }
        return Integer.compare(this.age, queryPerson.age);
    }

    public static void main(String[] args) {
        List<Person> myFamily = new ArrayList<Person>();
        myFamily.add( new Person("Dana", "Wyatt", 63) );
        myFamily.add( new Person("Zachary", "Westly", 31) );
        myFamily.add( new Person("Elisha", "Aslan", 14) );
        myFamily.add( new Person("Ian", "Auston", 16) );
        myFamily.add( new Person("Zephaniah", "Hughes", 9) );
        myFamily.add( new Person("Ezra", "Aiden", 17) );
        Collections.sort(myFamily);
        for (Person person : myFamily) {
            System.out.println(person);
        }
    }
}
