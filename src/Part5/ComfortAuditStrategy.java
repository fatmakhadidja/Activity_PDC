public class ComfortAuditStrategy implements AuditStrategy {

    @Override
    public void audit(Vehicle vehicle) {
        vehicle.auditComfort();    }

}
