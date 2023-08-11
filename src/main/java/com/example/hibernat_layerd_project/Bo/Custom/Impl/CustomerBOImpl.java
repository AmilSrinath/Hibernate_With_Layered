package com.example.hibernat_layerd_project.Bo.Custom.Impl;

import com.example.hibernat_layerd_project.Bo.Custom.CustomerBO;
import com.example.hibernat_layerd_project.dao.Custom.CustomerDAO;
import com.example.hibernat_layerd_project.dao.DAOFactory;
import com.example.hibernat_layerd_project.dto.CustomerDTO;
import com.example.hibernat_layerd_project.entity.Customer;

import java.sql.SQLException;
import java.util.List;

public class CustomerBOImpl implements CustomerBO {
    CustomerDAO customerDAO = (CustomerDAO) DAOFactory.getDaoFactory().getDAO(DAOFactory.DAOTypes.CUSTOMER);

    @Override
    public List<CustomerDTO> getAllCustomer(){
        return null;
    }

    @Override
    public boolean addCustomer(CustomerDTO dto) throws SQLException, ClassNotFoundException {
        return customerDAO.add(new Customer(dto.getId(),dto.getName(),dto.getAge()));
    }

    @Override
    public boolean updateCustomer(CustomerDTO dto) {
        return false;
    }

    @Override
    public boolean deleteCustomer(String id) {
        return false;
    }
}
