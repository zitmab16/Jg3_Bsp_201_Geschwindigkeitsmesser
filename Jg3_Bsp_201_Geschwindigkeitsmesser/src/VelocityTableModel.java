
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author vizug
 */
public class VelocityTableModel extends AbstractTableModel {

    private ArrayList<Measurement> measurements = new ArrayList<>();
    private static final String[] COLNAMES = {"Datum", "Uhrzeit", "Kennzeichen", "Gemessen", "Erlaubt", "Übertretung"};

    @Override
    public int getRowCount() {
        return measurements.size();
    }

    @Override
    public int getColumnCount() {
        return COLNAMES.length;
    }

    @Override
    public String getColumnName(int column) {
        return COLNAMES[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Measurement m = measurements.get(rowIndex);

       return m;
        }

    

    public void add(Measurement m) {
        measurements.add(m);
        fireTableRowsInserted(measurements.size() - 1, measurements.size() - 1);
    }

    public void delete(int [] idx) {
       
        for (int i = 0; i < idx.length-1; i++) {
             measurements.remove(idx[i]);
           
        }
         fireTableRowsUpdated(0, measurements.size()-1);
    }

    public double calcAVG() {
        int wert = 0;
        int c = 0;
        double avg=0;
        for (Measurement measurement : measurements) {
            wert += measurement.getUebertreten();
            c++;
        }
        avg = wert / c;

        return avg;
    }
    public void save(File f) throws Exception {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));

        for (Measurement s: measurements) {
            oos.writeObject(s);
        }
    }

    public void load(File f) throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f));
        Object a = null;
        while ((a = ois.readObject()) != null) {
            add((Measurement) a);
        }

}
}
