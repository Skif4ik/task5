package model;

public class Student extends Person{
    private double avg;

    public Student() {
    }

    public Student(String name, int age, double avg) {
        super(name, age);
        this.avg = avg;
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("model.Student{");
        sb.append("name='").append(getName()).append('\'');
        sb.append(", age=").append(getAge());
        sb.append(", avg=").append(avg);
        sb.append('}');
        return sb.toString();
    }
}
