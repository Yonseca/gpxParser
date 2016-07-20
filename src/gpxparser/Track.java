/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gpxparser;

import java.util.ArrayList;

/**
 *
 * @author yonseca
 */
public class Track {
    
    private ArrayList<TrackPoint> points;
    private String name;

    public Track() {
        points = new ArrayList<TrackPoint>(); 
    }

    public Track(ArrayList<TrackPoint> points, String name) {
        this.points = points;
        this.name = name;
    }
    
    
    
    public void addPoint(TrackPoint point){
        points.add(point); 
    }
    
    public void addPoint(Double lat, Double lon, Double alt){
        TrackPoint point = new TrackPoint();
        point.setAltitude(alt);
        point.setLat(lat);
        point.setLon(lon);
        addPoint(point);
    }

    public ArrayList<TrackPoint> getPoints() {
        return points;
    }

    public void setPoints(ArrayList<TrackPoint> points) {
        this.points = points;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
}
