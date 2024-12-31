module com.example.finalquestionsolve {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.finalquestionsolve to javafx.fxml;
    exports com.example.finalquestionsolve;
}