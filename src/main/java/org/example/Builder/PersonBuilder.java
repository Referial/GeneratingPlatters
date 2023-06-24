package org.example.Builder;

public class PersonBuilder {
    protected String name;
    protected String surName;
    protected int age;
    protected String address;

    public PersonBuilder setName(String name) {
        if (name == null){
            throw new IllegalStateException("Не указано имя.");
        } else {
            this.name = name;
            return this;
        }
    }

    public PersonBuilder setSurName(String surName) {
        if (surName == null){
            throw new IllegalStateException("Не указана фамилия.");
        } else {
            this.surName = surName;
            return this;
        }
    }

    public PersonBuilder setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Некоректный возраст.");
        } else {
            this.age = age;
            return this;
        }
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        return new Person(name, surName, age, address);
    }

}