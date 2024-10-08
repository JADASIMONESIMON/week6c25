module org.example.week6_figma {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.week6_figma to javafx.fxml;
    exports org.example.week6_figma;
}