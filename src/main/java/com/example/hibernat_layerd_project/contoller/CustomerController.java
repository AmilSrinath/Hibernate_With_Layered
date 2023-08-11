package com.example.hibernat_layerd_project.contoller;

import com.example.hibernat_layerd_project.Bo.BOFactory;
import com.example.hibernat_layerd_project.Bo.Custom.CustomerBO;
import com.example.hibernat_layerd_project.dto.CustomerDTO;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.event.ActionEvent;

import java.sql.SQLException;
import java.util.Optional;

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
    void btnDeleteOnAction(ActionEvent event) throws SQLException, ClassNotFoundException {
        ButtonType yes = new ButtonType("Yes", ButtonBar.ButtonData.OK_DONE);
        ButtonType no = new ButtonType("No", ButtonBar.ButtonData.CANCEL_CLOSE);
        Optional<ButtonType> result = new Alert(Alert.AlertType.INFORMATION, "Are you sure to remove?", yes, no).showAndWait();

        if (result.orElse(no) == yes) {
            if(!customerBO.deleteCustomer(txtID.getText())){
                new Alert(Alert.AlertType.ERROR, "SQL Error !!").show();
            }
        }
    }

    @FXML
    void btnUpdateOnAction(ActionEvent event) throws SQLException, ClassNotFoundException {
        String id = txtID.getText();
        String name = txtName.getText();
        int age = Integer.parseInt(txtAge.getText());

        if(customerBO.updateCustomer(new CustomerDTO(id,name,age))){
            new Alert(Alert.AlertType.CONFIRMATION, "Customer Updated !!").show();
        }else {
            new Alert(Alert.AlertType.ERROR, "SQL Error !!").show();
        }
    }
}