/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package launchpadmobile;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.Window;

/**
 *
 * @author chushaa
 */
public class FXMLDocumentController implements Initializable {  
    @FXML
    Button logInBtn;
    TextField username;
    TextField password;
    
    String correctUsername = "admin";
    String correctPassword = "password";
    
    @FXML
    protected void loginButtonAction(ActionEvent event) throws IOException{
        if((username.getText()).equals(correctUsername) && (password.getText().equals(correctPassword))){
            Scene scene = logInBtn.getScene();
            Window window = scene.getWindow();
            Stage stage = (Stage) window;

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("MainPage.fxml"));
            //logInBtn.getScene().setRoot(fxmlLoader.getRoot());
            Pane mainPain = fxmlLoader.load();
        }
        else
        {
            
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
