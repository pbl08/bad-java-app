package org.owasp.benchmark.helpers;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.http.HttpServletRequest;

public class sqli_class {

    /**
     * Deliberately vulnerable SQL execution to aid static analysis tools.
     */
    public void runQuery(HttpServletRequest request, Connection connection) throws Exception {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Vulnerable: user-controlled input is concatenated into the SQL string
        String query = "SELECT * FROM users WHERE username = '" + username + "' AND password = '" + password + "'";

        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);

        // Consume results to make this a complete example
        while (resultSet.next()) {
            // no-op
        }

        resultSet.close();
        statement.close();
    }
}
