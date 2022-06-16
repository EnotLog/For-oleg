package org.example;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.util.Random;
import java.util.stream.IntStream;


public class App extends Application {

    @Override
    public void start(Stage stage) {
        Pane pane = new Pane();

        stage.setTitle("My first app");

       Label label = new Label();
       label.setText("Kukold?");
       label.setLayoutX(280);
       label.setLayoutY(140);
       pane.getChildren().add(label);

       Button button = new Button();
       button.setText("Yes!!!");
       button.setLayoutX(200);
       button.setLayoutY(180);
       pane.getChildren().add(button);



       Button button1 = new Button();
       button1.setText("No((");
       button1.setLayoutX(350);
       button1.setLayoutY(180);
       pane.getChildren().add(button1);

        button.setOnMouseClicked(e -> label.setText("I know it)))"));

        button1.setOnMouseClicked(e -> {
            Random random = new Random();
            int rand = random.nextInt(600);
            int rand2 = random.nextInt(400);
            int rand3 = random.nextInt(4);
            button1.setLayoutX(rand);
            button1.setLayoutY(rand2);
            label.setText("that's lie) ");

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Aleg");
            alert.setHeaderText("GO LEARN DYSKRETKA kurva!!!!");

            if(rand3 == 3 || rand3 == 2){
                alert.show();
            }

      });


        Scene scene = new Scene(pane, 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}