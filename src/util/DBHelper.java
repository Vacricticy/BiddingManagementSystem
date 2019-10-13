package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBHelper {
    //    private static final String url="jdbc:mysql://localhost:3306/shopping?serverTimezone=UTC";
    private static final String url = "jdbc:mysql://106.54.120.233:3306/gcdl?serverTimezone=UTC";
    private static Connection con = null;

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");//加载驱动程序
        } catch (Exception e) {
            e.printStackTrace();
            System.out.print("加载驱动程序出错!");
        }
    }

    public static Connection getConnection() {
        if (con == null) {
            try {
//                con = DriverManager.getConnection(url, "root", "123456");//创建连接
                con = DriverManager.getConnection(url, "root", "123123");//创建连接
                return con;
            } catch (Exception e) {
                e.getStackTrace();
            }

        }
        return con;
    }

    public static void main(String[] args) {
        Connection con = DBHelper.getConnection();
        if (con != null) {
            System.out.println("数据库连接成功");
        } else {
            System.out.println("数据库连接失败");
        }
    }
}
