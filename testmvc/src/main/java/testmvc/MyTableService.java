package testmvc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MyTableService {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/testliferay"; // Thay tên cơ sở dữ liệu của bạn
    private static final String USER = "root"; // Tên tài khoản MySQL
    private static final String PASSWORD = "12012002"; // Mật khẩu MySQL

    public List<String> getData() {
        List<String> dataList = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection(DB_URL, USER, PASSWORD)) {
            String sql = "SELECT id, name FROM test_table"; // Thay 'my_table' bằng tên bảng của bạn
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                dataList.add("ID: " + id + ", Name: " + name);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dataList;
    }
}