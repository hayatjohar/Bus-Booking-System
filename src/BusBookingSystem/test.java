
package BusBookingSystem;
import java.util.Date;
/**
 *
 * @author bassamphone
 */
public class test {
    public static void main(String[] args) {
        java.util.Date utilDate = new Date();
        System.out.println("Netbeans date : " + utilDate);
        java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
        System.out.println("SQL date : " + sqlDate);
    }
}
