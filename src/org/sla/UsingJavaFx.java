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
    // Fields
    Image TinykeanuImage;
    Image TinysteveImage;
    Image reinerImage;
    Image leviImage;
    Image erwinImage;

    ImageView imageView1;
    ImageView imageView2;
    ImageView imageView3;
    ImageView imageView4;

    FileInputStream input1; //Keanu
    FileInputStream input2; //Steve
    FileInputStream input3; //Reiner
    FileInputStream input4; //Levi
    FileInputStream input5; //Erwin

    ToggleButton toggleButton1;

    MenuButton menuButton;
    MenuItem menuItem1;
    MenuItem menuItem2;
    MenuItem menuItem3;

    @Override
    public void start(Stage stage) throws FileNotFoundException {
        stage.setTitle("Test 1");

        // creating UI elements ??
        imageView1 = new ImageView();
        imageView2 = new ImageView();
        imageView3 = new ImageView();
        imageView4 = new ImageView();

        // Importing Image(s)

        input1 = new FileInputStream("/Users/alyciaklot/Downloads/Tiny Keanu.png");
        TinykeanuImage = new Image(input1);

        input2 = new FileInputStream("/Users/alyciaklot/Downloads/Tiny Steve Rogers.jpg");
        TinysteveImage = new Image(input2);

        input3 = new FileInputStream("/Users/alyciaklot/Downloads/Reiner.png");
        reinerImage = new Image(input3);

        input4 = new FileInputStream("/Users/alyciaklot/Downloads/Freaked Out Levi.jpg");
        leviImage = new Image(input4);

        input5 = new FileInputStream("/Users/alyciaklot/Downloads/Erwin.jpg");
        erwinImage = new Image(input5);

        //Thy Buttons/Menus/idk

        //Toggle Button(s)
        toggleButton1 = new ToggleButton("Idk Press it");
        toggleButton1.setOnAction(actionEvent -> userClicked1() );

        final ToggleGroup group = new ToggleGroup();
        group.getToggles().addAll(toggleButton1);

        //Menu Button
        menuButton = new MenuButton("AOT", imageView1, menuItem1, menuItem2, menuItem3);
        menuItem1 = new MenuItem("Erwin Smith");
        menuItem1.setOnAction(actionEvent -> userClicked2() );
        menuItem2 = new MenuItem("Levi Ackerman");
        menuItem2.setOnAction(actionEvent -> userClicked3() );
        menuItem3 = new MenuItem("Reiner Braun");
        menuItem3.setOnAction(actionEvent -> userClicked4() );

        // creating Layout
        HBox thyLayout = new HBox(toggleButton1, menuButton, imageView1, imageView2, imageView3, imageView4);
        // creating Scene
        Scene thyScene = new Scene(thyLayout);
        // display Scene
        stage.show();
        stage.setScene(thyScene);
        stage.setWidth(800);
        stage.setHeight(800);
    }

    private void userClicked1() { //Have it switch to Steve
        boolean isSelected = toggleButton1.isSelected();
        if (isSelected) {
            imageView1.setImage(TinykeanuImage);
            imageView1.setFitHeight(252);
            imageView1.setFitWidth(200);
        } else {
            imageView1.setImage(TinysteveImage);
            imageView1.setFitHeight(249);
            imageView1.setFitWidth(250);

        }
    }

    private void userClicked2() {
        imageView2.setImage(erwinImage);
        imageView2.setFitHeight(251);  imageView2.setFitWidth(476);
    }

    private void userClicked3() {
        imageView3.setImage(leviImage);
        imageView3.setFitHeight(2);  imageView3.setFitWidth(310);
    }

    private void userClicked4() {
        imageView4.setImage(reinerImage);
        imageView4.setFitHeight(252);  imageView4.setFitWidth(336);
    }

    public static void main(String[] args) {
        Application.launch(args);
    }

}
