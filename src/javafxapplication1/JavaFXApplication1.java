/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 *
 * @author bayub
 */
public class JavaFXApplication1 extends Application {
    
    @Override
    public void start(Stage primaryStage) {

        
       GridPane root = new GridPane();
        root.setAlignment(Pos.CENTER);
        root.setHgap(10);
        root.setVgap(10);
        root.setPadding(new Insets(25, 25, 25, 25));
        
        Label nama = new Label("Nama");
        root.add(nama, 0, 1);
        
        Label namatitikdua = new Label("");
        root.add(namatitikdua, 1, 1);

        TextField namaTextField = new TextField();
        root.add(namaTextField, 2, 1);
        
        Label telepon = new Label("Telepon");
        root.add(telepon, 0, 2);
        
        Label telepontitikdua = new Label("");
        root.add(telepontitikdua, 1, 2);

        TextField teleponTextField = new TextField();
        root.add(teleponTextField, 2, 2);
        
        Label alamat = new Label("Alamat");
        root.add(alamat, 0, 3);
        
        Label alamattitikdua = new Label("");
        root.add(alamattitikdua, 1, 3);

        TextArea alamatTextArea = new TextArea();
        alamatTextArea.setPrefWidth(320);
        root.add(alamatTextArea, 2, 3);
        

        Button btn = new Button("Simpan");
        HBox hbBtn = new HBox(10);
        hbBtn.getChildren().add(btn);
        root.add(hbBtn,0 , 4, 1, 1);
        
        Button btnhps = new Button("Hapus");
        HBox hbBtn2 = new HBox(10);
        hbBtn2.getChildren().add(btnhps);
        root.add(hbBtn2,2 ,4 , 1, 1);
        
   
        
        Scene scene = new Scene(root, 500, 450);
        
        primaryStage.setTitle("Nama Event");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
