
import java.util.Observable;
import javafx.application.Application;  //Application 
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos; //Position

import javafx.scene.Scene; //Scene
import javafx.scene.control.Button; //Button
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label; //Label Text
import javafx.scene.control.ListView;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane; //defaultPane 5 section top left right center and bottom
import javafx.scene.layout.GridPane; //?
import javafx.scene.layout.HBox; //HBox 
import javafx.scene.layout.VBox; //VBox
import javafx.scene.layout.StackPane; //Simple Layout StackPane

import javafx.stage.Stage;  //Stage


public class Main extends Application{

    Stage window;
    Scene scene1,scene2;
    String answer;
    
    TableView<Product> table;
    TextField nameInput,priceInput,quantityInput;
    
    BorderPane layout2;
    
    public static void main(String[] args) {
        launch(args); //inside Application Class
    }

    @Override   //Real Main of JAVA FX is in here 
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        
        //file menu
        Menu fileMenu = new Menu("File");
        
        //Menu items
        MenuItem newFile = new MenuItem("New...");
        newFile.setOnAction(e-> System.out.println("Create a new file"));
        newFile.setDisable(true);
        fileMenu.getItems().add(newFile);
        

        fileMenu.getItems().add(new MenuItem("Open..."));
        fileMenu.getItems().add(new MenuItem("Save..."));
        fileMenu.getItems().add(new SeparatorMenuItem());
        fileMenu.getItems().add(new MenuItem("Settings..."));
        fileMenu.getItems().add(new SeparatorMenuItem());
        fileMenu.getItems().add(new MenuItem("Exit"));
        
        //Edit Menu
        Menu editMenu = new Menu("_Edit");
        editMenu.getItems().add(new MenuItem("Cut"));
        editMenu.getItems().add(new MenuItem("Copy"));
        editMenu.getItems().add(new MenuItem("Paste"));

        //Main menu bar
        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().addAll(fileMenu, editMenu);
        
        layout2 = new BorderPane();
        layout2.setTop(menuBar);
        
        //Name column
        TableColumn<Product,String> nameColumn = new TableColumn<>("Name");
        nameColumn.setMinWidth(200);
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        
        //Price column
        TableColumn<Product,Double> priceColumn = new TableColumn<>("Price");
        priceColumn.setMinWidth(100);
        priceColumn.setCellValueFactory(new PropertyValueFactory<>("price"));        
  
        //Quantity column
        TableColumn<Product,Integer> quantityColumn = new TableColumn<>("Quantity");
        quantityColumn.setMinWidth(100);
        quantityColumn.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        
        //Name input
        nameInput = new TextField();
        nameInput.setPromptText("Name");
        nameInput.setMinWidth(100);
        
        //Price input
        priceInput = new TextField();
        priceInput.setPromptText("Price");
        priceInput.setMinWidth(100);
        
        //Name input
        quantityInput = new TextField();
        quantityInput.setPromptText("Quantity");
        quantityInput.setMinWidth(100);
        
        //Button
        Button addButton = new Button("Add");
        addButton.setMinWidth(60);
        addButton.setOnAction(e -> addButtonClicked());
        Button deleteButton = new Button("Delete");
        deleteButton.setMinWidth(60);
        deleteButton.setOnAction(e -> deleteButtonClicked());
        
