package dao;

import javax.persistence.*;

import static javax.persistence.GenerationType.AUTO;

@Entity
@Table(name = "coords")
public class Coords {

    @Id
    @GeneratedValue(strategy = AUTO)
    @Column(name = "ID")
    int id;

    @Column(name = "LAT")
    double lat;

    @Column(name = "LON")
    double lon;

    @Column(name = "AZIMUTH")
    double asimuth;

    @Column(name = "SPEED")
    double speed;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public double getAsimuth() {
        return asimuth;
    }

    public void setAsimuth(double asimuth) {
        this.asimuth = asimuth;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
}
