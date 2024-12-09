/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package TUNAME;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import java.time.*;
import java.util.*;
import javax.swing.*;

/**
 *
 * @author raulc
 */
public class panelCalendario extends javax.swing.JPanel {

    dialogoDia selFecha;
    fecha fechaAct;
    LocalDate fechaLocal;
    private Color colorCboMes = new Color(187,187,187);
    private Color colorCboAnio= new Color(187,187,187);
    private Color colorBtnDia = new Color(187,187,187);
    
    private Color colorFontCboMes = new Color(187,187,187);
    private Color colorFontCboAnio= new Color(187,187,187);
    private Color colorFontBtnDia = new Color(187,187,187);
    
    private Font FontCboMes = new Font("Segoe UI", Font.PLAIN,12);
    private Font FontCboAnio= new Font("Segoe UI", Font.PLAIN,12);
    private Font FontBtnDia = new Font("Segoe UI", Font.PLAIN,12);
    public panelCalendario() {
        this.setBorder(null);
        
        
        
        initComponents();
        fechaAct = new fecha();
               iniCbo();
    }

    public void iniCbo(){
        LocalDate aux = LocalDate.now();
        for(int i = aux.getYear()-50; i < aux.getYear()+50; i++)
            cboAnio.addItem(i+"");
        cboAnio.setSelectedIndex(50);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cboAnio = new javax.swing.JComboBox<>();
        cboMes = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        btnDia = new javax.swing.JButton();
        cboDia = new javax.swing.JComboBox<>();

        setLayout(new java.awt.GridLayout(1, 3));

        cboAnio.setToolTipText("");
        cboAnio.setOpaque(true);
        cboAnio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboAnioActionPerformed(evt);
            }
        });
        add(cboAnio);

        cboMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        cboMes.setOpaque(true);
        cboMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboMesActionPerformed(evt);
            }
        });
        add(cboMes);

        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        btnDia.setText("Seleccionar Dia");
        btnDia.setOpaque(true);
        btnDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiaActionPerformed(evt);
            }
        });
        jPanel1.add(btnDia);

        cboDia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cboDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", " " }));
        cboDia.setEnabled(false);
        cboDia.setOpaque(true);
        cboDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboDiaActionPerformed(evt);
            }
        });
        jPanel1.add(cboDia);

        add(jPanel1);
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiaActionPerformed
        fechaLocal = LocalDate.of(Integer.parseInt(cboAnio.getSelectedItem().toString()),cboMes.getSelectedIndex()+1,1);
        updateData();

        selFecha = new dialogoDia(null, true, fechaLocal.lengthOfMonth(),fechaLocal.getDayOfWeek().getValue()%7);
        selFecha.setVisible(true);
        fechaAct.setDate(selFecha.getDiaElegido());
        cboDia.setSelectedIndex(selFecha.getDiaElegido()-1);
        //lblDia.setText(selFecha.getDiaElegido()+"");
        
    }//GEN-LAST:event_btnDiaActionPerformed

    private void cboMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboMesActionPerformed
        cboDia.setSelectedIndex(-1);
    }//GEN-LAST:event_cboMesActionPerformed

    private void cboAnioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboAnioActionPerformed
        cboDia.setSelectedIndex(-1);    }//GEN-LAST:event_cboAnioActionPerformed

    private void cboDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboDiaActionPerformed
    }//GEN-LAST:event_cboDiaActionPerformed

    

    
    // <editor-fold defaultstate="collapsed" desc="desplegar para ver los sets y gets">
    public fecha getFechaAct() {
        return fechaAct;
    }

    public Color getColorCboMes() {
        return colorCboMes;
    }

    public void setColorCboMes(Color colorCboMes) {
        this.colorCboMes = colorCboMes;
        cboMes.setBackground(colorCboMes);
    }

    public Color getColorCboAnio() {
        return colorCboAnio;
    }

    public void setColorCboAnio(Color colorCboAnio) {
        this.colorCboAnio = colorCboAnio;
        cboAnio.setBackground(colorCboAnio);
    }

    public Color getColorBtnDia() {
        return colorBtnDia;
    }

    public void setColorBtnDia(Color colorBtnDia) {
        this.colorBtnDia = colorBtnDia;
        btnDia.setBackground(colorBtnDia);
    }

    public Color getColorFontCboMes() {
        return colorFontCboMes;
    }

    public void setColorFontCboMes(Color colorFontCboMes) {
        this.colorFontCboMes = colorFontCboMes;
        cboMes.setForeground(colorFontCboMes);
    }

    public Color getColorFontCboAnio() {
        return colorFontCboAnio;
    }

    public void setColorFontCboAnio(Color colorFontCboAnio) {
        this.colorFontCboAnio = colorFontCboAnio;
        cboAnio.setForeground(colorFontCboAnio);
    }

    public Color getColorFontBtnDia() {
        return colorFontBtnDia;
    }

    public void setColorFontBtnDia(Color colorFontBtnDia) {
        this.colorFontBtnDia = colorFontBtnDia;
        btnDia.setForeground(colorFontBtnDia);
    }

    public Font getFontCboMes() {
        return FontCboMes;
    }

    public void setFontCboMes(Font FontCboMes) {
        this.FontCboMes = FontCboMes;
        cboMes.setFont(FontCboMes);
    }

    public Font getFontCboAnio() {
        return FontCboAnio;
    }

    public void setFontCboAnio(Font FontCboAnio) {
        this.FontCboAnio = FontCboAnio;
        cboAnio.setFont(FontCboAnio);
    }

    public Font getFontBtnDia() {
        return FontBtnDia;
    }

    public void setFontBtnDia(Font FontBtnDia) {
        this.FontBtnDia = FontBtnDia;
        btnDia.setFont(FontBtnDia);
    }
    
    
    
    // </editor-fold>  
    
    
    
