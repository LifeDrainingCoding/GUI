package com.example.gui;

import javafx.application.Application;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;

import javafx.geometry.Orientation;

public class TextInput extends Application{

    public static void main(String[] args) {

        Application.launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        Label lbl = new Label();
        TextField textField = new TextField();
        textField.setPrefColumnCount(11);
        TextArea textArea = new TextArea();
        textArea.setPrefColumnCount(15);
        textArea.setPrefRowCount(5);

        Button btn = new Button("Check inputed things");
        btn.setOnAction(event -> lbl.setText("Input: " + textField.getText()+ " " + textArea.getText()));
        FlowPane root = new FlowPane(Orientation.VERTICAL, 10, 10, textField,textArea, btn, lbl);
        Scene scene = new Scene(root,1240,1024);

        stage.setScene(scene);
        stage.setTitle("TextField in JavaFX");
        stage.show();
    }
}
