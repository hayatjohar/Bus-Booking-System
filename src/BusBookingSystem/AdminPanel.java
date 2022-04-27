/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package BusBookingSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author bassamphone
 */
public class AdminPanel extends javax.swing.JFrame {

    /**
     * Creates new form AdminPanel
     */
    public AdminPanel() {
        initComponents();
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        AddBus = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        bus_id = new javax.swing.JTextField();
        bus_type = new javax.swing.JTextField();
        plate_number = new javax.swing.JTextField();
        total_seats = new javax.swing.JTextField();
        driver_name = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel1.setText("Welcome Admin");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setText("Display All Tables");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        AddBus.setText("Add Bus");
        AddBus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBusActionPerformed(evt);
            }
        });

        jLabel2.setText("Bus ID :");

        jLabel3.setText("Bus type :");

        jLabel5.setText("plate number :");

        jLabel6.setText("Total seats :");

        jLabel4.setText("Driver name :");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AddBus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(46, 46, 46)
                        .addComponent(bus_id, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(plate_number, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(total_seats, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bus_type, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(driver_name, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(bus_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(driver_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(bus_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(plate_number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(total_seats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(AddBus, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                AdminFram AdminTablesPage = new AdminFram();
                AdminTablesPage.setVisible(true); // show tables pages
                this.setVisible(false); // hide this page
                try{
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/busbookingsystem","root","");
                    // Bus Table
                    String sql1 = "SELECT * FROM `bus-table`";
                    PreparedStatement table1=con.prepareStatement(sql1);
                    ResultSet resultTable1 = table1.executeQuery();
                    while(resultTable1.next()){
                        String bus_id = String.valueOf(resultTable1.getInt("bus-id"));
                        String plate_number = resultTable1.getString("plate-no");
                        String type = resultTable1.getString("bus-type");
                        String total_seats = String.valueOf(resultTable1.getInt("total-seats"));
                        String driver_name = resultTable1.getString("driver-name");
                        
                        String busData[] = {bus_id,plate_number,type,total_seats,driver_name};
                        DefaultTableModel TableModel = (DefaultTableModel)AdminTablesPage.BusTable.getModel();
                        TableModel.addRow(busData);
                    }
                    
                    // Customer Table
                    String sql2 = "SELECT * FROM `customer-table`";
                    PreparedStatement table2 =con.prepareStatement(sql2);
                    ResultSet resultTable2 = table2.executeQuery();
                    while(resultTable2.next()){
                        String customer_id = String.valueOf(resultTable2.getInt("customer-id"));
                        String customer_name = resultTable2.getString("customer-name");
                        String password = resultTable2.getString("password");
                        String username = resultTable2.getString("username");
                        String phone_number = String.valueOf(resultTable2.getInt("phone-number"));
                        String Birth_date = String.valueOf(resultTable2.getDate("birth-date"));
                        
                        String customerData[] = {customer_id,customer_name,phone_number,Birth_date,username,password};
                        DefaultTableModel TableModel = (DefaultTableModel)AdminTablesPage.CustomerTable.getModel();
                        TableModel.addRow(customerData);
                    }
                 
                    
                    // Booking Table
                    String sql4 = "SELECT * FROM `booking-table`";
                    PreparedStatement table4 = con.prepareStatement(sql4);
                    ResultSet resultTable4 = table4.executeQuery();
                    while(resultTable4.next()){
                        String booking_id = String.valueOf(resultTable4.getInt("booking-id"));
                        String customer_id = String.valueOf(resultTable4.getInt("customer-id"));
                        String customer_name = resultTable4.getString("customer-name");
                        String paid = resultTable4.getString("paid");
                        String seat_number = String.valueOf(resultTable4.getInt("seat-number"));
                        String BookingData[] = {booking_id,customer_id,customer_name,seat_number,paid};
                        DefaultTableModel TableModel = (DefaultTableModel)AdminTablesPage.BookingTable.getModel();
                        TableModel.addRow(BookingData);
                    }
                    
                    // Travel Schedule Table
                    String sql5 = "SELECT * FROM `travel-schedule-table`";
                    PreparedStatement table5 = con.prepareStatement(sql5);
                    ResultSet resultTable5 = table5.executeQuery();
                    while(resultTable5.next()){
                        String bus_id = String.valueOf(resultTable5.getInt("bus-id"));
                        String starting_point = resultTable5.getString("starting-point");
                        String destination = resultTable5.getString("destination");
                        String depart_time = String.valueOf(resultTable5.getTime("depart-time"));
                        String depart_date = String.valueOf(resultTable5.getDate("depart-date"));
                        String remaining_seats = String.valueOf(resultTable5.getInt("remaining-seats"));
                        String ticket_price =  String.valueOf(resultTable5.getInt("ticket-price"));
                        String Travel_Schedule[] = {bus_id,starting_point,destination,depart_time,depart_date,remaining_seats,ticket_price};
                        DefaultTableModel TableModel = (DefaultTableModel)AdminTablesPage.Travel_ScheduleTable.getModel();
                        TableModel.addRow(Travel_Schedule);
                    }
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
                }    
                
    }//GEN-LAST:event_jButton1ActionPerformed

    private void AddBusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBusActionPerformed
        if(bus_id.getText().trim().isEmpty() ||
            bus_type.getText().trim().isEmpty() ||
            plate_number.getText().trim().isEmpty() ||
            total_seats.getText().trim().isEmpty() ||
            driver_name.getText().trim().isEmpty()
        ){
           JOptionPane.showMessageDialog(null, "Can't Add bus with null values");
        }else{
            try{
            int busID = Integer.parseInt(bus_id.getText());
            int totalSeats = Integer.parseInt(total_seats.getText());
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/busbookingsystem", "root", "");
                String sql = "INSERT INTO `bus-table` (`bus-id`, `bus-type`, `driver-name`, `plate-no`, `total-seats`) VALUES (?,?,?,?,?)";
                PreparedStatement stmt = con.prepareStatement(sql);
                stmt.setInt(1,busID);
                stmt.setString(2,bus_type.getText().trim());
                stmt.setString(3, driver_name.getText().trim());
                stmt.setString(4, plate_number.getText().trim());
                stmt.setInt(5, totalSeats);
                stmt.executeUpdate();
                JOptionPane.showMessageDialog(null, "Bus added successfully");
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Add integer values to Bus-id/Total-seats");
            }

            
            }

            
           
    }//GEN-LAST:event_AddBusActionPerformed

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
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBus;
    private javax.swing.JTextField bus_id;
    private javax.swing.JTextField bus_type;
    private javax.swing.JTextField driver_name;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField plate_number;
    private javax.swing.JTextField total_seats;
    // End of variables declaration//GEN-END:variables
}
