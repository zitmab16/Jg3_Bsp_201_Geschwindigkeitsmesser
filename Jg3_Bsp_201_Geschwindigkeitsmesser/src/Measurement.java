
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
    private int gemessen;
    private int erlaubt;
    private double uebertreten;

    public Measurement(LocalDateTime ldt, String kennzeichen, int gemessen, int erlaubt) {
        this.ldt = ldt;
        this.kennzeichen = kennzeichen;
        this.gemessen = gemessen;
        this.erlaubt = erlaubt;
        calcUeberschreitung();

    }

    public void calcUeberschreitung() {
        uebertreten = gemessen - erlaubt;
    }

    public LocalDateTime getLdt() {
        return ldt;
    }

    public String getKennzeichen() {
        return kennzeichen;
    }

    public int getGemessen() {
        return gemessen;
    }

    public int getErlaubt() {
        return erlaubt;
    }

    public double getUebertreten() {
        return uebertreten;
    }

}
