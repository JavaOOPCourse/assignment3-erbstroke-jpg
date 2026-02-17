public class ConsultationService extends Service implements Billable {

    // TODO: constructor
    public ConsultationService(String serviceName, int serviceId, double billPrice) {
        super(serviceName, serviceId, billPrice);
    }

    @Override
    public void performService() {

        // TODO:
        if (getIsActive()){
            System.out.println("The consulting service is performing");
        }
    }

    @Override
    public void generateBill() {

        // TODO:
        System.out.println("Bill price: " + getBillPrice());
    }
}