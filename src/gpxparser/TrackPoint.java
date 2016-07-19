/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gpxparser;

/**
 *
 * @author yonseca
 */
public class TrackPoint {
    
    private Double lat, lon, altitude;

    public TrackPoint(Double lat, Double lon, Double altitude) {
        this.lat = lat;
        this.lon = lon;
        this.altitude = altitude;
    }

    public TrackPoint() {
    }


    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLon() {
        return lon;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }

    public Double getAltitude() {
        return altitude;
    }

    public void setAltitude(Double altitude) {
        this.altitude = altitude;
    }
    
    
    
    
}
