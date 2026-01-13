public class FleetManager {
    VehicleState vehicleState;
    public void request() {
        vehicleState.handleRequest();
    }
    VehicleState getVehicleState() {
        return vehicleState;
    }

    public void setVehicleState(VehicleState vehicleState) {
        this.vehicleState = vehicleState;
    }
}
