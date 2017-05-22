package me.yoryor.dp.delegate;

public class App {
    public static void main(String[] args) {
        BusinessDelegate businessDelegate = new BusinessDelegate();
        ServiceLookup businessLookup = new ServiceLookup();
        businessLookup.setEjbService(new EjbService());
        businessLookup.setJmsService(new JmsService());

        businessDelegate.setServiceLookup(businessLookup);
        businessDelegate.setServiceType(ServiceType.EJB);

        Client client = new Client(businessDelegate);
        client.doTask();

        businessDelegate.setServiceType(ServiceType.JMS);
        client.doTask();
    }
}
