public class Admin extends User {

    // TODO: constructor
    public Admin(String name, int id){
        super(name, id);
    }

    @Override
    public void manageService(Service s) {

        // TODO:
        System.out.println("Admin took control of managing");

    }

    @Override
    public void useService(Service s) {

        // TODO:
        System.out.println("Admin took control of service");
        s.performService();

    }
}