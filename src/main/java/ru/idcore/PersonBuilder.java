package ru.idcore;

public class PersonBuilder implements IPersonBuilder{
    protected final String name;
    protected final String surname;
    protected int age;
    protected String address;

    public PersonBuilder(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public PersonBuilder setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            throw new IllegalStateException("Возраст должен быть больше нуля");
        }
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    @Override
    public Person build() {
        return new Person(this);
    }
}
