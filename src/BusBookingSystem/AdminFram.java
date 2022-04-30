
package BusBookingSystem;

public class AdminFram extends javax.swing.JFrame {

    public AdminFram() {
        initComponents();
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BttnLogout = new javax.swing.JButton();
        BttnBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        BusTable = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        BookingTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        CustomerTable = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        Travel_ScheduleTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 225, 184));
        jPanel1.setForeground(new java.awt.Color(255, 225, 184));

        BttnLogout.setBackground(new java.awt.Color(193, 222, 252));
        BttnLogout.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        BttnLogout.setForeground(new java.awt.Color(94, 0, 8));
        BttnLogout.setText("Logout");
        BttnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BttnLogoutActionPerformed(evt);
            }
        });

        BttnBack.setBackground(new java.awt.Color(193, 222, 252));
        BttnBack.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        BttnBack.setForeground(new java.awt.Color(94, 0, 8));
        BttnBack.setText("Back");
        BttnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BttnBackActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(94, 0, 8));
        jLabel2.setText("Bus Table :");

        jLabel5.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(94, 0, 8));
        jLabel5.setText("Booking Table :");

        BusTable.setBackground(new java.awt.Color(204, 229, 237));
        BusTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Bus ID", "Plate Number", "Bus Type", "Totale Seats ", "Driver Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(BusTable);

        BookingTable.setBackground(new java.awt.Color(204, 229, 237));
        BookingTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Booking ID", "Bus ID", "Customer ID", "Customer Name", "Seat Number", "Paid"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(BookingTable);

        jLabel3.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(94, 0, 8));
        jLabel3.setText("Customer Table :");

        CustomerTable.setBackground(new java.awt.Color(204, 229, 237));
        CustomerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer ID", "Customer Name", "Phone Number", "Birth Date", "Username", "Password"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(CustomerTable);

        jLabel6.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(94, 0, 8));
        jLabel6.setText("Travel ScheduleTable Table :");

        Travel_ScheduleTable.setBackground(new java.awt.Color(204, 229, 237));
        Travel_ScheduleTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Travel ID", "Bus ID", "Starting Point", "Destination", "Depart Time", "Depart Date", "Remaining Seats", "Ticket Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(Travel_ScheduleTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
                                .addContainerGap())))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BttnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BttnLogout))
                            .addComponent(jLabel6)
                            .addComponent(jScrollPane2)
                            .addComponent(jScrollPane5))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BttnBack)
                    .addComponent(BttnLogout))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1003, 666));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BttnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BttnBackActionPerformed
        AdminPanel admin = new AdminPanel();
        admin.setVisible(true); // go to admin panel page
        this.setVisible(false); // hide this page
    }//GEN-LAST:event_BttnBackActionPerformed

    private void BttnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BttnLogoutActionPerformed
        UserLogin login = new UserLogin();
        login.setVisible(true); // go to Login page
        this.setVisible(false); // hide this page
    }//GEN-LAST:event_BttnLogoutActionPerformed

    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminFram().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTable BookingTable;
    private javax.swing.JButton BttnBack;
    private javax.swing.JButton BttnLogout;
    public javax.swing.JTable BusTable;
    public javax.swing.JTable CustomerTable;
    public javax.swing.JTable Travel_ScheduleTable;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    // End of variables declaration//GEN-END:variables
}
