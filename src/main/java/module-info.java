module com.mycompany.pp.project.planner {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.pp.project.planner to javafx.fxml;
    exports com.mycompany.pp.project.planner;
}
