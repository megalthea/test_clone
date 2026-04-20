module project_src {
	requires javafx.controls;
	
	opens application to javafx.base, javafx.graphics, javafx.fxml;
}
