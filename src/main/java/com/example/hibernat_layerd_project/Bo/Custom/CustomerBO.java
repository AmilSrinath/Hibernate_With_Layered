package com.example.hibernat_layerd_project.Bo.Custom;

import com.example.hibernat_layerd_project.Bo.SuperBO;
import com.example.hibernat_layerd_project.dto.CustomerDTO;

import java.sql.SQLException;
import java.util.List;

public interface CustomerBO extends SuperBO {
    public List<CustomerDTO> getAllCustomer();
    public boolean addCustomer(CustomerDTO dto) throws SQLException, ClassNotFoundException;

    public boolean updateCustomer(CustomerDTO dto) throws SQLException, ClassNotFoundException;

    public boolean deleteCustomer(String id) throws SQLException, ClassNotFoundException;
}
