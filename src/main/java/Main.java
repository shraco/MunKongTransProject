

import controller.Controller;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {

    Stage window;

    @Override
    public void start(Stage primaryStage) throws Exception{
        window = primaryStage;
        Controller controller = new Controller();
        Parent root = controller.setMainView();
        Scene scene = new Scene(root, 800, 600);

        scene.getStylesheets().add("NewStyle.css");

        window.setTitle("Hello World");
        window.setScene(scene);
        window.show();




    }


    public static void main(String[] args) {
        launch(args);
    }
}