        HBox hBox = new HBox();
        hBox.setPadding(new Insets(10,10,10,10));
        hBox.setSpacing(10);
        hBox.getChildren().addAll(
                nameInput,
                priceInput,
                quantityInput,
                addButton,
                deleteButton);
        
        
        table = new TableView<>();
        table.setItems(getProduct());
        table.getColumns().addAll(nameColumn,priceColumn,quantityColumn);
        
       
        
        
        /*
        TreeItem<String> root, bucky, megan;
        TreeItem<String> one,two,three,four,five;
        
        
        //Root
        root = new TreeItem<>("root");
        root.setExpanded(true);
        
        //Bucky
        bucky = makeBranch("Bucky", root);
        one = makeBranch("thenewSirAwit", bucky);
        two = makeBranch("Youtube", bucky);
        three = makeBranch("Chicken", bucky);
        
        //Megan
        megan = makeBranch("Megan", root);
        four = makeBranch("Glitter", megan);
        five = makeBranch("Makeup", megan);
        
        //Create tree
        TreeView<String> tree = new TreeView<>(root);
        tree.setShowRoot(false);
        tree.getSelectionModel().selectedItemProperty().addListener((v,oldValue,newValue) -> {
        
            if(newValue != null)
                System.out.println(newValue.getValue());
        });
        */
        
       
        /*
        //CheckBox
        CheckBox box1 = new CheckBox("Bacon");
        CheckBox box2 = new CheckBox("Tuna");
        box2.setSelected(true);
        */
        /*
        
        
        ListView<String> listView = new ListView<>();
        listView.getItems().addAll(
                "Iron Man",
                "Titanic",
                "Matrix",
                "Captain US"        
        );
        listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        
        button.setOnAction(e-> buttonClicked(listView));
        */
        /*
        ComboBox<String> comboBox = new ComboBox<>();
        comboBox.getItems().addAll(
                "Bodyslam",
                "Big ass",
                "Paradox"
        );
        
        comboBox.setPromptText("Favorite Band?");
        comboBox.setEditable(true);
        
        button.setOnAction(e-> printSong(comboBox));
        
        comboBox.setOnAction(e -> System.out.println("User selected: "+comboBox.getValue()));
        */
        /*
        ChoiceBox<String> choiceBox = new ChoiceBox<>();
        //getItems returns the ObservableList object
        choiceBox.getItems().add("Apple");
        choiceBox.getItems().add("Banana");        
        choiceBox.getItems().add("Orange"); 
        choiceBox.getItems().addAll("Bacon","Ham","Meatballs");
        
        //Set a default value
        choiceBox.setValue("Apple");
        
        //Listen for selection changes
        choiceBox.getSelectionModel().selectedItemProperty().addListener( (list, old, neww) -> System.out.println(neww));
        */
        //button.setOnAction(e-> getChoice(choiceBox));
        
        //button.setOnAction(e-> handleOption(box1,box2));
        
        //Layout
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20,20,20,20));
        layout.getChildren().addAll(menuBar,table,hBox);
        
        Scene scene1 = new Scene(layout);
        
        window.setTitle("Kuy rai wa nee");
        window.setScene(scene1);
        window.show();
         /*
        //Form
        TextField nameInput = new TextField();
        
        Button button = new Button("Click me");
        button.setOnAction(e-> isInt(nameInput,nameInput.getText()));
        */
        
        
        /*
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(20,20,20,20));
        grid.setVgap(8); //8
        grid.setHgap(10); //10
        
        //Name label
        Label nameLabel = new Label("Username: ");
        GridPane.setConstraints(nameLabel, 0, 0); //What child, column, what roll
        //Name input
        TextField nameInput = new TextField();
        nameInput.setPromptText("username");
        GridPane.setConstraints(nameInput, 1, 0);
        
        //Password label
        Label passLabel = new Label("Password: ");
        GridPane.setConstraints(passLabel, 0, 1);
        //Password input
        TextField passInput = new TextField();
        passInput.setPromptText("password");
        GridPane.setConstraints(passInput, 1, 1);
        
        Button loginButton = new Button("Log in");
        GridPane.setConstraints(loginButton, 1, 2);
        
        grid.getChildren().addAll(nameLabel, nameInput, passLabel, passInput, loginButton);
        */
        
        
        //Scene scene1 = new Scene(layout,300,200);
        
        
        /*
        HBox topMenu = new HBox(5);
        Button buttonA = new Button("File");
        Button buttonB = new Button("Edit");
        Button buttonC = new Button("View");
        topMenu.getChildren().addAll(buttonA, buttonB, buttonC);
        topMenu.setAlignment(Pos.CENTER_LEFT);
        
        VBox leftMenu = new VBox(10);
        Button buttonD = new Button("D");
        Button buttonE = new Button("E");
        Button buttonF = new Button("F");
        leftMenu.getChildren().addAll(buttonD, buttonE, buttonF);
        
        BorderPane borderPane = new BorderPane();
        borderPane.setTop(topMenu);
        borderPane.setLeft(leftMenu);
        
       
        Scene scene1 = new Scene(borderPane,300,250);
        */
        
        /*
        window.setOnCloseRequest(e -> {
            e.consume(); // Let's me control my own medthod
            closeProgram();
        });
        
        //Button 1
        Label label1 = new Label("Welcome to scene 1!");
        Button button1 = new Button("Save & Exit");
        button1.setOnAction(e-> closeProgram());
        
        //Button button1 = new Button("Go to Scene2");
        //button1.setOnAction(e -> AlertBox.display("TiTle ASD", "Oh shit"));        
        */
        /*
        button1.setOnAction(e -> {
            boolean result = ConfirmBox.display("Confirm your detemine", "Are you sure you want to send a naked pic?");
            System.out.println(result);
        });
        */
        
        //Layout 1 = children are lay out in vertical column
        /*
        VBox layout1 = new VBox(20); //20 pixels
        layout1.getChildren().addAll(label1, button1);
        layout1.setAlignment(Pos.CENTER);
        scene1 = new Scene(layout1, 200, 200);
        */
        /*
        //Button 2 
        Label label2 = new Label("This scene is suck!");
        Button button2 = new Button("Go to Scene1");
        button2.setOnAction(e -> window.setScene(scene1));
        
        //Layout 2 = children are lay out in HNox
        HBox layout2 = new HBox(20); //20 pixels
        layout2.getChildren().addAll(label2, button2);
        scene2 = new Scene(layout2, 600, 300);
        */
        
