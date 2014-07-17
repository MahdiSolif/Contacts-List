package dalcontanctslist;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DalContanctsList {

    public String server = "Localhost";
    public int port = 3306;
    public String database = "list";
    public String username = "root";
    public String password = "5512";
    public String[] hdr = null;
    private Connection co;
    private Statement st;

    public DalContanctsList() {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void Connect() {
        try {

            String url = "jdbc:mysql://" + server + ":" + port + "/" + database + "?user=" + username + "&password=" + password;
            Connection co = DriverManager.getConnection(url);
            st = co.createStatement();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void Disconnect() {
        try {

            co.close();
            st.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void Execute(String sql) {
        try {
            st.execute(sql);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public String[][] Select(String sql) {
        String[][] data = null;
        try {
            ResultSet rs = st.executeQuery(sql);
            rs.last();
            int RowCount = rs.getRow();
            rs.beforeFirst();
            int ColumnCount = rs.getMetaData().getColumnCount();
            data = new String[RowCount][ColumnCount];
            hdr = new String[ColumnCount];
            for (int i = 0; i< ColumnCount; i++) {
                hdr[i] = rs.getMetaData().getColumnLabel(i+1);

            }
            int i = 0;
            while (rs.next()) {
                for (int j = 0; j< ColumnCount; j++) {

                    data[i][j] = rs.getString(j + 1);

                }

                i++;
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return data;
    }

}
