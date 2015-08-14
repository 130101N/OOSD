
package EmployeeInfo;

/**
 *
 * @author Nayomi
 */
public class EmployeeInformation extends javax.swing.JFrame {

    InfomationTable IT;
    
    public EmployeeInformation() {
        initComponents();
        getContentPane().setBackground(new java.awt.Color(153, 153, 153));
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        base = new javax.swing.JPanel();
        pEmp = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        distribution = new javax.swing.JButton();
        printing = new javax.swing.JButton();
        cardShop = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        pEmp.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel1.setText("Employee Information");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        distribution.setBackground(new java.awt.Color(255, 255, 255));
        distribution.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/distribution.PNG"))); // NOI18N
        distribution.setBorder(null);
        distribution.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                distributionActionPerformed(evt);
            }
        });

        printing.setBackground(new java.awt.Color(255, 255, 255));
        printing.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/printing.PNG"))); // NOI18N
        printing.setBorder(null);
        printing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printingActionPerformed(evt);
            }
        });

        cardShop.setBackground(new java.awt.Color(255, 255, 255));
        cardShop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cardShop.PNG"))); // NOI18N
        cardShop.setBorder(null);
        cardShop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardShopActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.PNG"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pEmpLayout = new javax.swing.GroupLayout(pEmp);
        pEmp.setLayout(pEmpLayout);
        pEmpLayout.setHorizontalGroup(
            pEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pEmpLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pEmpLayout.createSequentialGroup()
                .addContainerGap(164, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(156, 156, 156))
            .addGroup(pEmpLayout.createSequentialGroup()
                .addGap(244, 244, 244)
                .addGroup(pEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cardShop)
                    .addComponent(printing)
                    .addComponent(distribution))
                .addContainerGap(248, Short.MAX_VALUE))
        );
        pEmpLayout.setVerticalGroup(
            pEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pEmpLayout.createSequentialGroup()
                .addComponent(jButton1)
                .addGap(83, 83, 83)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(distribution, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(printing, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cardShop, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout baseLayout = new javax.swing.GroupLayout(base);
        base.setLayout(baseLayout);
        baseLayout.setHorizontalGroup(
            baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 697, Short.MAX_VALUE)
            .addGroup(baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pEmp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        baseLayout.setVerticalGroup(
            baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 495, Short.MAX_VALUE)
            .addGroup(baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pEmp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 717, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(base, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 517, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(11, 11, 11)
                    .addComponent(base, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(11, 11, 11)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void distributionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_distributionActionPerformed
        IT = new InfomationTable("Distribution");
        IT.setVisible(true);
    }//GEN-LAST:event_distributionActionPerformed

    private void cardShopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardShopActionPerformed
        IT = new InfomationTable("CardShop");
        IT.setVisible(true);
    }//GEN-LAST:event_cardShopActionPerformed

    private void printingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printingActionPerformed
        IT = new InfomationTable("Printing");
        IT.setVisible(true);
    }//GEN-LAST:event_printingActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel base;
    private javax.swing.JButton cardShop;
    private javax.swing.JButton distribution;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel pEmp;
    private javax.swing.JButton printing;
    // End of variables declaration//GEN-END:variables
}
