package com.example.hibernat_layerd_project.Bo.Custom;

import com.example.hibernat_layerd_project.Bo.SuperBO;
import com.example.hibernat_layerd_project.dto.CustomerDTO;
import java.util.List;

public interface CustomerBO extends SuperBO {
    public List<CustomerDTO> getAllCustomer();
    public boolean addCustomer(CustomerDTO dto);

    public boolean updateCustomer(CustomerDTO dto);

    public boolean deleteCustomer(String id);
}
