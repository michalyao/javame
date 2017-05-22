package me.yoryor.dp.delegate;

public class ServiceLookup {
    private EjbService ejbService;
    private JmsService jmsService;

    public BusinessService getService(ServiceType serviceType) {
        if (serviceType == ServiceType.EJB) {
            return new EjbService();
        } else {
            return new JmsService();
        }
    }

    public void setEjbService(EjbService ejbService) {
        this.ejbService = ejbService;
    }

    public void setJmsService(JmsService jmsService) {
        this.jmsService = jmsService;
    }
}
