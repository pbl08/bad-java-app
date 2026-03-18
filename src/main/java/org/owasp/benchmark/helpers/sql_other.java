String query = "SELECT * FROM users WHERE username = '" + username + "' AND password = '" + password + "'";
Statement statement = connection.createStatement();
ResultSet resultSet = statement.executeQuery(query);

String query = "SELECT * FROM sales WHERE id = '" + id;
Statement statement = connection.createStatement();
ResultSet resultSet = statement.executeQuery(query);


String query = "SELECT * FROM groups WHERE id = '" + group;
Statement statement = connection.createStatement();
ResultSet resultSet = statement.executeQuery(query);


String query = "SELECT * FROM class WHERE id = '" + class_id;
Statement statement = connection.createStatement();
ResultSet resultSet = statement.executeQuery(query);