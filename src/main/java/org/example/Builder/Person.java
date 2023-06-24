package org.example.Builder;

public class Person {
    protected String name;
    protected String surName;
    protected int age;
    protected String address;

    public Person(String name, String surName, int age, String address) {
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.address = address;
    }

    public boolean hasAge() {
       return age != 0;
    }

    public boolean hasAddress() {
        return address != null;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public void happyBirthday() {
        age++;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

//    @Override
//    public int hashCode() { /*...*/ }
//
    public PersonBuilder newChildBuilder() {
        return new PersonBuilder()
                .setSurName(getSurName())
                .setAge(12)
                .setAddress(getAddress());
    }
}
