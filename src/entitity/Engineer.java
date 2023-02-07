package entitity;

public class Engineer extends Employee{
    private int travelAllowance;

    public Engineer(String name, String surname, String title, int salary, String position, int travelAllowance) {
        super(name, surname, title, salary, position);
        this.travelAllowance = travelAllowance;
    }

    public int getTravelAllowance() {
        return travelAllowance;
    }

    public void setTravelAllowance(int travelAllowance) {
        this.travelAllowance = travelAllowance;
    }

    public void salaryIncrease(double rate) {
        int bonus = 250;
        super.setSalary((int) (super.getSalary() * rate + bonus));
    }

    @Override
    public String toString() {
        return "Engineer{" +
                "name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", title='" + getTitle() + '\'' +
                ", salary=" + getSalary()+
                "travelAllowance=" + travelAllowance +
                '}';
    }
}
