package sample;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javafx.scene.control.Button;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicBoolean;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
       // Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle(" ChatRoom");

        VBox sceneLayout = new VBox();

        sceneLayout.setPadding(new Insets(20));
        sceneLayout.setSpacing(30);

        Scene scene = new Scene(sceneLayout,500,500);

        HBox nameLayout= new HBox();
        nameLayout.setSpacing(20);

        //TextArea ClientName
        TextArea Txtname= new TextArea();
        Txtname.setMaxHeight(10);
        Txtname.setMaxWidth(200);
        //Label ClientName
        Label Lblname= new Label();
        Lblname.setLabelFor(Txtname);
        Lblname.setText("Nom : ");
        //btnConnect
       Button btnConnect = new Button();
       btnConnect.setText("Connect");

        nameLayout.getChildren().add(Lblname);
        nameLayout.getChildren().add(Txtname);
        nameLayout.getChildren().add(btnConnect);

        sceneLayout.getChildren().add(nameLayout);


        //TextArea Conversation
        TextArea textArea = new TextArea();
        textArea.setMaxHeight(200);
        sceneLayout.getChildren().add(textArea);

        HBox msgLayout = new HBox();
        msgLayout.setSpacing(20);

        //TextArea msg
        TextArea msg = new TextArea();
        msg.setMaxHeight(50);
        msgLayout.getChildren().add(msg);

        //msg.textProperty().addListener(e->textArea.setText(msg.getText()));
        //Button Send
        Button btnClickMe = new Button();
        btnClickMe.setMinSize(50,50);
        btnClickMe.setText("send ");
        try {
        textArea.setText("tryin to Connect");
        Socket soc = new Socket("localhost", 5000);
        textArea.setText("Connected");

        btnClickMe.setOnAction(e -> {

            try {

                DataOutputStream dos = new DataOutputStream(soc.getOutputStream());
                dos.writeUTF(msg.getText());

                msg.setText("");
                DataInputStream dis = new DataInputStream(soc.getInputStream());
                String s= dis.readUTF();
                textArea.setText(textArea.getText() + "\n" + s);

            } catch (Exception ex) {
                ex.printStackTrace();
            }


        });

//           while (true) {

                  // DataInputStream dis = new DataInputStream(soc.getInputStream());
                    //String str = dis.readUTF();
                   //textArea.setText(textArea.getText() + "\n" + str);

       //    }

    } catch (Exception e) {
        e.printStackTrace();
    }
        msgLayout.getChildren().add(btnClickMe);
        sceneLayout.getChildren().add(msgLayout);
        primaryStage.setScene(scene);
        primaryStage.show();

}
        /*
        */

        /*
        primaryStage.onCloseRequestProperty().addListener(e->{
            if(soc.isConnected()) {
                try {
                    soc.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });*/






    public static void main(String[] args) {
        launch(args);
    }
}
