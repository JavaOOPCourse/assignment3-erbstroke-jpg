public class Customer extends User {

    // TODO: constructor
    public Customer(String name, int id){
        super(name, id);
    }

    @Override
    public void manageService(Service s) {

        // TODO:
        System.out.println("Customer has not access to managing");

    }

    @Override
    public void useService(Service s) {

        // TODO:
        System.out.println("Customer is using service");
        s.performService();

    }
}