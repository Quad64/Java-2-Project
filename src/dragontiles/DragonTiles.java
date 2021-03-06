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
    // Main pane will be passed to each of the screens
    private BorderPane mainPane = new BorderPane();

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

    /**
     * Create a new Game and the starting map
     * @param name
     * @param mapName
     */
    public void newGame(String name, String mapName) {
        String format = String.format("Dragon Tiles: %s - %s", name, mapName);
        primaryStage.setTitle(format);
        Map map = new Map(mapName);
        Game game = new Game(name, map);
        GameMaster gm = new GameMaster(game, mainPane, primaryStage);
        // TODO create a save file for the game
    }
    
    public void loadGame() {
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}
