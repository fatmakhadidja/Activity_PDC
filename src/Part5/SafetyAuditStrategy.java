public class SafetyAuditStrategy implements AuditStrategy {

    @Override
    public void audit(Vehicle vehicle) {
        vehicle.auditSafety();
    }
}
