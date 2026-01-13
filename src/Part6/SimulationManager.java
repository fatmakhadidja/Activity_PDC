package Part6;

//Caretaker
public class SimulationManager {

    private FleetMemento memento;

    public SimulationManager( Fleet fleet )
    {

    }


    public void backup ( Fleet fleet )
    {
        backup = fleet.save();
    }
    public void restore( Fleet fleet )
    {
        fleet.restore(backup);
    }
}
