module javafx_practice {
	requires javafx.controls;
	requires java.desktop;
	requires javafx.base;
	
	opens application to javafx.graphics, javafx.fxml;
}