private void updateData(){
        fechaAct.setYear(Integer.parseInt(cboAnio.getSelectedItem().toString()));
        fechaAct.setMonth(cboMes.getSelectedIndex());
    }


    public int getMes(){
        return fechaAct.getMonth();
    }
    
    public int getDia(){
        return fechaAct.getDate();
    }
    
    public int getAnio(){
        return fechaAct.getYear();
    }
    
    public fecha getFechacomp(){
        return fechaAct;
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDia;
    private javax.swing.JComboBox<String> cboAnio;
    private javax.swing.JComboBox<String> cboDia;
    private javax.swing.JComboBox<String> cboMes;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

class fecha extends Date{
    Calendar ogDate;
    String dia[] ={"Domingo","Lunes","Martes","Miercoles","Jueves","Viernes","Sabado"};
    String mes[] = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
    
    public fecha(){
        ogDate = Calendar.getInstance();
    }
    
    @Override
    public void setDate(int date) {
        super.setDate(date);
    }
    @Override
    public void setMonth(int month) {
        super.setMonth(month);
    }
    @Override
    public void setYear(int year) {
        super.setYear(year);
    }
    @Override
    public String toString() {
        //System.out.println(getMonth()+ " "+mes[11]);
        return dia[getDay()]+" "+getDate() + " de "+mes[getMonth()]+" del "+getYear();
    }
}

class dialogoDia extends javax.swing.JDialog {

    /**
     * Creates new form dialogoDi
     */
    private JRadioButton fechas[];
    private Calendar c = Calendar.getInstance();
    private int delay;
    private JButton btnAceptar;
    private String dia[] ={"D","L","M","M","J","V","S"};
    private int diaElegido;
    
    public dialogoDia(java.awt.Frame parent, boolean modal,int lenght,int d) {
        super(parent, modal);
        fechas = new JRadioButton[lenght];
        btnGrupo = new ButtonGroup();
        delay = d;
        btnAceptar = new JButton();
        CreacionVentana();
        
    }
    public void btnAceptarAct(){
        for(int i = 0; i < fechas.length; i++)
            if(fechas[i].isSelected()){
                diaElegido = i+1;
                break;
            }
        this.dispose();
    }

    public int getDiaElegido() {
        return diaElegido;
    }
    
    public void CreacionVentana(){
        this.setTitle("Seleccione el día");
        this.setSize(440,400);
        this.setLayout(null);
        
        int xAct = 15, yAct = 40;
        int pos = 0;
        for(int i = 0; i < 7 && pos < fechas.length;i++){
            if(i == 0){
                for(int j = 0; j < dia.length;j++){
                    JLabel diaS = new JLabel();
                    diaS.setText(dia[j]);
                    diaS.setBounds(xAct,yAct,40,30);
                    this.getContentPane().add(diaS);
                    xAct+=60;
                }
            }else{
                for(int j = 0; j < 7 && pos < fechas.length;j++){
                    if(delay == 0){
                        fechas[pos] = new JRadioButton();
                        fechas[pos].setText((pos+1)+"");
                        fechas[pos].setBounds(xAct,yAct,40,30);
                        this.getContentPane().add(fechas[pos]);
                        btnGrupo.add(fechas[pos]);
                        pos++;
                    }else
                        delay--;
                    xAct+=60;
                }
            }
            xAct = 10;
            yAct+=40;
            
        }        
        btnAceptar.setBounds(20, 320, 100, 30);
        btnAceptar.setText("ACEPTAR");
        this.getContentPane().add(btnAceptar);

        btnAceptar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                btnAceptarAct();
            }
            
        });
    
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        btnGrupo = new javax.swing.ButtonGroup();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        pack();
    }// </editor-fold>                        

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify                     
    private javax.swing.ButtonGroup btnGrupo;
    // End of variables declaration                   
}

