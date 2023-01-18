import java.util.ArrayList;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("John", "Lennon", "Junior Dev", 27045.78 );
        Employee name = new Employee();
        name.setName("George");
        name.setSurname("Harrison");
        name.setSalary(50000.00);

        Student s1 = new Student("Ringo",  "Starr", 2.5);
        Student s2 = new Student("Paul", "McCartney", 3.2);

        ArrayList<Person> people = new ArrayList<>();
        people.add(employee1);
        people.add(name);
        people.add(s1);
        people.add(s2);

        Collections.sort(people);
        PrintData(people);
    }
    private static void PrintData(Iterable<Person> people) {
        people.forEach(person -> System.out.println(person.toString() + " earns " + person.getPaymentAmount() + " tenge"));
    }
}