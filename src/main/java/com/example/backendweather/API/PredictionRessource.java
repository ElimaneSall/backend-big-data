package com.example.backendweather.API;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.Arrays;
import java.util.List;

@Path("/prediction")
public class PredictionRessource {
    // temperature moyenne de la journee
    @Path("/temperatureOfNext3hours")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Double> getTemperatureOfNext3Hours() {
        // À implémenter - récupérer les prédictions de température pour les trois prochaines heures
        return Arrays.asList(21.4, 24.0, 22.0);
    }
}
