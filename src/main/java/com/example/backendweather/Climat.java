package com.example.backendweather;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
public class Climat {

    @Id
    @GeneratedValue
    private Long id;
    @Basic
    @Column(name = "sunrise", nullable = true)
    private Timestamp sunrise;
    @Basic
    @Column(name = "visibility", nullable = true)
    private Integer visibility;
    @Basic
    @Column(name = "timezone", nullable = true)
    private Timestamp timezone;
    @Basic
    @Column(name = "weatherMain", nullable = true, length = 255)
    private String weatherMain;
    @Basic
    @Column(name = "temperatureMax", nullable = true, precision = 2)
    private BigDecimal temperatureMax;
    @Basic
    @Column(name = "timeCollecte", nullable = true)
    private Timestamp timeCollecte;
    @Basic
    @Column(name = "temperatureMin", nullable = true, precision = 2)
    private BigDecimal temperatureMin;
    @Basic
    @Column(name = "pressure", nullable = true)
    private Integer pressure;
    @Basic
    @Column(name = "currentTime", nullable = true)
    private Timestamp currentTime;
    @Basic
    @Column(name = "seaLevel", nullable = true)
    private Integer seaLevel;
    @Basic
    @Column(name = "sunset", nullable = true)
    private Timestamp sunset;
    @Basic
    @Column(name = "temperature", nullable = true, precision = 2)
    private BigDecimal temperature;
    @Basic
    @Column(name = "humidity", nullable = true)
    private Integer humidity;
    @Basic
    @Column(name = "windDirection", nullable = true)
    private Integer windDirection;
    @Basic
    @Column(name = "grndLevel", nullable = true)
    private Integer grndLevel;
    @Basic
    @Column(name = "windSpeed", nullable = true, precision = 2)
    private BigDecimal windSpeed;



    public Climat( Timestamp sunrise, int visibility, Timestamp timezone, String weatherMain, BigDecimal temperatureMax,
                      Timestamp timeCollecte, BigDecimal temperatureMin, int pressure, Timestamp currentTime, int seaLevel,
                      Timestamp sunset, BigDecimal temperature, int humidity, int windDirection, int grndLevel,
                      BigDecimal windSpeed) {

            this.sunrise = sunrise;
            this.visibility = visibility;
            this.timezone = timezone;
            this.weatherMain = weatherMain;
            this.temperatureMax = temperatureMax;
            this.timeCollecte = timeCollecte;
            this.temperatureMin = temperatureMin;
            this.pressure = pressure;
            this.currentTime = currentTime;
            this.seaLevel = seaLevel;
            this.sunset = sunset;
            this.temperature = temperature;
            this.humidity = humidity;
            this.windDirection = windDirection;
            this.grndLevel = grndLevel;
            this.windSpeed = windSpeed;
        }

    public Climat() {

    }

    // Getters and setters (omitted for brevity)4
    public Timestamp getSunrise() {
        return sunrise;
    }

    public void setSunrise(Timestamp sunrise) {
        this.sunrise = sunrise;
    }

    public Integer getVisibility() {
        return visibility;
    }

    public void setVisibility(Integer visibility) {
        this.visibility = visibility;
    }

    public Timestamp getTimezone() {
        return timezone;
    }

    public void setTimezone(Timestamp timezone) {
        this.timezone = timezone;
    }

    public String getWeatherMain() {
        return weatherMain;
    }

    public void setWeatherMain(String weatherMain) {
        this.weatherMain = weatherMain;
    }

    public BigDecimal getTemperatureMax() {
        return temperatureMax;
    }

    public void setTemperatureMax(BigDecimal temperatureMax) {
        this.temperatureMax = temperatureMax;
    }

    public Timestamp getTimeCollecte() {
        return timeCollecte;
    }

    public void setTimeCollecte(Timestamp timeCollecte) {
        this.timeCollecte = timeCollecte;
    }

    public BigDecimal getTemperatureMin() {
        return temperatureMin;
    }

    public void setTemperatureMin(BigDecimal temperatureMin) {
        this.temperatureMin = temperatureMin;
    }

    public Integer getPressure() {
        return pressure;
    }

    public void setPressure(Integer pressure) {
        this.pressure = pressure;
    }

