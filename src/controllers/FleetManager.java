package controllers;

public class FleetManager {
    private VehicleState vehicleState;
    public FleetManager(VehicleState vehicleState) {
        this.vehicleState = vehicleState;
    }

    public void request() {
        this.vehicleState.handleRequest();
    }
    VehicleState getVehicleState() {
        return this.vehicleState;
    }

    public void setVehicleState(VehicleState vehicleState) {
        this.vehicleState = vehicleState;
    }
}
