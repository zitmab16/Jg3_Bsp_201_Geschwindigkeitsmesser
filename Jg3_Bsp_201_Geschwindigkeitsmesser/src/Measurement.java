
import java.time.LocalDateTime;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vizug
 */
public class Measurement {
    
    private LocalDateTime ldt;
    private String kennzeichen;
    private double gemessen;
    private double erlaubt;
    private double uebertreten;

    public Measurement(LocalDateTime ldt, String kennzeichen, double gemessen, double erlaubt, double uebertreten) {
        this.ldt = ldt;
        this.kennzeichen = kennzeichen;
        this.gemessen = gemessen;
        this.erlaubt = erlaubt;
        this.uebertreten = uebertreten;
    }

    public LocalDateTime getLdt() {
        return ldt;
    }

    public String getKennzeichen() {
        return kennzeichen;
    }

    public double getGemessen() {
        return gemessen;
    }

    public double getErlaubt() {
        return erlaubt;
    }

    public double getUebertreten() {
        return uebertreten;
    }
    
    
    
}
