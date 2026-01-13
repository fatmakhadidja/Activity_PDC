package models;

public class Incident {
    private TypeIncident typeIncident;
    Incident(TypeIncident typeIncident) {
        this.typeIncident = typeIncident;
    }

    public TypeIncident getTypeIncident() {
        return typeIncident;
    }

    public void setTypeIncident(TypeIncident typeIncident) {
        this.typeIncident = typeIncident;
    }
}