//        window.setTitle("Kuy rai wa nee");
//        window.setScene(scene1);
//        window.show();
        
        
        /*
        button = new Button();
        button.setText("Click");
        
        button.setOnAction(e -> System.out.println("Hey now brown cow"));
        
        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        
        Scene scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();
        */
    }
    /*
    private void closeProgram(){
        Boolean answer = ConfirmBox.display("Hey!", "Sure u wanna exit?");
        if(answer) window.close();
    }
    */

    private boolean isInt(TextField input, String message) {
        try{
            int age = Integer.parseInt(message);
            System.out.println("User is: " + age);
            return true;
        }catch(NumberFormatException e){
            System.out.println("Error: " + message + " is not a number");
            return false;
        }
    }

    private void handleOption(CheckBox box1, CheckBox box2) {
        String message = "";
        if(box1.isSelected())
            message += "Bacon";
        if(box2.isSelected())
            message += "Tuna";
        
        System.out.println(message);
    } 
//
//    //To get the value of the select Item
//    private void getChoice(ChoiceBox<String> choiceBox) {
//        String food = choiceBox.getValue();
//        System.out.println(food);
//    }

    private void printSong(ComboBox<String> comboBox) {
        
        comboBox.getItems().add(comboBox.getValue());
        
        System.out.println(comboBox.getValue());
    }

    private void buttonClicked(ListView<String> list) {
        String message = "";
        ObservableList<String> movies;
        movies = list.getSelectionModel().getSelectedItems();
    
        for(String movie: movies){
            message += movie + "\n";
        }
        
        System.out.println(message);
    }

    public TreeItem<String> makeBranch(String title, TreeItem<String> parent) {
        TreeItem<String> item = new TreeItem<>(title);
        item.setExpanded(true);
        parent.getChildren().add(item);
        return item;
    }
    
    //Get All of Product
    public ObservableList<Product> getProduct(){
        ObservableList<Product> products = FXCollections.observableArrayList();
        products.add(new Product("FirstSong", 150.00, 10));
        products.add(new Product("2Song", 200.00, 20));
        products.add(new Product("3Song", 300.00, 30));
        products.add(new Product("4Song", 400.00, 40));
        products.add(new Product("5Song", 500.00, 50));
        return products;
    }

    public void addButtonClicked() {
        Product product = new Product(); //Blank
        product.setName(nameInput.getText());
        product.setPrice(Double.parseDouble(priceInput.getText())); // try catch error validation
        product.setQuantity(Integer.parseInt(quantityInput.getText()));
        table.getItems().add(product); // Insert new value to table
        nameInput.clear(); //Clear input...
        priceInput.clear();
        quantityInput.clear();
    }
    
    //Delete button clicked
    public void deleteButtonClicked(){
        ObservableList<Product> productSelected, allProducts;
        allProducts = table.getItems();
        productSelected = table.getSelectionModel().getSelectedItems();
        
        productSelected.forEach(allProducts::remove);
    }
}
