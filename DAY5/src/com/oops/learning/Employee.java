package com.oops.learning;

public class Employee {
    int id;
    String name;
    String department;
    double salary;

    // Master constructor
    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    // Constructor chaining
    public Employee(int id, String name) {
        this(id, name, "Unassigned", 0.0);
    }

    public Employee(int id) {
        this(id, "Unknown", "Unassigned", 0.0);
    }
}
