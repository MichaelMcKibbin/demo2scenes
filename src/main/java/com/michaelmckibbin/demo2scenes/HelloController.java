package com.michaelmckibbin.demo2scenes;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    @FXML
    public Label view2Text;
    @FXML
    public Label view1Text;
    @FXML
    public Label view3Text;
    @FXML
    public Label view4Text;


    /*
    Show text on label when button is clicked
     */
//    @FXML
//    private Label welcomeText;
//
//
//    @FXML
//    protected void onHelloButtonClick() {
//        welcomeText.setText("Welcome to hello view!");
//    }


///*
//Open a new window when button is clicked
// */
//    @FXML
//    private Button welcomeText;
//
//    @FXML
//    private void onHelloButtonClick() {
//        try {
//            // Load the view-2.fxml file
//            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/michaelmckibbin/demo2scenes/view-2.fxml"));
//            Parent root = loader.load();
//
//            // Create a new stage and set the scene
//            Stage stage = new Stage();
//            stage.setScene(new Scene(root));
//            stage.show();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }


    /*
    close first window and open second window when button is clicked
     */

    @FXML
    private Button helloButton;
    @FXML
    private Button button1;
    @FXML
    private Button button2;
    @FXML
    private Button button3;

    @FXML
    private void onHelloButtonClick() {
        try {
            // Load the view-2.fxml file
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/michaelmckibbin/demo2scenes/hello-view.fxml"));
            Parent root = loader.load();

            // Create a new stage and set the scene
            Stage stage = new Stage();
            stage.setTitle("Hello Controller Stage"); // Set the stage title
            stage.setScene(new Scene(root, 800, 600)); // Set the scene size

            // Get the current stage (window) and close it
            Stage currentStage = (Stage) helloButton.getScene().getWindow();
            currentStage.close();

            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void onView1ButtonClick() {
        try {
            // Load the view-1.fxml file
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/michaelmckibbin/demo2scenes/view-1.fxml"));
            Parent root = loader.load();

            // Create a new stage and set the scene
            Stage stage = new Stage();
            stage.setTitle("View 1 Window"); // Set the stage title
            stage.setScene(new Scene(root, 800, 600)); // Set the scene size

            // Get the current stage (window) and close it
            Stage currentStage = (Stage) button1.getScene().getWindow();
            currentStage.close();

            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void onView2ButtonClick() {
        try {
            // Load the view-2.fxml file
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/michaelmckibbin/demo2scenes/view-2.fxml"));
            Parent root = loader.load();

            // Create a new stage and set the scene
            Stage stage = new Stage();
            stage.setTitle("View 2 Window"); // Set the stage title
            stage.setScene(new Scene(root, 800, 600)); // Set the scene size

            // Get the current stage (window) and close it
            Stage currentStage = (Stage) button2.getScene().getWindow();
            currentStage.close();

            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void onView3ButtonClick() {
        try {
            // Load the view-3.fxml file
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/michaelmckibbin/demo2scenes/view-3.fxml"));
            Parent root = loader.load();

            // Create a new stage and set the scene
            Stage stage = new Stage();
            stage.setTitle("View 3 Window"); // Set the stage title
            stage.setScene(new Scene(root, 800, 600)); // Set the scene size

            // Get the current stage (window) and close it
            Stage currentStage = (Stage) button3.getScene().getWindow();
            currentStage.close();

            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}