//package testmvc;
//
//import com.liferay.portal.kernel.log.LogFactoryUtil;
//import jdk.internal.net.http.common.Log;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.util.ArrayList;
//import java.util.List;
//
//public class TestTableService {
//  //  private static final Log _log = LogFactoryUtil.getLog(TestTableService.class);
//
//    // Cấu hình thông tin kết nối
//    private static final String DB_URL = "jdbc:mysql://localhost:3306/testliferay"; // Thay 'tên_database' bằng tên của bạn
//    private static final String USER = "root"; // Thay 'tên_tài_khoản' bằng tài khoản MySQL của bạn
//    private static final String PASSWORD = "12012002"; // Thay 'mật_khẩu' bằng mật khẩu của bạn
//
//    public List<String> getData() {
//        List<String> dataList = new ArrayList<>();
//        Connection connection = null;
//
//        try {
//            // Tải driver MySQL
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            connection = DriverManager.getConnection(DB_URL, USER, PASSWORD);
//
//            String sql = "SELECT id, name FROM test_table";
//            PreparedStatement preparedStatement = connection.prepareStatement(sql);
//            ResultSet resultSet = preparedStatement.executeQuery();
//
//            while (resultSet.next()) {
//                int id = resultSet.getInt("id");
//                String name = resultSet.getString("name");
//                dataList.add("ID: " + id + ", Name: " + name);
//            }
//        } catch (Exception e) {
//            System.out.println("Error retrieving data from database");
//        //    _log.error("Error retrieving data from database", e);
//        } finally {
//            try {
//                if (connection != null) {
//                    connection.close();
//                }
//            } catch (Exception e) {
//                System.out.println("Error closing connection");
//              //  _log.error("Error closing connection", e);
//            }
//        }
//        return dataList;
//    }
//}
//
