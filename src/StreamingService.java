public class StreamingService extends Service implements PremiumFeature {

    // TODO: declare premium field
    boolean isPremium;

    // TODO: constructor


    public StreamingService(String serviceName, int serviceId, double billPrice) {
        super(serviceName, serviceId, billPrice);
    }

    @Override
    public void performService() {

        // TODO:
        if(getIsActive()){
            if (isPremium){
                System.out.println("Premium Streaming service is performing");
            }
            else {
                System.out.println("Base Streaming service is performing");
            }
        }
        else{
            System.out.println("Service isn't active");
        }

    }

    @Override
    public void upgradeToPremium() {

        // TODO:
        setActive(true);
        System.out.println("Service has been upgraded to premium successfully");

    }
}