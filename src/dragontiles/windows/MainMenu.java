package dragontiles.windows;

import dragontiles.*;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Carter
 */
public class MainMenu {

    private DragonTiles root;
    private BorderPane mainPane;
    private Stage primaryStage;

    private Label title = new Label("Dragon Tiles");

    // Main screen buttons
    private Button btn_continue = new Button("Continue Game");
    private Button btn_newGame = new Button("New Game");
    private Button btn_loadGame = new Button("Load Game");
    private Button btn_exit = new Button("Exit");
    
    // New game buttons
    private Button btn_submit = new Button("Submit");
    private Button btn_back = new Button("Back");

    private TextField txt_gameName = new TextField();
    private TextField txt_mapName = new TextField();

    /**
     *
     * @param mainPane
     * @param primaryStage
     * @param root
     */
    public MainMenu(BorderPane mainPane, Stage primaryStage, DragonTiles root) {

        this.root = root;
        this.mainPane = mainPane;
        this.primaryStage = primaryStage;

        ButtonHandler buttonHandler = new ButtonHandler();

        btn_continue.setOnAction(buttonHandler);
        btn_newGame.setOnAction(buttonHandler);
        btn_loadGame.setOnAction(buttonHandler);
        btn_exit.setOnAction(buttonHandler);
        btn_submit.setOnAction(buttonHandler);
        btn_back.setOnAction(buttonHandler);

        // Set the buttons to be the same size
        int buttonSize = 100;
        btn_continue.setMaxWidth(buttonSize);
        btn_newGame.setMaxWidth(buttonSize);
        btn_loadGame.setMaxWidth(buttonSize);
        btn_exit.setMaxWidth(buttonSize);
        btn_submit.setMaxWidth(buttonSize);
        btn_back.setMaxWidth(buttonSize);

        // TODO disable btn_continue when there are no save file
        btn_continue.setDisable(true);

        BorderPane.setAlignment(title, Pos.CENTER);
    }

    /**
     * Shows the main menu for the application
     */
    public void title() {
        mainPane.getChildren().clear();

        VBox vbox = new VBox();
        vbox.setAlignment(Pos.CENTER);
        vbox.setSpacing(10);
        vbox.setPadding(new Insets(0, 20, 10, 20));

        vbox.getChildren().addAll(btn_continue, btn_newGame, btn_loadGame, btn_exit);

        mainPane.setTop(title);

        mainPane.setCenter(vbox);
    }

    /**
     * Shows the new game menu where the user enters the paramaters for a game
     * they would like to make
     */
    public void newGame() {
        mainPane.getChildren().clear();

        GridPane inputPane = new GridPane();
        inputPane.setHgap(10);
        inputPane.setVgap(10);
        inputPane.setAlignment(Pos.CENTER);

        inputPane.addRow(0, new Label("Game Name:"), txt_gameName);
        inputPane.addRow(1, new Label("Map Name:"), txt_mapName);
        inputPane.addRow(2, btn_back, btn_submit);

        mainPane.setTop(title);
        mainPane.setCenter(inputPane);
    }

    /**
     * Checks if the input from the user in the New Game screen is valid then
     * calls the Dragon Tiles class to switch to the Game Master screen
     */
    public void createGame() {
        boolean hasGameTitle;
        boolean hasMapTitle;

        // used for displaying errors at the bottom of the screen if the user
        // enteres invalid data
        VBox error = new VBox();
        error.setAlignment(Pos.CENTER);
        error.getChildren().clear();
        
        String name = txt_gameName.getText();
        String mapName = txt_mapName.getText();

        // Check if the user has entered a name for the game
        if (name.isEmpty()) {
            hasGameTitle = false;
            error.getChildren().add(new Label("Please enter a name for the game"));
        } else {
            hasGameTitle = true;
        }

        // Check if the user has entered a name for the starting map
        if (mapName.isEmpty()) {
            hasMapTitle = false;
            error.getChildren().add(new Label("Please enter a name for the map"));
        } else {
            hasMapTitle = true;
        }

        if (hasGameTitle && hasMapTitle) {
            
            // Clear the screen and show a loading message in the event that it
            // is taking a moment for the game to start
            mainPane.getChildren().clear();
            mainPane.setCenter(new Label("Loading..."));
            
            root.newGame(name, mapName);
            
        } else {
            
            mainPane.getChildren().clear();
            newGame();
            mainPane.setBottom(error);
            
        }
    }

    class ButtonHandler implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent event) {

            Button buttonClicked = (Button) event.getSource();
            String button = buttonClicked.getText();

            switch (button) {
                case "Continue Game":
                    // TODO add event for continue button
                    break;
                case "New Game":
                    newGame();
                    break;
                case "Load Game":
                    // TODO add event for load game button
                    break;
                case "Exit":
                    Platform.exit();
                    System.exit(0);
                    break;
                case "Submit":
                    createGame();
                    break;
                case "Back":
                    title();
                    break;
            }

        }
    }
}
