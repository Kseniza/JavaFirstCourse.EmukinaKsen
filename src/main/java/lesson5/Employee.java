package lesson5;

public class Employee {
    String name;
    String position;
    String email;
    String phone;
    int cost;
    int age;


    public Employee(String name, String position, String email, String phone, int cost, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.cost = cost;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", cost=" + cost +
                ", age=" + age +
                '}';
    }
}
