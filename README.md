#### Домашнее задание к занятию 1.1: Порождающие шаблоны. Builder, Singleton, Factory Method, Abstract Factory, Prototype
#### Задача 1: PersonBuilder

```text
"C:\Program Files\JetBrains\IntelliJ IDEA 2019.2\jbr\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2019.2\lib\idea_rt.jar=52857:C:\Program Files\JetBrains\IntelliJ IDEA 2019.2\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\User\IdeaProjects\PersonBuilder\target\classes;C:\Users\User\.m2\repository\org\apache\httpcomponents\httpclient\4.5.12\httpclient-4.5.12.jar;C:\Users\User\.m2\repository\org\apache\httpcomponents\httpcore\4.4.13\httpcore-4.4.13.jar;C:\Users\User\.m2\repository\commons-logging\commons-logging\1.2\commons-logging-1.2.jar;C:\Users\User\.m2\repository\commons-codec\commons-codec\1.11\commons-codec-1.11.jar;C:\Users\User\.m2\repository\com\fasterxml\jackson\core\jackson-databind\2.12.1\jackson-databind-2.12.1.jar;C:\Users\User\.m2\repository\com\fasterxml\jackson\core\jackson-annotations\2.12.1\jackson-annotations-2.12.1.jar;C:\Users\User\.m2\repository\com\fasterxml\jackson\core\jackson-core\2.12.1\jackson-core-2.12.1.jar;C:\Users\User\.m2\repository\org\hamcrest\hamcrest-all\1.3\hamcrest-all-1.3.jar ru.idcore.Main
У Anna есть сын Alex
java.lang.IllegalStateException: Ошибка! Необходимо указать имя
	at ru.idcore.PersonBuilder.build(PersonBuilder.java:33)
	at ru.idcore.Main.main(Main.java:20)
java.lang.IllegalStateException: Ошибка! Некорректный возраст
	at ru.idcore.PersonBuilder.build(PersonBuilder.java:39)
	at ru.idcore.Main.main(Main.java:30)

Process finished with exit code 0
```