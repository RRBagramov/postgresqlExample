package dao;

import models.Parent;

import java.sql.SQLException;
import java.util.List;

public interface ParentDao {
    Parent find(int id);
    int save(Parent parent);
    void update(Parent parent);
    void delete(int id);
    List<Parent> findAll() throws SQLException;
}
