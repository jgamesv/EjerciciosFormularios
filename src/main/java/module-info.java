module com.mycompany.crudform {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.crudform to javafx.fxml;
    exports com.mycompany.crudform;
}
