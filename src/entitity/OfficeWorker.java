package entitity;

public class OfficeWorker extends Employee implements ISetTitle {


    public OfficeWorker(String name, String surname, String title, int salary) {
        super(name, surname, title);
        super.setSalary(8000);

    }





    @Override
    public void setTitle(int salary) {
        if (salary >= 8000 && salary < 12000) {
            super.setTitle("Office Worker");
        } else if (salary >= 12000) {
            super.setTitle("Senior Office Worker");
        } else {
            super.setTitle("Intern");
        }
    }
}
