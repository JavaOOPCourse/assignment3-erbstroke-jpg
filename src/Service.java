public abstract class Service {

    // TODO: declare private fields
    private String serviceName;
    private int serviceId;
    private double billPrice;
    private boolean isActive;


    // TODO: constructor
    public Service(String serviceName, int serviceId, double billPrice){
        this.serviceName = serviceName;
        this.serviceId = serviceId;
        this.billPrice = billPrice;
    }

    // TODO: activateService()
    public void activateService(){
        this.isActive = true;
        System.out.println("Service has been activated");
    }

    // TODO: deactivateService()
    public void deactivateService(){
        this.isActive = false;
        System.out.println("Service has been deactivated");
    }



    // TODO: getter for serviceName

    public String getServiceName() {
        return serviceName;
    }


    // TODO: getter for isActive

    public boolean getIsActive() {
        return isActive;
    }

    public double getBillPrice() {
        return billPrice;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    // TODO: abstract method performService()
    public abstract void performService();

}