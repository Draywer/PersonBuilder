package ru.idcore;

import java.util.Objects;

public class Person {
    protected final String name;
    protected final String surname;
    protected int age;
    protected String address;

    Person (PersonBuilder personBuilder) {
        this.name = personBuilder.name;
        this.surname = personBuilder.surname;
        this.age = personBuilder.age;
        this.address = personBuilder.address;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void happyBirthday() {
        age++;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean hasAge() {
        return age > 0;
    }

    public boolean hasAddress() {
        return address != null;
    }

    public PersonBuilder newChildBuilder(String name) {
        return new PersonBuilder(name, this.surname);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return getAge() == person.getAge() &&
                getName().equals(person.getName()) &&
                getSurname().equals(person.getSurname()) &&
                Objects.equals(getAddress(), person.getAddress());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSurname(), getAge(), getAddress());
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
