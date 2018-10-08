
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

        switch (columnIndex) {
            case 0:
                return m.getLdt().format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
            case 1:
                return m.getLdt().format(DateTimeFormatter.ofPattern("hh:mm"));
            case 2:
                return m.getKennzeichen();
            case 3:
                return m.getGemessen();
            case 4:
                return m.getErlaubt();
            case 5:
                return m.getUebertreten();
            default:
                return "???";
        }

    }

    public void add(Measurement m) {
        measurements.add(m);
        fireTableRowsInserted(measurements.size() - 1, measurements.size() - 1);
    }

    public void delete(int idx) {
        measurements.remove(idx);
        fireTableRowsDeleted(idx, idx);
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

}
