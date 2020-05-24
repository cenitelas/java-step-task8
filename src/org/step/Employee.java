package org.step;

import java.util.Objects;

enum Position{
    CHIF,
    MANAGER,
    WORKER
}

public class Employee {
    private String firstName;
    private String lastName;
    private int id;
    private int age;
    private Position position;

    public Employee(String firstName, String lastName, int id, int age, Position position) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.age = age;
        this.position = position;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id &&
                age == employee.age &&
                firstName.equals(employee.firstName) &&
                lastName.equals(employee.lastName) &&
                position == employee.position;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, id, age, position);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id=" + id +
                ", age=" + age +
                ", position=" + position +
                '}';
    }

}
