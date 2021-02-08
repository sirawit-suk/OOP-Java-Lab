/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapterfx2;

import javafx.scene.control.Button;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 *
 * @author Sirawit
 */
public class ChapterFX2 extends Application{

    @Override
    public void start(Stage stage) throws Exception {
        HBox hbox = new HBox(10);
        hbox.setAlignment(Pos.CENTER);
        Button okBtn = new Button("OK");
        Button clBtn = new Button("Cancel");
        hbox.getChildren().addAll(okBtn, clBtn);
    
        OkHandlerClass h1 = new OkHandlerClass();
        okBtn.setOnAction(h1);
        
        CancelHandlerClass h2 = new CancelHandlerClass();
        clBtn.setOnAction(h2);
        
        Scene scene = new Scene(hbox, 400, 200);
        stage.setScene(scene);
        stage.show();
        
    }
    
    public static void main(String[] args) {
        launch(args);
    }

    private static class CancelHandlerClass implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent t) {
            System.out.println("Cancel button clicked");
        }
    }

    private class OkHandlerClass implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent t) {
            System.out.println("OK button Created");
        }
    }


    
}
