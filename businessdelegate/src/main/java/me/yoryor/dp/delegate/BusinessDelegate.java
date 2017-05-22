package me.yoryor.dp.delegate;

public class BusinessDelegate {
    private ServiceType serviceType;
    private BusinessService service;
    private ServiceLookup serviceLookup;

    public void setServiceType(ServiceType serviceType) {
        this.serviceType = serviceType;
    }

    public void setServiceLookup(ServiceLookup serviceLookup) {
        this.serviceLookup = serviceLookup;
    }

    public void doTask() {
        this.service = serviceLookup.getService(serviceType);
        this.service.doProcessing();
    }
}
