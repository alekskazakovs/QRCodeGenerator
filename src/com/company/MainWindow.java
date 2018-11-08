package com.company;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class MainWindow extends Application{




    @Override
    public void start(Stage primaryStage) throws Exception {

        BorderPane layout = new BorderPane();
        Scene scene = new Scene(layout, 900, 300);

        VBox vBox = new VBox();
        Button generateButton = new Button("Generate");
        TextField fieldForURL =  new TextField("Input URL Here");
        vBox.getChildren().add(fieldForURL);
        vBox.getChildren().add(generateButton);

        Rectangle centerRectangle = new Rectangle(100, 100, Color.BLACK);

        layout.setTop(vBox);
        layout.setCenter(centerRectangle);

        primaryStage.setTitle("Generator");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public void launchWindow(){
        launch();
    }
}
