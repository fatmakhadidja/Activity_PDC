public class Inspector {
    private AuditStrategy strategy ;

    public void setStrategy(AuditStrategy strategy){
        this.strategy = strategy;
    }

    public void inspect (Vehicle vehicle){
        strategy.audit(vehicle);
    }
}
