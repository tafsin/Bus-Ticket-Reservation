package MVC_Structure.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.net.URL;
import java.sql.*;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.EventObject;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import MVC_Structure.model.ConnectionClass;
import MVC_Structure.model.ConnectionClass;

public class Controller implements Initializable {
    public TextField textField;
    public Label textLabel;
    public PasswordField passwordField;
    public Button button;
    public Button signup;
    public Button adminlogin;
    ResultSet resultSet = null;
    //  Connection connection = null;
    PreparedStatement pst = null;

    public void button(ActionEvent actionEvent) {

        String username = textField.getText();
        String pass = passwordField.getText();
        if ( username.equals("") && pass.equals("")) {
            Alert a = new Alert(Alert.AlertType.NONE);
            a.setAlertType(Alert.AlertType.ERROR);
            a.setContentText("Invalid username or password");

            a.show();
        } else {
            try {
                ConnectionClass connectionClass = new ConnectionClass();
                Connection connection = connectionClass.getConnection();
                pst = connection.prepareStatement("select * from user where uname=? and password=?");
                pst.setString(1, username);
                pst.setString(2, pass);
                resultSet = pst.executeQuery();
                if (resultSet.next()) {


                    Parent parent = FXMLLoader.load(getClass().getResource("/MVC_Structure/view/book.fxml"));
                    Scene scene = new Scene(parent);
                    Stage window = (Stage)((Node) actionEvent.getSource()).getScene().getWindow();
                    window.setScene(scene);
                    window.show();




                } else {
                    Alert alert = new Alert(Alert.AlertType.NONE);
                    alert.setAlertType(Alert.AlertType.ERROR);
                    alert.setContentText("Invalid username or password");
                    alert.show();
                }

            } catch (SQLException | IOException ex) {
                Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);

            }
        }




    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


    }

    public void signup(ActionEvent actionEvent)  {

        ;
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("/MVC_Structure/view/signup.fxml"));
            Scene scene = new Scene(parent);
              Stage window = (Stage)((Node) actionEvent.getSource()).getScene().getWindow();
            window.setScene(scene);
            window.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void adminlogin(ActionEvent actionEvent) {

        try {
            Parent parent = FXMLLoader.load(getClass().getResource("/MVC_Structure/view/adminlogin.fxml"));
            Scene scene = new Scene(parent);
            Stage window = (Stage)((Node) actionEvent.getSource()).getScene().getWindow();
            window.setScene(scene);
            window.show();
        } catch (IOException e) {
            e.printStackTrace();
        }


        
        
  }
    
    
    public void adminPage(ActionEvent actionEvent){
        String username = textField.getText();
        String pass = passwordField.getText();
        if ( username.equals("") && pass.equals("")) {
            Alert a = new Alert(Alert.AlertType.NONE);
            a.setAlertType(Alert.AlertType.ERROR);
            a.setContentText("Invalid username or password");

            a.show();
        } else {
            try {
                ConnectionClass connectionClass = new ConnectionClass();
                Connection connection = connectionClass.getConnection();
                pst = connection.prepareStatement("select * from admin where username=? and password=?");
                pst.setString(1, username);
                pst.setString(2, pass);
                resultSet = pst.executeQuery();
                if (resultSet.next()) {


                    Parent parent = FXMLLoader.load(getClass().getResource("/MVC_Structure/view/admin.fxml"));
                    Scene scene = new Scene(parent);
                    Stage window = (Stage)((Node) actionEvent.getSource()).getScene().getWindow();
                    window.setScene(scene);
                    window.show();




                } else {
                    Alert alert = new Alert(Alert.AlertType.NONE);
                    alert.setAlertType(Alert.AlertType.ERROR);
                    alert.setContentText("Invalid username or password");
                    alert.show();
                }

            } catch (SQLException | IOException ex) {
                Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);

            }
        }
    }
}

