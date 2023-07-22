package com.example.backendweather;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Timestamp;

public class Predictions {
    @Id
    @GeneratedValue
    private Long id;
    @Basic
    @Column(name = "datePrediction", nullable = true)
    private Timestamp datePrediction;
    @Basic
    @Column(name = "temperature", nullable = true)
    private String temperature;

    public Predictions() {

    }

    public Predictions(Timestamp datePrediction, String temperature) {

        this.datePrediction = datePrediction;
        this.temperature = temperature;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Timestamp getDatePrediction() {
        return datePrediction;
    }

    public void setDatePrediction(Timestamp datePrediction) {
        this.datePrediction = datePrediction;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }
}
