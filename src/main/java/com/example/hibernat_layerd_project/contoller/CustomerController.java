package com.example.hibernat_layerd_project.contoller;

import com.example.hibernat_layerd_project.Bo.BOFactory;
import com.example.hibernat_layerd_project.Bo.Custom.CustomerBO;
import com.example.hibernat_layerd_project.dto.CustomerDTO;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;

import java.sql.SQLException;

public class CustomerController {
    CustomerBO customerBO = (CustomerBO) BOFactory.getBoFactory().getBO(BOFactory.BOTypes.CUSTOMER);

    @FXML
    private TextField txtID;

    @FXML
    private TextField txtName;

    @FXML
    private TextField txtAge;

    @FXML
    private TableColumn<?, ?> colID;

    @FXML
    private TableColumn<?, ?> colName;

    @FXML
    private TableColumn<?, ?> colAge;

    @FXML
    void btnSaveOnAction(ActionEvent event) throws SQLException, ClassNotFoundException {
        String id = txtID.getText();
        String name = txtName.getText();
        int age = Integer.parseInt(txtAge.getText());

        if (customerBO.addCustomer(new CustomerDTO(id,name,age))){
            new Alert(Alert.AlertType.CONFIRMATION, "Customer Saved !").show();
        }else{
            new Alert(Alert.AlertType.ERROR, "SQL Error !").show();
        }
    }

    @FXML
    void btnDeleteOnAction(ActionEvent event) {

    }

    @FXML
    void btnUpdateOnAction(ActionEvent event) {

    }
}