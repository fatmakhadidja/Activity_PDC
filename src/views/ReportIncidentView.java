package views;

import controllers.IncidentHandler;
import models.TypeIncident;
import models.TypeVehicle;

public class ReportIncidentView {
    private IncidentHandler incidentHandler;
    public ReportIncidentView(IncidentHandler incidentHandler) {
        this.incidentHandler = incidentHandler;
    }

    public void  reportIncident(TypeVehicle typeVehicle, TypeIncident typeIncident) {
        this.incidentHandler.handleIncident(typeVehicle, typeIncident);
    }
}
