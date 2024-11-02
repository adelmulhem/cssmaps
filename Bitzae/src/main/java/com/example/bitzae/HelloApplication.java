package com.example.bitzae;

import javafx.application.Application;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        BorderPane borderPane=new BorderPane();
        ImageView imageView=new ImageView();
        VBox vBox=new VBox();
        HBox hBox=new HBox();
        Label label=new Label("pizza Delivery");
        borderPane.setCenter(label);
        label.setFont(new Font(35));
        label.setTextFill(Color.RED);
        Label label1=new Label("your name:       ");
        TextField textField=new TextField();
        HBox hBox1=new HBox();
        hBox1.getChildren().add(label1);
        hBox1.getChildren().add(textField);
        Label label2=new Label( "phone number:");
        TextField textField1=new TextField();
        HBox hBox2=new HBox();
        hBox2.getChildren().add(label2);
        hBox2.getChildren().add(textField1);
ImageView imageView1=new ImageView("add.b.jpg");
imageView1.setFitHeight(200);
imageView1.setFitWidth(200);
        Label label3=new Label("Crust:");
        HBox hBox5=new HBox();
        ToggleGroup group=new ToggleGroup();
        RadioButton radioButton=new RadioButton("Thick");
        RadioButton radioButton1=new RadioButton("This");
        HBox hBox6=new HBox();
        hBox6.getChildren().add(label3);
        hBox6.setAlignment(Pos.BASELINE_LEFT);
        hBox5.getChildren().add(radioButton);
        hBox5.getChildren().add(radioButton1);
        hBox5.setAlignment(Pos.BASELINE_CENTER);
        Label label4=new Label("Toppings:");
HBox hBox4=new HBox();
        CheckBox checkBox=new CheckBox();
        CheckBox checkBox1=new CheckBox();
        CheckBox checkBox2=new CheckBox();
        CheckBox checkBox3=new CheckBox();
        hBox4.getChildren().add(label4);
        checkBox.setText("Olives");

        checkBox1.setText("Mushroom");

        checkBox2.setText("Corn");

        checkBox3.setText("Sausage");

        VBox vBox2 =new VBox();
        vBox2.getChildren().addAll(checkBox,checkBox1,checkBox2,checkBox3);
        Button button=new Button();
        button.setText("Send Order");
        button.setStyle("-fx-background-color:Green");


button.setOnAction(e->{
    Stage secondStage=new Stage();
    Label nlabel=new Label("Order sent successfully");
    nlabel.setTextFill(Color.GREEN);
    nlabel.setFont(new Font(33));
    Scene scene2=new Scene(nlabel,350,500);
    secondStage.setScene(scene2);
    secondStage.show();
});

Button button1=new Button();
button1.setText("Clear order");
button1.setStyle("-fx-background-color:red");
HBox hBox3=new HBox();
hBox3.setAlignment(Pos.BASELINE_CENTER);
hBox3.getChildren().addAll(button,button1);
        VBox vBox1=new VBox();
        vBox1.setAlignment(Pos.TOP_CENTER);
        vBox1.getChildren().addAll(label,imageView1,hBox1,hBox2,hBox5,hBox6,vBox2,hBox3);
        Scene scene = new Scene(vBox1, 350, 450);
        stage.setTitle("pizza");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}