package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.stage.Stage;



public class Main extends Application {
    private Label titleLb,  nameLb, phoneNumberLb, AddressLb, sizeLb, crustLb, ToppingsLb;
    private TextField nameTF, phoneNumberTF,AddressTF;
    private HBox LablesHbox, SizeHbox,crustHbox,titleHbox;
    private VBox rootVBox, inputVBox, sizeRadioVBox, crustRadioVBox;
    @Override
    public void start(Stage primaryStage) throws Exception{


        titleLb=new Label("Order Your Pizz Now!");
        titleLb.setFont(new Font(36));
        titleHbox = new HBox(titleLb);

        nameLb=new Label("Name: ");
        phoneNumberLb=new Label("Phone Number: ");
        AddressLb=new Label("Address: ");

        //inputText Field

        

    }


    public static void main(String[] args) {
        launch(args);
    }
}
