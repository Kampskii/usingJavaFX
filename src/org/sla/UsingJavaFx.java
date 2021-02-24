package org.sla;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class UsingJavaFx extends Application {
    // Fields for UI elements
    Image TinykeanuImage; Image TinysteveImage; Image guacardoImage;
    ImageView Tinykeanu; ImageView Tinysteve; ImageView Guacardo;
    FileInputStream input;


    @Override
    public void start(Stage stage) throws FileNotFoundException {
        stage.setTitle("Cevans");

        // creating UI elements ??

        // Importing Image(s)

        input = new FileInputStream("/Users/alyciaklot/Downloads/Tiny Keanu.png");
        TinykeanuImage = new Image(input);
        Tinykeanu = new ImageView(TinykeanuImage);
        Tinykeanu.setFitHeight(189); Tinykeanu.setFitWidth(150);

        input = new FileInputStream("/Users/alyciaklot/Downloads/Tiny Steve Rogers.png");
        TinysteveImage = new Image(input);
        Tinysteve = new ImageView(TinysteveImage);
        Tinysteve.setFitHeight(190); Tinysteve.setFitWidth(190);

        //input = new FileInputStream("/Users/alyciaklot/Downloads/Guacardo.png");
        //guacardoImage = new Image(input);
        //Guacardo = new ImageView(guacardoImage);


            // Radio Button(s)
        RadioButton radioButton1 = new RadioButton("1");
        RadioButton radioButton2 = new RadioButton("2");
        RadioButton radioButton3 = new RadioButton("3");

        ToggleGroup radioGroup = new ToggleGroup();
        radioButton1.setToggleGroup(radioGroup);
        radioButton2.setToggleGroup(radioGroup);
        radioButton3.setToggleGroup(radioGroup);

            // Radio Button(s) actions
        radioButton1.setOnAction(actionEvent -> {
            System.out.println("I am the right brain");
        });
        radioButton2.setOnAction(actionEvent -> {
            System.out.println("I am the left brain");
        });
        radioButton3.setOnAction(actionEvent -> {
            System.out.println("And I'm just here");
        });

        // Check box(s)
        CheckBox checkBox1 = new CheckBox("Choice 1");
        CheckBox checkBox2 = new CheckBox("Choice 2");

        // Check box(s) actions
        checkBox1.setOnAction(actionEvent -> {
            System.out.println("Blue Pill");
        });
        checkBox2.setOnAction(actionEvent -> {
            System.out.println("Red Pill");
        });


        // creating Layout
        HBox thyLayout = new HBox(Tinykeanu);

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
