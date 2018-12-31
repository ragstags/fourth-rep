package com.com.Collections;

/**
 * Created by nadimchouglay on 30/12/2018.
 */
public class Employees implements Comparable <Employees> {

    String name;
     int salary;

    public Employees(String name, String dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    public String getName() {

        return name;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", dept='" + dept + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    String dept;




    @Override
    public int compareTo(Employees o) {
        if (this.salary < o.salary){
            return -1;
        }else if (this.salary > o.salary){
            return 1;
        }
        return 0;
    }
}
