package ir.ac.kntu.graphics;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.SceneAntialiasing;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.util.Objects;
import java.util.Optional;

public class Editor extends Application {
    private static Editor INSTANCE;
    private Scene scene;
    private Stage stage;

    public static Editor getInstance() {
        return Optional.of(INSTANCE).get();
    }

    public Scene getScene() {
        return scene;
    }

    public Stage getStage() {
        return stage;
    }

    @Override
    public void init() throws Exception {
        Platform.runLater(this::showSplash);
        AnchorPane root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/view/editor.fxml")));
        scene = new Scene(root, 800, 600, false, SceneAntialiasing.BALANCED);
        INSTANCE = this;
    }

    private void showSplash() {
        AnchorPane root;
        try {
            root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/view/splash.fxml")));
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }
        Scene scene = new Scene(root, root.getPrefWidth(), root.getPrefHeight(), false, SceneAntialiasing.BALANCED);
        stage = new Stage();
        stage.setScene(scene);
        stage.initStyle(StageStyle.UNDECORATED);
        stage.initModality(Modality.NONE);
        stage.show();
        Platform.runLater(() -> {
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            stage.close();
        });
    }

    @Override
    public void start(Stage stage) throws InterruptedException {
        this.stage.setOnHiding(e->{
            System.out.println("Closing Splash..");
            this.stage = stage;
            stage.setScene(scene);
            stage.initStyle(StageStyle.DECORATED);
            stage.setResizable(false);
            stage.setScene(scene);
            stage.setTitle("ALMAS IDE with Integrated Compiler");
            stage.show();
//        stage.setAlwaysOnTop(true);
            stage.setOnCloseRequest(status -> System.exit(0));
            stage.getIcons().add(new Image("file://" + Objects.requireNonNull(getClass()
                    .getResource("/images/almas.jfif")).getFile()));
        });

    }


    public static void main(String[] args) {
        launch(args);
    }
}
