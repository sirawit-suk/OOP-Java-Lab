
import java.util.Observable;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.SelectionMode;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.util.converter.IntegerStringConverter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author Sirawit
 */
public class Test extends Application{
    
    
    ListView<String> listView;
    
    Stage selectStage;
    
    ScrollTagBar tagBar;
    
    
    public static void main(String[] args) {
        launch(args); //inside Application Class
        
    }
    

    @Override
    public void start(Stage stage) throws Exception {
        
        tagBar = new ScrollTagBar(); // Own Class see in ScrollTagBar.java
        
        ScrollPane tagScrollPane= new ScrollPane();
        
        tagScrollPane.setMinHeight(50);
        //setPrefSize(300, 400);
        //pannableProperty().set(true);
        tagScrollPane.fitToWidthProperty().set(true);
        tagScrollPane.hbarPolicyProperty().setValue(ScrollPane.ScrollBarPolicy.NEVER);
        tagScrollPane.vbarPolicyProperty().setValue(ScrollPane.ScrollBarPolicy.AS_NEEDED);
        tagScrollPane.getStyleClass().add("tag-bar");
        tagScrollPane.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
        
        tagScrollPane.setContent(tagBar);
        
        
        

        Button selectBtn = new Button("Select Style(s)");
        selectBtn.setOnAction(e -> { // Select and open new Stage(New Window)
                selectStage = new Stage();
                selectStage.initModality(Modality.APPLICATION_MODAL);

                listView = new ListView<>();
                listView.getItems().addAll("Gud","I","Find","Naa","Hee","Len","tae","Game","-3-"); //DATA
                listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

                Button summitBtn = new Button("Summit");
                summitBtn.setOnAction(evt -> {

                    summitClicked();
                    //When Everything is Done! 
                    selectStage.close();
                });

                Button cancelBtn = new Button("Cancel");
                cancelBtn.setOnAction(evt -> selectStage.close()); // Force Close!
                //HBox
                HBox summitAndCancelBox = new HBox();
                summitAndCancelBox.getChildren().addAll(summitBtn,cancelBtn); //Botton of Window

                //VBox 
                VBox totalVBox = new VBox();
                totalVBox.getChildren().addAll(exitButton(),listView,summitAndCancelBox);

                Scene selectScene = new Scene(totalVBox);
                selectStage.setScene(selectScene);
                selectStage.showAndWait();
        });
        
        Button sortBtn = new Button("Sort");     
        sortBtn.setOnAction(e -> {
            FXCollections.sort(tagBar.getTags()); //Sort from A-Z a->z
        });

        VBox root = new VBox();
        root.getAlignment();
        root.getChildren().addAll(selectBtn, tagScrollPane, sortBtn);
        root.setMinSize(300, 400);

        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
    }

    private void summitClicked() {
        String testMessage = "";
        ObservableList<String> styleList;
        styleList = listView.getSelectionModel().getSelectedItems();
        
        for (String list : styleList) {
            
            if (!tagBar.getTags().contains(list)) {
                tagBar.getTags().add(list);
            }
            
            testMessage += list + ", ";
        }
        
        
        
        System.out.println("You have been selected style(s) :\n" + testMessage);
        
    }
    
    private Button exitButton() {

        ImageView exit_icon = new ImageView(new Image("/icon/close-512-detail.png"));
        ImageView exit_hover_icon = new ImageView(new Image("/icon/close-512_hover.png"));
        exit_icon.setFitWidth(15);
        exit_icon.setFitHeight(15);
        exit_hover_icon.setFitWidth(15);
        exit_hover_icon.setFitHeight(15);
        
        Button exit = new Button("", exit_icon);
        exit.setOnMouseEntered(e -> {
            exit.setGraphic(exit_hover_icon);
        });
        exit.setOnMouseExited(e -> {
            exit.setGraphic(exit_icon);
        });
        exit.setOnMouseClicked(e -> {
            selectStage.close();
        });
        exit.setStyle("-fx-background-color : transparent;");
        exit.setPadding(Insets.EMPTY);
        exit.setTranslateX(140);
        exit.setTranslateY(0);

        return exit;
    }

}