    public Timestamp getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(Timestamp currentTime) {
        this.currentTime = currentTime;
    }

    public Integer getSeaLevel() {
        return seaLevel;
    }

    public void setSeaLevel(Integer seaLevel) {
        this.seaLevel = seaLevel;
    }

    public Timestamp getSunset() {
        return sunset;
    }

    public void setSunset(Timestamp sunset) {
        this.sunset = sunset;
    }

    public BigDecimal getTemperature() {
        return temperature;
    }

    public void setTemperature(BigDecimal temperature) {
        this.temperature = temperature;
    }

    public Integer getHumidity() {
        return humidity;
    }

    public void setHumidity(Integer humidity) {
        this.humidity = humidity;
    }

    public Integer getWindDirection() {
        return windDirection;
    }

    public void setWindDirection(Integer windDirection) {
        this.windDirection = windDirection;
    }

    public Integer getGrndLevel() {
        return grndLevel;
    }

    public void setGrndLevel(Integer grndLevel) {
        this.grndLevel = grndLevel;
    }

    public BigDecimal getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(BigDecimal windSpeed) {
        this.windSpeed = windSpeed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Climat climat = (Climat) o;

        if (sunrise != null ? !sunrise.equals(climat.sunrise) : climat.sunrise != null) return false;
        if (visibility != null ? !visibility.equals(climat.visibility) : climat.visibility != null) return false;
        if (timezone != null ? !timezone.equals(climat.timezone) : climat.timezone != null) return false;
        if (weatherMain != null ? !weatherMain.equals(climat.weatherMain) : climat.weatherMain != null) return false;
        if (temperatureMax != null ? !temperatureMax.equals(climat.temperatureMax) : climat.temperatureMax != null)
            return false;
        if (timeCollecte != null ? !timeCollecte.equals(climat.timeCollecte) : climat.timeCollecte != null)
            return false;
        if (temperatureMin != null ? !temperatureMin.equals(climat.temperatureMin) : climat.temperatureMin != null)
            return false;
        if (pressure != null ? !pressure.equals(climat.pressure) : climat.pressure != null) return false;
        if (currentTime != null ? !currentTime.equals(climat.currentTime) : climat.currentTime != null) return false;
        if (seaLevel != null ? !seaLevel.equals(climat.seaLevel) : climat.seaLevel != null) return false;
        if (sunset != null ? !sunset.equals(climat.sunset) : climat.sunset != null) return false;
        if (temperature != null ? !temperature.equals(climat.temperature) : climat.temperature != null) return false;
        if (humidity != null ? !humidity.equals(climat.humidity) : climat.humidity != null) return false;
        if (windDirection != null ? !windDirection.equals(climat.windDirection) : climat.windDirection != null)
            return false;
        if (grndLevel != null ? !grndLevel.equals(climat.grndLevel) : climat.grndLevel != null) return false;
        if (windSpeed != null ? !windSpeed.equals(climat.windSpeed) : climat.windSpeed != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sunrise != null ? sunrise.hashCode() : 0;
        result = 31 * result + (visibility != null ? visibility.hashCode() : 0);
        result = 31 * result + (timezone != null ? timezone.hashCode() : 0);
        result = 31 * result + (weatherMain != null ? weatherMain.hashCode() : 0);
        result = 31 * result + (temperatureMax != null ? temperatureMax.hashCode() : 0);
        result = 31 * result + (timeCollecte != null ? timeCollecte.hashCode() : 0);
        result = 31 * result + (temperatureMin != null ? temperatureMin.hashCode() : 0);
        result = 31 * result + (pressure != null ? pressure.hashCode() : 0);
        result = 31 * result + (currentTime != null ? currentTime.hashCode() : 0);
        result = 31 * result + (seaLevel != null ? seaLevel.hashCode() : 0);
        result = 31 * result + (sunset != null ? sunset.hashCode() : 0);
        result = 31 * result + (temperature != null ? temperature.hashCode() : 0);
        result = 31 * result + (humidity != null ? humidity.hashCode() : 0);
        result = 31 * result + (windDirection != null ? windDirection.hashCode() : 0);
        result = 31 * result + (grndLevel != null ? grndLevel.hashCode() : 0);
        result = 31 * result + (windSpeed != null ? windSpeed.hashCode() : 0);
        return result;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
