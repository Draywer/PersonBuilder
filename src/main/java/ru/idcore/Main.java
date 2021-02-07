package ru.idcore;

public class Main {
    public static void main(String[] args) {

        Person mom = new PersonBuilder()
                .setName("Anna")
                .setSurname("Wolf")
                .setAge(35)
                .setAddress("Moscow")
                .build();
        Person son = mom.newChildBuilder()
                .setName("Alex")
                .setAge(10)
                .build();
        System.out.printf("У %s есть сын %s\n", mom.getName(), son.getName());

        try {
            //Не хватает обязательных параметров
            new PersonBuilder().build();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }

        try {
            new PersonBuilder()
                    .setName("Alex")
                    .setSurname("Wolf")
                    .setAge(-100)
                    .build();
        }catch (IllegalStateException e) {
            e.printStackTrace();
        }

    }
}
