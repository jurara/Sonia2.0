/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jurara
 */
import java.awt.event.KeyEvent;

import static javax.swing.JOptionPane.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
public class AFN extends javax.swing.JFrame {

    /**
     * Creates new form AFN
     */
    public AFN() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtQ = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtS = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtABC = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtCadena = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        MiTabla = new javax.swing.JTable();
        btnTabla = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Q={");

        txtQ.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtQKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtQKeyReleased(evt);
            }
        });

        jLabel2.setText("}");

        txtS.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSKeyPressed(evt);
            }
        });

        jLabel4.setText("S=");

        txtF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFKeyPressed(evt);
            }
        });

        jLabel3.setText("}");

        jLabel5.setText("F={");

        txtABC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtABCKeyPressed(evt);
            }
        });

        jLabel6.setText("}");

        jLabel7.setText(" Abecedario={");

        jLabel8.setText("Validador de AFN");

        jButton1.setText("limpiar campos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Validar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel9.setText("Cadena a validar:");

        MiTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(MiTabla);

        btnTabla.setText("Generar Tabla");
        btnTabla.setEnabled(false);
        btnTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTablaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(69, 69, 69)
                                    .addComponent(jLabel1))
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtQ, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtABC, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addGap(27, 27, 27)
                                .addComponent(btnTabla))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtS, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 706, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(462, 462, 462)
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtCadena, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(242, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtABC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(btnTabla))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCadena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    String q[],s[],f[],ABC[];
    
    
    public boolean qs(){
       int c=0;
       String temp="",temp2;
       q=txtQ.getText().split(",");
       for(int j=0;j<q.length;j++){  
       for(int i=0;i<q.length;i++){
           if(q[j].equals(q[i])){
           c++;
           if(i!=j){
               temp+=q[j]+", ";
           }
        }
       }
       }
       temp2=temp.substring(0,(temp.length())/2);
       
       if(c!=q.length){
       showMessageDialog(null,"tiene una q repetida: "+temp2);
       return false;
       }
       return true;
    }
    
    public boolean vals(){
        if(txtS.getText().equals("")){
           return false;
       }
        String cad=txtQ.getText();
        s=txtS.getText().split(",");
        int c=0;
        if(s.length!=1){
            showMessageDialog(null,"solo se puede tener un inicio");
            return false;
        }
        for(int i=0;i<q.length;i++){
            if(s[0].equals(q[i])){
                c++;
            }
        }  
        if(c==0){
           showMessageDialog(null,s[0]+" no esta en Q");
           return false;
       }
       return true;
    }
    
    public boolean valfin(){
       if(txtF.getText().equals("")){
           return false;
       }
        int c=0,c2=0; 
        
       String temp="",temp2="",cad="";
       f=txtF.getText().split(",");
       for(int j=0;j<f.length;j++){  
       for(int i=0;i<f.length;i++){
           if(f[j].equals(f[i])){
           c++;
           if(i!=j){
               temp+=f[j]+", ";
           }
        }
       }
       }
       temp2=temp.substring(0,(temp.length())/2);
       
       if(c!=f.length){
       showMessageDialog(null,"tiene un fin repetido: "+temp2);
       return false;
       }
       
       for(int j=0;j<f.length;j++){  
       for(int i=0;i<q.length;i++){
           if(!f[j].equals(q[i])){
               c2++;
           }
       }
       if(c2==q.length){
         cad+=f[j]+", ";  
       }
       c2=0;
       }
       if(!cad.equals("")){
           showMessageDialog(null,"este fin no es valido: "+cad);
           return false;
       }
       
       
       return true;
    }
    
    public boolean validarABC(){
       if(txtABC.getText().equals("")){
           return false;
       }
       int c=0,ca=0;
       String temp="",temp2;
       ABC=txtABC.getText().split(",");
       for(int j=0;j<ABC.length;j++){  
       for(int i=0;i<ABC.length;i++){
           if(ABC[j].equals(ABC[i])){
           c++;
           if(i!=j){
               temp+=ABC[j]+", ";
           }
        }
       }
       }
       temp2=temp.substring(0,(temp.length())/2);
       
       if(c!=ABC.length){
       showMessageDialog(null,"Tiene repetidos en su Abecedario a: "+temp2);
       return false;
       }
       for(int i=0;i<ABC.length;i++){
           if(ABC[i].length()!=1){
               showMessageDialog(null,ABC[i]+" no es valido por favor solo ingrese una letra");
               ca++;
               
           }
           
       }
       if(ca!=0){
           return false;
       }
       return true; 
    }
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       if(
       qs()==true &&
       vals()==true &&
       valfin()==true &&
       validarABC()==true){
       showMessageDialog(null,"los campos son validos");
       btnTabla.setEnabled(true);
       }
       else{
       btnTabla.setEnabled(false);        
       }
           
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtQKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQKeyReleased
       //no lo ocupe
    }//GEN-LAST:event_txtQKeyReleased

    private void txtQKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQKeyPressed
          if(evt.getKeyCode()==KeyEvent.VK_ENTER){
               jButton2ActionPerformed(null);
           }
    }//GEN-LAST:event_txtQKeyPressed

    private void txtSKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            
            jButton2ActionPerformed(null);
           }
    }//GEN-LAST:event_txtSKeyPressed

    private void txtFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            
            jButton2ActionPerformed(null);
            
           }
    }//GEN-LAST:event_txtFKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        txtABC.setText("");
        txtCadena.setText("");
        txtF.setText("");
        txtQ.setText("");
        txtS.setText("");
        DefaultTableModel modelo = new DefaultTableModel();
        MiTabla.setModel(modelo);
        btnTabla.setEnabled(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTablaActionPerformed
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Q\\Σ");
        for(int i=0;i<ABC.length;i++){
        modelo.addColumn(ABC[i]);
        }
        for(int i=0;i<q.length;i++){
        String temp[]=new String[1];
        temp[0]=q[i];
        modelo.addRow(temp);
        }
        MiTabla.setModel(modelo);
    }//GEN-LAST:event_btnTablaActionPerformed

    private void txtABCKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtABCKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
               
            jButton2ActionPerformed(null);
           }
    }//GEN-LAST:event_txtABCKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AFN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AFN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AFN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AFN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AFN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable MiTabla;
    private javax.swing.JButton btnTabla;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtABC;
    private javax.swing.JTextField txtCadena;
    private javax.swing.JTextField txtF;
    private javax.swing.JTextField txtQ;
    private javax.swing.JTextField txtS;
    // End of variables declaration//GEN-END:variables
}
