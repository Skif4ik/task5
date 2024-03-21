package model;

public class Employee extends Person {
    private double salary;

    public Employee() {
    }

    public Employee(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toFileLine() {
        return super.toFileLine() + " " + salary;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("model.Employee{");
        sb.append("salary=").append(salary);
        sb.append(", name='").append(getName()).append('\'');
        sb.append(", age=").append(getAge());
        sb.append('}');
        return sb.toString();
    }
}