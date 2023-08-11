package com.example.hibernat_layerd_project.dao.Custom.Impl;

import com.example.hibernat_layerd_project.dao.Custom.CustomerDAO;
import com.example.hibernat_layerd_project.dao.SQLUtil;
import com.example.hibernat_layerd_project.entity.Customer;

import java.sql.SQLException;
import java.util.List;

public class CustomerDAOImpl implements CustomerDAO {

    @Override
    public List<Customer> getAll() {
        return null;
    }

    @Override
    public boolean add(Customer customer) throws SQLException {
        return SQLUtil.execute("INSERT INTO customer(ID,Name,Age) VALUES(?,?,?)",
                customer.getId(),
                customer.getName(),
                customer.getAge());
    }

    @Override
    public boolean update(Customer entity) {
        return false;
    }

    @Override
    public boolean delete(String id) {
        return false;
    }

    @Override
    public String generateNewID() {
        return null;
    }
}
