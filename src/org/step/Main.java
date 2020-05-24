package org.step;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Stream<Employee> collect = Employees.employees.stream();
        System.out.printf("Average year = %s\n",collect.mapToDouble(employee -> employee.getAge()).average().getAsDouble());
        collect.close();

        collect = Employees.employees.stream();
        Employee boss = collect.filter(employee -> employee.getPosition().equals(Position.CHIF)).findFirst().orElseThrow();
        System.out.printf("\nBoss = %s %s\n",boss.getFirstName(), boss.getLastName());
        collect.close();

        collect = Employees.employees.stream();
        Long countWorker = collect.filter(employee -> employee.getPosition().equals(Position.WORKER)).count();
        System.out.println("\nCount worker = "+countWorker);
        collect.close();

        collect = Employees.employees.stream();
        Stream<Employee> employees = collect.filter(employee -> employee.getFirstName().length()>4);
        System.out.println("\nEmployees with name lenght > 4:");
        for (Employee employee : employees.collect(Collectors.toList())){
            System.out.printf("%s %s\n",employee.getFirstName(), employee.getLastName());
        }
    }
}
