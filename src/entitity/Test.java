package entitity;

public class Test {
    public static void main(String[] args) {

        Engineer engineer=new Engineer("ibrahim","gokyar","java meraklisi",
                25000,"Master",1000);

        OfficeWorker intern=new OfficeWorker("Osman","Dogru","===",7000);

        System.out.println(engineer);
        System.out.println(intern);

    }
}
