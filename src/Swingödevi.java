
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;


public class Swingödevi extends javax.swing.JFrame {

    /**
     * Creates new form Swingödevi
     */
    public Swingödevi() {
        initComponents();
    }
         DefaultListModel<String> model = new DefaultListModel<>();
         DefaultListModel<String> model2 = new DefaultListModel<>();
         DefaultListModel<String> model3 = new DefaultListModel<>();
         DefaultListModel<String>  model4 = new DefaultListModel<>();
        
    
     public boolean isNumeric(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                JOptionPane.showMessageDialog( null, "It must be integer", "ERROR!!!", JOptionPane.ERROR_MESSAGE);
                return false;
            }

        }
        return true;
    }
     public boolean smallerhundred(int sayi){
         
         if(sayi < 101){
             return true;
         }else{
             JOptionPane.showMessageDialog( null, "Smaller than hundred", "ERROR!!!", JOptionPane.ERROR_MESSAGE);
             return false;
         }

     }
     public double schema1(){
         
        double assweight = 0.2;
        double quizweight = 0.1;
        double midtermweight = 0.3;
        double finalweight = 0.4;
        int [] array1 = new int[4];
        int [] array2 = new int[2];
        int [] array3 = new int[2];
        int [] array4 = new int[1];
        int a =0,b = 0,c = 0,d = 0;
        double total;
        for(int i=0;i<4;i++){
        array1[i] = Integer.parseInt(model.getElementAt(i));
        a += array1[i];
        }
        for(int j = 0;j<2;j++){
        array2[j] = Integer.parseInt(model2.getElementAt(j));
        b += array2[j];
        }
        for(int k = 0;k<2;k++){
        array3[k] = Integer.parseInt(model3.getElementAt(k));
        c += array3[k];
        }
        for(int l = 0;l<1;l++){
        array4[l] = Integer.parseInt(model4.getElementAt(l));
        d += array4[l];
        }
        total = (a*assweight)/4 + (b*quizweight)/2 + (c*midtermweight)/2 + (d*finalweight);
         
         return total;
     }
        public double schema2(){
         
        double assweight = 0.2;
        double quizweight = 0.1;
        double midtermweight = 0.4;
        double finalweight = 0.3;
        int [] array1 = new int[2];
        int [] array2 = new int[3];
        int [] array3 = new int[2];
        int [] array4 = new int[1];
        int a =0,b = 0,c = 0,d = 0;
        double total;
        for(int i=0;i<2;i++){
        array1[i] = Integer.parseInt(model.getElementAt(i));
        a += array1[i];
        }
        for(int j = 0;j<3;j++){
        array2[j] = Integer.parseInt(model2.getElementAt(j));
        b += array2[j];
        }
        for(int k = 0;k<2;k++){
        array3[k] = Integer.parseInt(model3.getElementAt(k));
        c += array3[k];
        }
        for(int l = 0;l<1;l++){
        array4[l] = Integer.parseInt(model4.getElementAt(l));
        d += array4[l];
        }
        total = (a*assweight)/2 + (b*quizweight)/3 + (c*midtermweight)/2 + (d*finalweight);
         
         return total;
     }
