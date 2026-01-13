package controllers;

import models.TypeIncident;
import models.TypeVehicle;

public abstract class IncidentHandler {
    public abstract void handleIncident(TypeVehicle typeVehicle, TypeIncident typeIncident);

    public void renderHeader() {

    }
    public abstract void renderContent();
    public void renderFooter() {

    }
    public abstract void handleIncident();
}
