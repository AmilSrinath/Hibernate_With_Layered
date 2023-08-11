module com.example.hibernat_layerd_project {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.hibernat_layerd_project to javafx.fxml;
    exports com.example.hibernat_layerd_project;
    exports com.example.hibernat_layerd_project.contoller;
    opens com.example.hibernat_layerd_project.contoller to javafx.fxml;
}