public String LetterGrade(double generaltotal) {
        if(generaltotal >= 96 && generaltotal <= 100){
            return "A";
          }else if(generaltotal >= 91 && generaltotal <= 95){
        return "A-";
         }else if(generaltotal >= 84 && generaltotal <= 90){
        return "B+";
         }else if(generaltotal >= 77 && generaltotal <= 83){
        return "B";
         }else if(generaltotal >= 70 && generaltotal <= 76){
        return "B-";
         }else if(generaltotal >= 65 && generaltotal <= 69){
        return "C+";
          }else if(generaltotal >= 60 && generaltotal <= 64){
        return "C";
             }else{
        return "F";
    }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList4 = new javax.swing.JList<>();
        addgrade1 = new javax.swing.JButton();
        addgrade2 = new javax.swing.JButton();
        addgrade3 = new javax.swing.JButton();
        addgrade4 = new javax.swing.JButton();
        deletegrade1 = new javax.swing.JButton();
        deletegrade2 = new javax.swing.JButton();
        deletegrade3 = new javax.swing.JButton();
        deletegrade4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        Schemas = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        LetterGrade = new javax.swing.JTextField();
        assignmentpercentage = new javax.swing.JTextField();
        quizpercentage = new javax.swing.JTextField();
        midtermpercentage = new javax.swing.JTextField();
        finalpercentage = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(jList1);

        jScrollPane2.setViewportView(jList2);

        jScrollPane3.setViewportView(jList3);

        jScrollPane4.setViewportView(jList4);

        addgrade1.setText("Add Grade");
        addgrade1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addgrade1ActionPerformed(evt);
            }
        });

        addgrade2.setText("Add Grade");
        addgrade2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addgrade2ActionPerformed(evt);
            }
        });

        addgrade3.setText("Add Grade");
        addgrade3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addgrade3ActionPerformed(evt);
            }
        });

        addgrade4.setText("Add Grade");
        addgrade4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addgrade4ActionPerformed(evt);
            }
        });

        deletegrade1.setText("Delete Grade");
        deletegrade1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletegrade1ActionPerformed(evt);
            }
        });

        deletegrade2.setText("Delete Grade");
        deletegrade2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletegrade2ActionPerformed(evt);
            }
        });

        deletegrade3.setText("Delete Grade");
        deletegrade3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletegrade3ActionPerformed(evt);
            }
        });

        deletegrade4.setText("Delete Grade");
        deletegrade4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletegrade4ActionPerformed(evt);
            }
        });

        jButton1.setText("CALCULATE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Schemas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Schema 1", "Schema 2" }));
        Schemas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SchemasActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Assignment Grades");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Quiz Grades");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Midterm Grades");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Final Grade");

        LetterGrade.setEditable(false);
        LetterGrade.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        LetterGrade.setText("\n");
        LetterGrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LetterGradeActionPerformed(evt);
            }
        });

        assignmentpercentage.setEditable(false);

        quizpercentage.setEditable(false);
        quizpercentage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quizpercentageActionPerformed(evt);
            }
        });

        midtermpercentage.setEditable(false);

        finalpercentage.setEditable(false);

        jLabel5.setFont(new java.awt.Font("Elephant", 0, 24)); // NOI18N
        jLabel5.setText("Percentages for chosen Schema");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                        .addGap(228, 228, 228))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Schemas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(addgrade1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addComponent(deletegrade1, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)))
                                .addGap(55, 55, 55)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(addgrade2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(deletegrade2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(57, 57, 57))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(assignmentpercentage, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(quizpercentage, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(midtermpercentage, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(finalpercentage, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(addgrade3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(deletegrade3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(47, 47, 47)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(addgrade4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(deletegrade4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(LetterGrade, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(166, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(306, 306, 306)
                .addComponent(jLabel5)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addgrade1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addgrade2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addgrade3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addgrade4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deletegrade1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deletegrade2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deletegrade3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deletegrade4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(Schemas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LetterGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(assignmentpercentage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(quizpercentage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(midtermpercentage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(finalpercentage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(96, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      int index =  Schemas.getSelectedIndex();
      double result = 0;
      if(index == 0){
         result = schema1();
         
         JOptionPane.showMessageDialog(this, result);
         LetterGrade.setText(LetterGrade(result));
      }
     else{
       result = schema2();
       JOptionPane.showMessageDialog(this, result);
          LetterGrade.setText(LetterGrade(result));
      }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void addgrade1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addgrade1ActionPerformed
         
        jList1.setModel(model);
        String Grade = JOptionPane.showInputDialog("Enter A number");
        boolean itsdigit = isNumeric(Grade);
        int number = Integer.parseInt(Grade);
        if(itsdigit){
            if((smallerhundred(number))){
           model.addElement(Grade);
               
            }
      }
    }//GEN-LAST:event_addgrade1ActionPerformed

    private void addgrade2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addgrade2ActionPerformed
             jList2.setModel(model2);
String Grade2 = JOptionPane.showInputDialog("Enter A number");
boolean itsdigit = isNumeric(Grade2);
int number = Integer.parseInt(Grade2);
        if(itsdigit){
            if((smallerhundred(number))){
           model2.addElement(Grade2);
            }
      }
    }//GEN-LAST:event_addgrade2ActionPerformed

    private void addgrade3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addgrade3ActionPerformed
         jList3.setModel(model3);
       String Grade3 = JOptionPane.showInputDialog("Enter A number");
        boolean itsdigit = isNumeric(Grade3);
        int number = Integer.parseInt(Grade3);
        if(itsdigit){
             if((smallerhundred(number))){
           model3.addElement(Grade3);
             }
      }
    }//GEN-LAST:event_addgrade3ActionPerformed

    private void addgrade4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addgrade4ActionPerformed
          
        jList4.setModel(model4);
       String Grade4 = JOptionPane.showInputDialog("Enter A number");
        boolean itsdigit = isNumeric(Grade4);
        int number = Integer.parseInt(Grade4);
        if(itsdigit){
             if((smallerhundred(number))){
           model4.addElement(Grade4);
             }
      }
    }//GEN-LAST:event_addgrade4ActionPerformed

    private void deletegrade1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletegrade1ActionPerformed
        if(jList1.getSelectedIndex() > -1){
            model.remove(jList1.getSelectedIndex());
       }
    }//GEN-LAST:event_deletegrade1ActionPerformed

    private void deletegrade2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletegrade2ActionPerformed
         if(jList2.getSelectedIndex() > -1){
            model2.remove(jList2.getSelectedIndex());
       }
       
    }//GEN-LAST:event_deletegrade2ActionPerformed

    private void deletegrade3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletegrade3ActionPerformed
        if(jList3.getSelectedIndex() > -1){
            model3.remove(jList3.getSelectedIndex());
       }
           
    }//GEN-LAST:event_deletegrade3ActionPerformed

    private void deletegrade4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletegrade4ActionPerformed
           if(jList4.getSelectedIndex() > -1){
            model4.remove(jList4.getSelectedIndex());
       }
    }//GEN-LAST:event_deletegrade4ActionPerformed

    private void SchemasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SchemasActionPerformed
  int index =  Schemas.getSelectedIndex();
  if(index == 0){
      assignmentpercentage.setText("0.2");
         quizpercentage.setText("0.1");
         midtermpercentage.setText("0.3");
         finalpercentage.setText("0.4");
  }else{
      assignmentpercentage.setText("0.2");
         quizpercentage.setText("0.1");
         midtermpercentage.setText("0.4");
         finalpercentage.setText("0.3");
  }
        
        
    }//GEN-LAST:event_SchemasActionPerformed

    private void LetterGradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LetterGradeActionPerformed
        
    }//GEN-LAST:event_LetterGradeActionPerformed

    private void quizpercentageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quizpercentageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quizpercentageActionPerformed

    
   
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
            java.util.logging.Logger.getLogger(Swingödevi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Swingödevi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Swingödevi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Swingödevi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Swingödevi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField LetterGrade;
    private javax.swing.JComboBox<String> Schemas;
    private javax.swing.JButton addgrade1;
    private javax.swing.JButton addgrade2;
    private javax.swing.JButton addgrade3;
    private javax.swing.JButton addgrade4;
    private javax.swing.JTextField assignmentpercentage;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton deletegrade1;
    private javax.swing.JButton deletegrade2;
    private javax.swing.JButton deletegrade3;
    private javax.swing.JButton deletegrade4;
    private javax.swing.JTextField finalpercentage;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JList<String> jList3;
    private javax.swing.JList<String> jList4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField midtermpercentage;
    private javax.swing.JTextField quizpercentage;
    // End of variables declaration//GEN-END:variables
}
