package com.example.finalquestionsolve;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class DataCraetionToFileViewController {
    @javafx.fxml.FXML
    private TextField modelField;
    @javafx.fxml.FXML
    private TextField makeYearField;
    @javafx.fxml.FXML
    private TextField manufacturerField;
    @javafx.fxml.FXML
    private TextField vehicleTypeField;
    @javafx.fxml.FXML
    private TextField importPriceField;
    @javafx.fxml.FXML
    private TextField regNoField;
    @javafx.fxml.FXML
    private TextField ccField;
    @javafx.fxml.FXML
    private TextField seatCapacityField;
    @javafx.fxml.FXML
    private CheckBox isElectricCheckBox;

    @javafx.fxml.FXML
    public void switchToScene2(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("DataprocessingandFilterOutputView.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage)(((Node)actionEvent.getSource()).getScene().getWindow());
        stage.setScene(scene);

       // HelloApplication.setScene("DataprocessingandFilterOutputView.fcml");

    }

    @javafx.fxml.FXML

    public void addVehicle(ActionEvent actionEvent) {
        try{
            String model=modelField.getText();
            int makeYear=Integer.parseInt(makeYearField.getText());
            String manufacturer= manufacturerField.getText();
            String vehycleType= vehicleTypeField.getText();
            int importPrice= Integer.parseInt(importPriceField.getText());
            int cc= Integer.parseInt(ccField.getText());
            int seateCapacity= Integer.parseInt(seatCapacityField.getText());
            boolean isElelctric= isElectricCheckBox.isSelected();
            int regNo= Integer.parseInt(regNoField.getText());
            Vehicle vehicle = new Vehicle(model,vehycleType,manufacturer,makeYear,importPrice,seateCapacity,regNo,cc,isElelctric);
            VehicleStorage.addVehicle(vehicle);
            showAlert("Success", "Vehicle added successfully!");



            


        }catch (Exception e){
            showAlert("Error", "Invalid input or error saving vehicle!");

        }




   }
    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
