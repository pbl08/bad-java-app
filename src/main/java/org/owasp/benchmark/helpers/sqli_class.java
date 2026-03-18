public class Test {
    public void runQuery(String username, String password, String id, String group, String class_id) throws Exception {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "password");

        String query = "SELECT * FROM users WHERE username = '" + username + "' AND password = '" + password + "'";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);

        String query2 = "SELECT * FROM sales WHERE id = '" + id;
        ResultSet resultSet2 = statement.executeQuery(query2);

        String query3 = "SELECT * FROM groups WHERE id = '" + group;
        ResultSet resultSet3 = statement.executeQuery(query3);

        String query4 = "SELECT * FROM class WHERE id = '" + class_id;
        ResultSet resultSet4 = statement.executeQuery(query4);
    }
}