/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hellofx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 *
 * @author Sirawit
 */
public class HelloFX extends Application{

    @Override
    public void start (Stage stage) throws Exception {
        Button btOk = new Button("OK");
        Scene scene = new Scene(btOk, 100, 200);
        stage.setTitle("MyJavaFX");
        stage.setScene(scene);
        stage.show();
    
    }
    public static void main(String[] args) {
        launch(args);
    }
    
}
