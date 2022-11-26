package com.menu.gui;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MenuController {
    @FXML
    private Label actionResult;

    @FXML
    protected void onAddButtonClick() {
        actionResult.setText("Add");
    }
    @FXML
    protected void onDelButtonClick() {
        actionResult.setText("Del");
    }
    @FXML
    protected void onSaveButtonClick() {
        actionResult.setText("Save");
    }
}