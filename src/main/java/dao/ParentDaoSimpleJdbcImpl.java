package dao;

import models.Parent;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ParentDaoSimpleJdbcImpl implements ParentDao {

    private Connection connection;

    public ParentDaoSimpleJdbcImpl() throws Exception {
        // загрузили драйвер для БД в виртуальную машину
        Class.forName("org.postgresql.Driver");
        connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/humans",
                "postgres", "qwerty007");
    }

    public Parent find(int id) {
        return null;
    }

    public int save(Parent parent) {
        return 0;
    }

    public void update(Parent parent) {

    }

    public void delete(int id) {

    }

    public List<Parent> findAll() throws SQLException {
        Statement statement = connection.createStatement();
        ResultSet set = statement.executeQuery("SELECT * FROM parent");

        List<Parent> parents = new ArrayList<Parent>();
        while (set.next()) {
            int id = set.getInt("id");
            String name = set.getString("name");

            Parent parent = new Parent(id, name);
            parents.add(parent);
        }
        return parents;
    }
}
