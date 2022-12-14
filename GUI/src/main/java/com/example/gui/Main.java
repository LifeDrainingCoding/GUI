package com.example.gui;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
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
        CheckBox java = new CheckBox("Java");
        java.setSelected(true);
        CheckBox javaScript = new CheckBox("JavaScript");
        javaScript.setAllowIndeterminate(true);

        CheckBox csharp = new CheckBox("C#");
        csharp.setAllowIndeterminate(true);
        csharp.setIndeterminate(true);

        Button left = new Button("Left");
        BorderPane.setAlignment(left, Pos.CENTER);

        Button right = new Button("Right");
        BorderPane.setAlignment(right, Pos.BOTTOM_LEFT);

        Button top = new Button("Top");
        BorderPane.setAlignment(top, Pos.CENTER);

        Button bottom = new Button("Bottom");
        BorderPane.setAlignment(bottom, Pos.CENTER);

        Button center = new Button("Center");
        BorderPane.setAlignment(center, Pos.CENTER);



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
        Text txt = new Text("??????????????????");
        txt.setLayoutX(400);
        txt.setLayoutY(400);
        txt.setFill(Color.BLUE);
        FlowPane root = new FlowPane(Orientation.VERTICAL, 0, 10);
        root.getChildren().addAll(java, javaScript, csharp,btn,txt);
        root.setPadding(new Insets(10));


        Scene scene = new Scene(root);
        scene.setFill(Color.BLUE);
        scene.setFill(Color.WHITE);

        stage.setScene(scene);
        stage.setTitle("Hello JavaFX");
        stage.setWidth(1280);
        stage.setHeight(1024);

        stage.show();

    }
}
