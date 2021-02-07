package ru.idcore;

public class PersonBuilder implements IPersonBuilder{
    protected String name;
    protected String surname;
    protected int age;
    protected String address;


    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    @Override
    public Person build() {
        if (name == null) {
            throw new IllegalStateException("Ошибка! Необходимо указать имя");
        }
        if (surname == null) {
            throw new IllegalStateException("Ошибка! Необходимо указать фамилию");
        }
        if (age <= 0) {
            throw new IllegalStateException("Ошибка! Некорректный возраст");
        }
        return new Person(name, surname, age, address);
    }
}
