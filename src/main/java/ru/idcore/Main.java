package ru.idcore;

public class Main {
    public static void main(String[] args) {
        try {
            Person mom = new PersonBuilder("Anna", "Wolf")
                    .setAge(35)
                    .setAddress("Moscow")
                    .build();
            Person son = mom.newChildBuilder("Alex")
                    .setAge(10)
                    .build();

            System.out.printf("У %s есть сын %s\n", mom.getName(), son.getName());
        }catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }
}
