package com.iiht.java9.basicnestedcomposition;

public class TestPerson {

    public static void main(String[] args) {
        Person person = new Person();
        long salary = person.getSalary();
        Person.Job job=person.getJob();
        System.out.println("Person Details"+person);
        System.out.println("Job Details"+job);
        System.out.println("Salary Details "+salary);
    }

}