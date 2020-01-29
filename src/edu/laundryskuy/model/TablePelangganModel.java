/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.laundryskuy.model;

import edu.laundryskuy.entity.Pelanggan;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Acer
 */
public class TablePelangganModel extends AbstractTableModel{
    
    private List<Pelanggan> list = new ArrayList<Pelanggan>();

    public void setList(List<Pelanggan> list) {
        this.list = list;
    }
    
    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return 9;
    }

    public boolean add(Pelanggan e) {
       try {
            return list.add(e);
        } finally {
            fireTableRowsInserted(getRowCount()-1, getRowCount()-1);
        }
    }

    public Pelanggan get(int index) {
        return list.get(index);
    }

    public Pelanggan set(int index, Pelanggan element) {
        try {
            return list.set(index, element);
        } finally {
            fireTableRowsUpdated(index, index);
        }
        
    }

    public Pelanggan remove(int index) {
       try {
            return list.remove(index);
        } finally {
            fireTableRowsDeleted(index, index);
        }
        
    }
    
    

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "NO_RAK";
            case 1:
                return "NAMA";
            case 2:
                return "BERAT";
            case 3:
                return "TGL_TERIMA";
            case 4:
                return "TGL_SELESAI";
            case 5:
                return "TELP";
            case 6:
                return "TOTAL";
            case 7:
                return "KET_LUNAS";
            case 8:
                return "KET_SELESAI";
            default:
                return null;    
        }
    }

    
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return list.get(rowIndex).getNo_rak();
            case 1:
                return list.get(rowIndex).getNama();
            case 2:
                return list.get(rowIndex).getBerat();
            case 3:
                return list.get(rowIndex).getTgl_terima();
            case 4:
                return list.get(rowIndex).getTgl_selesai();
            case 5:
                return list.get(rowIndex).getTelp();
            case 6:
                return list.get(rowIndex).getTotal();
            case 7:
                return list.get(rowIndex).getKet_lunas();
            case 8:
                return list.get(rowIndex).getKet_selesai();
            default:
                return null;
        }
    }
    
}
