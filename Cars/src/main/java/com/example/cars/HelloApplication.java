package com.example.cars;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        Label label=new Label("cars program");
        BorderPane borderPane=new BorderPane();
       label.setFont(new Font(25));
       Label label1=new Label("Name");
borderPane.setCenter(label);
        BorderPane borderPane1=new BorderPane();
borderPane1.setCenter(label1);
        TextField textField=new TextField();
        BorderPane borderPane2=new BorderPane();
borderPane2.setCenter(textField);
Label label2=new Label("Year");
        BorderPane borderPane3=new BorderPane();
borderPane3.setCenter(label2);
        TextField textField1=new TextField();
        BorderPane borderPane4=new BorderPane();
        borderPane4.setCenter(textField1);
        Label label3=new Label("Color");
        BorderPane borderPane5=new BorderPane();
        borderPane5.setCenter(label3);
        TextField textField2=new TextField();
        BorderPane borderPane6=new BorderPane();
        borderPane6.setCenter(textField2);
        Button button=new Button("Add Car");
        BorderPane borderPane7=new BorderPane();
        borderPane7.setCenter(button);
        Button button1=new Button("carlist");
        Label label4=new Label();
        ArrayList carlist=new ArrayList<>();
        button.setOnAction(actionEvent -> {
            String Name = textField.getText();
            String Year = textField1.getText();
            String color = textField2.getText();
            Car car = new Car(Name, Year, color);
            carlist.add(car);
            textField.clear();
            textField1.clear();
            textField2.clear();
            label4.setText("Car Count \n "+ carlist.size());


        });   VBox vBox=new VBox();
        button1.setOnAction(actionEvent -> {
            int i=1;
            for (Object car: carlist){
                i++;
                Label  labelcar= new Label(car.toString());
                labelcar.setFont(new Font( 15));
                vBox.getChildren().add(labelcar);



            }});
        Label label5=new Label("Cars Count:");
        BorderPane borderPane8=new BorderPane();
        borderPane8.setCenter(label4);


        vBox.setLayoutY(50);
        vBox.getChildren().addAll(borderPane,borderPane1,borderPane2,borderPane3,borderPane4,borderPane5,borderPane6,borderPane7,borderPane8,button1);
        Scene scene = new Scene(vBox, 250, 350);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args)  ;

    }
}