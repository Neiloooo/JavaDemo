package JAVA18新特性;

/**
 * @Auther: liushuo
 * @Description:
 * @version: 1.0
 */
public class Employee {
    public Employee(String name, Integer age, double number) {
        this.name = name;
        this.age = age;
        this.number = number;
    }

    String name;

    public Employee() {
    }

    Integer age;
    double number;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(Float number) {
        this.number = number;
    }

}
