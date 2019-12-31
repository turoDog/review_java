package com.nasus.object.equals;

import java.time.*;
import java.util.Objects;

public class Employee {
    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        hireDay = LocalDate.of(year, month, day);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    public boolean equals(Object otherObject) {

        // 自反性，一如果个对象等于它本身，结果肯定是 true
        if (this == otherObject) {
            return true;
        }

        // 非空性
        if (otherObject == null) {
            return false;
        }

        // 检查对象类型是否一致
        if (getClass() != otherObject.getClass()) {
            return false;
        }

        // 强转成本类类型
        Employee other = (Employee) otherObject;

        // 比较属性，String 类型用 Objects.equals(x,y) int 类型用 ==
        return Objects.equals(name, other.name)
                && salary == other.salary
                && Objects.equals(hireDay, other.hireDay);

    }

    public int hashCode() {
        return Objects.hash(name, salary, hireDay);
    }

    public String toString() {
        return getClass().getName() + "[name=" + name + ",salary=" + salary + ",hireDay=" + hireDay
                + "]";
    }
}
