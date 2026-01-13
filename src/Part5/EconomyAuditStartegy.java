public class EconomyAuditStartegy implements AuditStrategy {
   @Override
    public void audit(Vehicle vehicle) {
        vehicle.auditEconomy();
    }

}
