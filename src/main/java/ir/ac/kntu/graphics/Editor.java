package ir.ac.kntu.graphics;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.SceneAntialiasing;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.util.Objects;

public class Editor extends Application {
    private Scene scene;

    @Override
    public void init() throws Exception {
        AnchorPane root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/view/editor.fxml")));
        scene = new Scene(root, 800, 600, false, SceneAntialiasing.BALANCED);
    }

    @Override
    public void start(Stage stage) {
        stage.setScene(scene);
        stage.initStyle(StageStyle.DECORATED);
        stage.setResizable(false);
        stage.setScene(scene);
        stage.setTitle("ALMAS IDE with Integrated Compiler");
        stage.show();
        stage.setAlwaysOnTop(true);
        stage.setOnCloseRequest(status -> System.exit(0));
        stage.getIcons().add(new Image("file://" + getClass()
                .getResource("/images/almas.jfif").getFile()));
    }


    public static void main(String[] args) {
        launch(args);
    }
}
