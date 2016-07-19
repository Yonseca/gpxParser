/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gpsparser;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

/**
 *
 * @author yonseca
 */
public class GpsParser {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File input = new File("/home/yonseca/4.gpx"); 
        try {
            Document doc = Jsoup.parse(input, "UTF-8");
            //System.out.println(doc.text());
            Elements track = doc.getElementsByTag("trk");
            System.out.println(track.text());
        } catch (IOException ex) {
            Logger.getLogger(GpsParser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
