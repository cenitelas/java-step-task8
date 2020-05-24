package org.step;

import java.util.List;

public final class Employees {
    public static List<Employee> employees = List.of(
            new Employee("Michael", "Smith", 243, 43, Position.CHIF),
            new Employee("Jane","Smith", 523, 40, Position.MANAGER),
            new Employee("Jury", "Gagarin", 6423, 26, Position.MANAGER),
            new Employee("Jack", "London", 5543, 53, Position.WORKER),
            new Employee("Eric", "Jackson", 2534,22, Position.WORKER),
            new Employee( "Andrew","Bosh", 3456, 44, Position.WORKER),
            new Employee("Joe", "Smith", 723, 30, Position.MANAGER),
            new Employee("Jack","Gagarin", 7423,35, Position.MANAGER),
            new Employee("Jane","London", 7543, 42, Position.WORKER),
            new Employee("Mike","Jackson",7534, 31, Position.WORKER),
            new Employee("Jack","Bosh",7456,54, Position.WORKER),
            new Employee("Mark","Smith",123,41,Position.MANAGER),
            new Employee("Jane","Gagarin",1423,28,Position.MANAGER),
            new Employee("Sam","London",1543,52,Position.WORKER),
            new Employee("Jack","Jackson",1534,27,Position.WORKER),
            new Employee("Eric","Bosh",1456,32,Position.WORKER)
    );
}
