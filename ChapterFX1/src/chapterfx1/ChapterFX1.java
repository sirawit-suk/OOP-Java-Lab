/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapterfx1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 *
 * @author Sirawit
 */
public class ChapterFX1 extends Application{

    @Override
    public void start (Stage stage) throws Exception {
        Scene scene = new Scene(new Button("OK"), 100, 200);
        stage.setTitle("MyJavaFX");
        stage.setScene(scene);
        stage.show();
        
        Stage stage2 = new Stage();
        stage2.setTitle("Second Stage");
        Scene sc2 = new Scene(new Button("Bye bye"), 200, 100);
        stage2.setScene(sc2);
        stage2.show();
    
    }
    public static void main(String[] args) {
        launch(args);
    }
    
}
