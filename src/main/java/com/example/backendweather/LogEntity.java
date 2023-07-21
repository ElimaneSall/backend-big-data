package com.example.backendweather;
import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class LogEntity {

    @Id
    @GeneratedValue
    private Long id;

    @Basic
    @Column(name = "dateLog", nullable = true)
    private Timestamp dateLog;

    @Basic
    @Column(name = "type", nullable = true)
    private String type;

    @Basic
    @Column(name = "descript", nullable = true)
    private String descript;

    @Basic
    @Column(name = "status", nullable = true)
    private String status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Timestamp getDateLog() {
        return dateLog;
    }

    public void setDateLog(Timestamp dateLog) {
        this.dateLog = dateLog;
    }
    public LogEntity() {

    }

    public LogEntity( Timestamp dateLog, String type, String descript, String status) {
        this.dateLog = dateLog;
        this.type = type;
        this.descript = descript;
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescript() {
        return descript;
    }

    public void setDescript(String descript) {
        this.descript = descript;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
