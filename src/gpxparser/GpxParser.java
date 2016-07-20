/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gpxparser;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 *
 * @author yonseca
 */
public class GpxParser {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File input = new File("/home/yonseca/4.gpx");
        Track track = new Track(); 
        try {
            Document doc = Jsoup.parse(input, "UTF-8");
            //System.out.println(doc.text());
            Elements trackData = doc.getElementsByTag("trk");
            Elements trackName = trackData.select("name"); 
            track.setName(trackName.text());
            Elements trkPt = trackData.select("trkseg").select("trkpt");
            for (Iterator<Element> iterator = trkPt.iterator(); iterator.hasNext();) {
                Element dataPoint = iterator.next();
                Double lat = Double.parseDouble(dataPoint.attr("lat"));
                Double lon = Double.parseDouble(dataPoint.attr("lon"));
                Double altitude = Double.parseDouble(dataPoint.select("ele").text()); 
                track.addPoint(lat, lon, altitude);
            }
            System.out.println("");
            
        } catch (IOException ex) {
            Logger.getLogger(GpxParser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
