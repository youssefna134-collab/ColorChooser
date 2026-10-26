module com.mycompany.colorchooser {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.colorchooser to javafx.fxml;
    exports com.mycompany.colorchooser;
}
