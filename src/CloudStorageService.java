public class CloudStorageService extends Service implements PremiumFeature, Billable {

    // TODO: declare premium field
    boolean isPremium;

    // TODO: constructor
    public CloudStorageService(String serviceName, int serviceId, double billPrice) {
        super(serviceName, serviceId, billPrice);
    }

    @Override
    public void performService() {

        // TODO:
        if (getIsActive()){
            System.out.println("Cloud Storage service is performing");
        }

    }

    @Override
    public void upgradeToPremium() {

        // TODO:
        this.isPremium = true;

    }

    @Override
    public void generateBill() {

        // TODO:
        System.out.println("Bill price: " + getBillPrice());
    }
}