package dragontiles;

import dragontiles.windows.*;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 *
 * @author Carter
 */
public class DragonTiles extends Application {

    private Stage primaryStage;
    private BorderPane mainPane = new BorderPane();

    TextField txt_newGame = new TextField();

    @Override
    public void start(Stage primaryStage) {

        this.primaryStage = primaryStage;
        mainPane.setPadding(new Insets(20, 0, 20, 20));

        MainMenu mainMenu = new MainMenu(mainPane, this.primaryStage, this);
        mainMenu.title();

        Scene scene = new Scene(mainPane, 1280, 720);

        this.primaryStage.setTitle("DragonTiles");
        this.primaryStage.setScene(scene);
        this.primaryStage.show();

    }

    public void newGame(String name, String mapName) {
        String format = String.format("Dragon Tiles: %s - %s", name, mapName);
        primaryStage.setTitle(format);
        Map map = new Map(mapName);
        Game game = new Game(name, map);
        GameMaster gm = new GameMaster(game, mainPane, primaryStage);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}
