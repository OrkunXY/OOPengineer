package entitity;

class Employee {
    private String name;
    private String surname;
    private String title;
    private int salary = 10000;
    private String position;

    public Employee(String name, String surname, String title) {
        this.name = name;
        this.surname = surname;
        this.title = title;
    }

    public Employee(String name, String surname, String title, int salary, String position) {
        this.name = name;
        this.surname = surname;
        this.title = title;
        this.salary = salary;
        this.position = position;
    }

    public Employee() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
        if (salary < 10000) {
            position = "Intern";
        } else if (salary >= 10000 && salary <= 12000) {
            position = "Engineer";
        } else if (salary > 12000 && salary <= 17000) {
            position = "Senior Engineer";
        } else {
            position = "Expert Engineer";
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", title='" + title + '\'' +
                ", salary=" + salary +
                '}';
    }
}

