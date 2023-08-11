package com.example.hibernat_layerd_project.Bo.Custom.Impl;

import com.example.hibernat_layerd_project.Bo.Custom.CustomerBO;
import com.example.hibernat_layerd_project.dto.CustomerDTO;

import java.util.List;

public class CustomerBOImpl implements CustomerBO {

    @Override
    public List<CustomerDTO> getAllCustomer(){
        return null;
    }

    @Override
    public boolean addCustomer(CustomerDTO dto) {
        return false;
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
