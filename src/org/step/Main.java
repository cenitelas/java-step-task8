package org.step;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
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
        collect.close();

        //IntStream
        System.out.println("\n\nIntStream\n");
        collect = Employees.employees.stream();
        IntStream intStream = Arrays.stream(collect.mapToInt(employee -> employee.getAge()).toArray());

        String years = intStream.mapToObj(String::valueOf).collect(Collectors.joining(","));
        System.out.println("Years = "+years);
        intStream.close();
        collect.close();

        collect = Employees.employees.stream();
        intStream = Arrays.stream(collect.mapToInt(employee -> employee.getAge()).toArray());
        System.out.println("Average years = "+intStream.average().getAsDouble());
        intStream.close();
        collect.close();

        collect = Employees.employees.stream();
        intStream = Arrays.stream(collect.mapToInt(employee -> employee.getAge()).toArray());
        String sortedYears = intStream.sorted().mapToObj(String::valueOf).collect(Collectors.joining(","));
        System.out.println("Sorted years = "+sortedYears);
        intStream.close();


    }
}
