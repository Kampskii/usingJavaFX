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
    Image TinykeanuImage;  ImageView Tinykeanu;
    Image TinysteveImage; ImageView Tinysteve;
    Image guacardoImage; ImageView Guacardo;
    Image dodgerImage; ImageView Dodger;
    Image leviImage; ImageView Levi;

    ImageView imageView;

    FileInputStream input1; //Keanu
    FileInputStream input2; //Steve
    FileInputStream input3; //Guacardo
    FileInputStream input4; //Dodger
    FileInputStream input5; //Levi


    @Override
    public void start(Stage stage) throws FileNotFoundException {
        stage.setTitle("Cevans");

        // creating UI elements ??

        // Importing Image(s)

        input1 = new FileInputStream("/Users/alyciaklot/Downloads/Tiny Keanu.png");
        TinykeanuImage = new Image(input1);
        Tinykeanu = new ImageView(TinykeanuImage);
        Tinykeanu.setFitHeight(189); Tinykeanu.setFitWidth(150);

        input2 = new FileInputStream("/Users/alyciaklot/Downloads/Tiny Steve Rogers.jpg");
        TinysteveImage = new Image(input2);
        Tinysteve = new ImageView(TinysteveImage);
        Tinysteve.setFitHeight(190); Tinysteve.setFitWidth(190);

        input3 = new FileInputStream("/Users/alyciaklot/Downloads/Guacardo.png");
        guacardoImage = new Image(input3);
        Guacardo = new ImageView(guacardoImage);
        Guacardo.setFitHeight(191); Guacardo.setFitWidth(143);

        input4 = new FileInputStream("/Users/alyciaklot/Downloads/Dodger.jpg");
        dodgerImage = new Image(input4);
        Dodger = new ImageView(dodgerImage);
        Dodger.setFitHeight(190); Dodger.setFitWidth(153);

        input5 = new FileInputStream("/Users/alyciaklot/Downloads/Freaked Out Levi.jpg");
        leviImage = new Image(input5);
        Levi = new ImageView(leviImage);
        Levi.setFitHeight(190); Levi.setFitWidth(233);

        //Thy Buttons/Menus/idk

        //Toggle Button(s)
        ToggleButton toggleButton1 = new ToggleButton("Choice 1");
        toggleButton1.setOnAction(actionEvent -> userClicked1() );
        ToggleButton toggleButton2 = new ToggleButton("Choice 2");




        // creating Layout
        HBox thyLayout = new HBox(toggleButton1, toggleButton2);
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

    private void userClicked1() {
        Tinykeanu.setImage(TinykeanuImage);
    }
}
