package views;

import controllers.FleetManager;

public class RequestVehicleView {
    private FleetManager fleetManager;
    public RequestVehicleView(FleetManager fleetManager) {
        this.fleetManager = fleetManager;
    }
    public void requestVehicle() {
        this.fleetManager.request();
    }
}
