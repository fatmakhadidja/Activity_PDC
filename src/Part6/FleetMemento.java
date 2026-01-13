package Part6;

public class FleetMemento {
    private List<VehiculeState> states ;

    public FleetMemento( List<VehicleState> states ){
        this.states = states;
    }

    public List<VehicleState> getStates() {
        return states;
    }
}
