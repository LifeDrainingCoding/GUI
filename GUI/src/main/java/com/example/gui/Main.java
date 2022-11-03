package com.example.gui;
import javafx.application.Application;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.text.Text;

public class Main extends Application{

    public static void main(String[] args) {

        launch(args);
    }

    @Override
    public void start(Stage stage) {

        Button btn = new Button();
        btn.setText("Click!");
        btn.setLayoutX(200);
        btn.setLayoutY(200);
        btn.setTextFill(Color.BLUE);
        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {

                btn.setText("You've clicked!");
                btn.setTextFill(Color.WHITE);
                btn.setStyle("-fx-background-color: #0000ff");
                btn.setLayoutX(500);
                btn.setLayoutY(500);
            }
        });
        Text txt = new Text("Приложуха");
        txt.setLayoutX(400);
        txt.setLayoutY(400);
        txt.setFill(Color.BLUE);
        Group root = new Group();
        root.getChildren().addAll(btn,txt);
        Scene scene = new Scene(root);
        scene.setFill(Color.BLUE);
        scene.setFill(Color.DARKRED);
        stage.setScene(scene);

        stage.setTitle("Hello JavaFX");
        stage.setWidth(1280);
        stage.setHeight(1024);

        stage.show();
    }
}
