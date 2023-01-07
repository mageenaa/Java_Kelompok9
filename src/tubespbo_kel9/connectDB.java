package tubespbo_kel9;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author zaida
 */
public class connectDB {
    private static String servername = "localhost";
    private static String username = "root";
    private static String dbname = "tubespbo";
    private static Integer portnumber = 3306;
    private static String password = "";
    
    public static Connection getConnection(){
        Connection db = null;
        
        MysqlDataSource datasource = new MysqlDataSource();
        
        datasource.setServerName(servername);
        datasource.setUser(username);
        datasource.setPassword(password);
        datasource.setDatabaseName(dbname);
        datasource.setPortNumber(portnumber);
        
        try{
            db = datasource.getConnection();
        } catch(SQLException ex){
            Logger.getLogger("Get Connected" + connectDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return db;
    }
    
    public void insertUpdateDeleteStudent(char operation, String _kode, String _lapangan, Integer _harga, String _jam_mulai, String _jam_selesai, String _nama, String _team, Integer _no_hp, Integer _dp){
        Connection con = connectDB.getConnection();
        PreparedStatement ps;
        
        if(operation == 'i'){
            try {
                ps = (PreparedStatement) con.prepareStatement("INSERT INTO bookingfutsal(Kode, Lapangan, Harga, Jam_Mulai, Jam_Selesai, Nama, Team, No_HP, DP) VALUES (?,?,?,?,?,?,?,?,?)");
                ps.setString(1, _kode);
                ps.setString(2, _lapangan);
                ps.setInt(3, _harga);
                ps.setString(4, _jam_mulai);
                ps.setString(5, _jam_selesai);
                ps.setString(6, _nama);
                ps.setString(7, _team);
                ps.setInt(8, _no_hp);
                ps.setInt(9, _dp);
                
                if (ps.executeUpdate() > 0){
                    JOptionPane.showMessageDialog(null, "Transaksi Berhasil!");
                }
            } catch (SQLException ex) {
                Logger.getLogger(connectDB.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
    
    public void fillTableData(JTable table, String valueToSearch){
        Connection conn = connectDB.getConnection();
        PreparedStatement ps;
        
        try {
            ps = (PreparedStatement) conn.prepareStatement("SELECT * FROM `bookingfutsal` WHERE CONCAT (`Kode`, `Lapangan`, `Harga`, `Jam_Mulai`, `Jam_Selesai`, `Nama`, `Team`, `No_HP`, `DP`) LIKE (%08%)");
            ps.setString(1, "%"+valueToSearch+"%");
            
            ResultSet rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel)table.getModel();
            
            Object[] row;
            
            while(rs.next()){
                row = new Object[9];
                row[0] = rs.getString(1);
                row[1] = rs.getString(2);
                row[2] = rs.getInt(3);
                row[3] = rs.getString(4);
                row[4] = rs.getString(5);
                row[5] = rs.getString(6);
                row[6] = rs.getString(7);
                row[7] = rs.getInt(8);
                row[8] = rs.getInt(9);
                
                model.addRow(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(connectDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void updatetable(char operation, String _kode, String _lapangan, Integer _harga, String _jam_mulai, String _jam_selesai, String _nama, String _team, Integer _no_hp, Integer _dp){
        Connection con = connectDB.getConnection();
        PreparedStatement ps;
        
        if(operation == 'i'){
            try {
                ps = (PreparedStatement) con.prepareStatement("UPDATE INTO bookingfutsal(Kode, Lapangan, Harga, Jam_Mulai, Jam_Selesai, Nama, Team, No_HP, DP) VALUES (?,?,?,?,?,?,?,?,?)");
                ps.setString(1, _kode);
                ps.setString(2, _lapangan);
                ps.setInt(3, _harga);
                ps.setString(4, _jam_mulai);
                ps.setString(5, _jam_selesai);
                ps.setString(6, _nama);
                ps.setString(7, _team);
                ps.setInt(8, _no_hp);
                ps.setInt(9, _dp);
                
                if (ps.executeUpdate() > 0){
                    JOptionPane.showMessageDialog(null, "Berhasil Update");
                }
            } catch (SQLException ex) {
                Logger.getLogger(connectDB.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
//    public boolean insertdata(String Kode, String Lapangan, int Harga, String Jam_Mulai, String Jam_Selesai, String Nama, String Team, int No_HP, int DP){
//        PreparedStatement ps;
//        Connection con = connectDB.getConnection();
//        
//        String query = "insert into bookingfutsal (Kode, Lapangan, Harga, Jam_Mulai, Jam_Selesai, Nama, Team, No_HP, DP)values(?,?,?,?,?,?,?,?,?)";
//        
//        try {
//            ps = (PreparedStatement) con.prepareStatement(query);
//            ps.setString(1, Kode);
//            ps.setString(2, Lapangan);
//            ps.setString(3, Integer.toString(Harga));
//            ps.setString(4, Jam_Mulai);
//            ps.setString(5, Jam_Selesai);
//            ps.setString(6, Nama);
//            ps.setString(7, Team);
//            ps.setString(8, Integer.toString(No_HP));
//            ps.setString(9, DP);
//            ps.executeUpdate();
//            respons = false;
//            System.out.println("Sukses Insert");
//            
//        } catch (SQLException ex) {
//            respons = false;
//            System.out.println("Gagal Insert");
//            Logger.getLogger(connectDB.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return respons;
//    }
}
