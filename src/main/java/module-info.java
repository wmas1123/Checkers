module checkers {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires org.junit.jupiter.api;
    requires junit;

    opens ui to javafx.fxml;
    exports ui;
    exports core;
}