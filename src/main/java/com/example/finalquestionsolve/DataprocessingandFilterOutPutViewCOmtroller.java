package com.example.finalquestionsolve;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.List;

public class DataprocessingandFilterOutPutViewCOmtroller {

    @javafx.fxml.FXML
    private TableColumn modelColumn;
    @javafx.fxml.FXML
    private TableView vehicleTable;
    @javafx.fxml.FXML
    private TableColumn manufacturerColumn;
    @javafx.fxml.FXML
    private TableColumn vehicleTypeColumn;
    @javafx.fxml.FXML
    private TableColumn regNoColumn;
    @javafx.fxml.FXML
    private ComboBox vehicleTypeComboBox;

    @FXML
    public void initialize(){
        regNoColumn.setCellValueFactory(new PropertyValueFactory<>("RegNo"));
        vehicleTypeColumn.setCellValueFactory(new PropertyValueFactory<>("VehicleType"));
        manufacturerColumn.setCellValueFactory(new PropertyValueFactory<>("ManufacturerColumn"));
        modelColumn.setCellValueFactory(new PropertyValueFactory<>("Model"));
        List<Vehicle>vehicles=VehicleStorage.loadVehicleList();
        ObservableList<Vehicle> vehicleData= FXCollections.observableArrayList(vehicles);
        vehicleTable.setItems(vehicleData);

        vehicleTypeComboBox.getItems().addAll("sedan","musle");





    }

    @javafx.fxml.FXML
    public void switchToScene1(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("DataCreationToFileView.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage)(((Node)actionEvent.getSource()).getScene().getWindow());
        stage.setScene(scene);




    }
}
