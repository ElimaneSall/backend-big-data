package com.example.backendweather.API;

import com.example.backendweather.LogEntity;
import com.example.backendweather.LogImpl;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.time.LocalDateTime;
import java.util.*;

@Path("/log")
public class LogRessource {

    LogImpl log = new LogImpl();

    @GET
    @Produces(MediaType.APPLICATION_JSON)

    public List<LogEntity> getAllLog(){
        return  log.getAllLogs();
    }
}
