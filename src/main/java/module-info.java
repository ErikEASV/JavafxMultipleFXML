module com.example.javafxmultiplefxml {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafxmultiplefxml.controllers to javafx.fxml;
    exports com.example.javafxmultiplefxml.controllers;
    opens com.example.javafxmultiplefxml.services to javafx.fxml;
    exports com.example.javafxmultiplefxml.services;
}