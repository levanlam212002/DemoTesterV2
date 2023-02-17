module com.khanh.bmiapp {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.khanh.bmiapp to javafx.fxml;
    exports com.khanh.bmiapp;
}
