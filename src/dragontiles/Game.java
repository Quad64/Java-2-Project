package dragontiles;

import java.util.ArrayList;

/**
 * 
 * @author Carter
 */
public class Game {
    private String name;
    private ArrayList<String> maps = new ArrayList<>();
    private ArrayList<Token> tokens = new ArrayList<>();
    private ArrayList<Tile> tiles = new ArrayList<>();
    private Map curMap;
    
    /**
     *
     * @param name
     * @param map
     */
    public Game (String name, Map map) {
        this.name = name;
        curMap = map;
        maps.add(map.getName());
    }
    
    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }
    
    /**
     *
     * @param name
     */
    public void setName(String name){
        this.name = name;
    }
    
    /**
     * 
     * @return 
     */
    public ArrayList<String> getMaps() { return maps; }
    
    /**
     * 
     * @param mapName 
     */
    public void addMap(String mapName) { maps.add(mapName); }
    
    /**
     * 
     * @param mapName 
     */
    public void loadMap(String mapName) {
        // TODO load map
    }
    
    /**
     * 
     */
    public void saveMap() {
        curMap.saveMap();
    }
    
    /**
     *
     * @return
     */
    public Map getCurMap() {
        return curMap;
    }
    
    /**
     *
     * @param map
     */
    public void setCurMap(Map map) {
        curMap = map;
    }
    
    /**
     * Load the game and map data
     */
    public void loadGame() {
        // TODO load game data and current map
    }
    
}
