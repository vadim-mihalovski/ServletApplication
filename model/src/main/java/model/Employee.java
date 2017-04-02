package model;

public class Employee {

    private String name;
    private String position;
    private String office;
    private String age;
    private String startDate;
    private String salary;

    public Employee() {
        super();
    }

    public Employee(String name, String position, String office, String age, String startDate, String salary) {
        this.name = name;
        this.position = position;
        this.office = office;
        this.age = age;
        this.startDate = startDate;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
}
