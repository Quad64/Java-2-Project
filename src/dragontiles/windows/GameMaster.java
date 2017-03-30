package dragontiles.windows;

import dragontiles.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 *
 * @author Carter
 */
public class GameMaster {
    
    private BorderPane root;
    private Stage primaryStage;
    private Game game;
    private Map map;
    
    Button btn_file = new Button("File");
    Button btn_save = new Button("Save");
    Button btn_newMap = new Button("New Map");
    Button btn_loadMap = new Button("Load Map");
    Button btn_playerScreen = new Button("Show Player Screen");
    Button btn_settings = new Button("Settings");
    
    /**
     *
     * @param game
     * @param root
     * @param primaryStage
     */
    public GameMaster(Game game, BorderPane root, Stage primaryStage) {
        this.root = root;
        this.game = game;
        this.root = root;
        this.primaryStage = primaryStage;
        
        root.getChildren().clear();
        topBar();
    }
    
    /**
     *
     */
    public void topBar() {
        ToolBar toolBar = new ToolBar(
                btn_file,
                btn_save,
                btn_newMap,
                btn_loadMap,
                btn_playerScreen,
                btn_settings
        );
        
        root.setTop(toolBar);
    }
    
    /**
     *
     */
    public void map() {
        
    }
    
    /**
     *
     */
    public void sideBar() {
        
    }
    
    class ButtonHandler implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent event) {
            Button buttonClicked = (Button) event.getSource();
            String button = buttonClicked.getText();
        }
        
    }
}
