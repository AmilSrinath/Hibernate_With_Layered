package com.example.hibernat_layerd_project.dao;

import java.sql.SQLException;
import java.util.List;

public interface CrudDAO<T> extends SuperDAO{
    public List<T> getAll() throws SQLException, ClassNotFoundException;
    public boolean add(T entity) throws SQLException, ClassNotFoundException;
    public boolean update(T entity) throws SQLException, ClassNotFoundException;
    public boolean delete(String id) throws SQLException, ClassNotFoundException;
    public String generateNewID() throws SQLException, ClassNotFoundException;
}
