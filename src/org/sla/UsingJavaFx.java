package org.sla;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javax.swing.text.html.ImageView;
import java.io.FileInputStream;


public class UsingJavaFx extends Application {
    // Fields for UI elements
    Label someText;
    Label moreText;
    Button firstButton;

    public void userClicked(){
        moreText.setText("Stan Erwin Smith");
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Cevans");

        // creating UI elements
        firstButton = new Button("click click");
        firstButton.setOnAction(actionEvent -> {
            userClicked();
        });
        someText = new Label("helloooo");
        moreText = new Label("Stan Reiner");

        //Importing Image
        FileInputStream input = new FileInputStream("");
        Image image = new image(input);
        ImageView imageView = new ImageView(input);

        //Check box(s)
        CheckBox checkBox1 = new CheckBox("Choice 1");
        CheckBox checkBox2 = new CheckBox("Choice 2");

        // Radio Button(s)
        RadioButton radioButton1 = new RadioButton("1");
        RadioButton radioButton2 = new RadioButton("2");
        RadioButton radioButton3 = new RadioButton("3");

        ToggleGroup radioGroup = new ToggleGroup();
        radioButton1.setToggleGroup(radioGroup);
        radioButton2.setToggleGroup(radioGroup);
        radioButton3.setToggleGroup(radioGroup);

        radioButton1.setOnAction(actionEvent -> {
            System.out.println("I am the right brain");
        });

        radioButton2.setOnAction(actionEvent -> {
            System.out.println("I am the left brain");
        });

        radioButton3.setOnAction(actionEvent -> {
            System.out.println("And I'm just here");
        });

        // creating Layout
        HBox thyLayout = new HBox(firstButton, someText, moreText, radioButton1, radioButton2,radioButton3,checkBox1,checkBox2);

        // creating Scene
        Scene thyScene = new Scene(thyLayout);
        stage.setScene(thyScene);

        stage.setWidth(500);
        stage.setHeight(500);

        // display Scene
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
