module com.michaelmckibbin.demo2scenes {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.michaelmckibbin.demo2scenes to javafx.fxml;
    exports com.michaelmckibbin.demo2scenes;
}