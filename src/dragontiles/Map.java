package dragontiles;

/**
 *
 * @author Carter
 */
public class Map {
    
    private String name;
    
    // TODO create some sort of array(s) to hold all of the tokens and tiles
    
    /**
     *
     * @param name
     */
    public Map(String name) {
        this.name = name;
    }
    
    /**
     *
     * @return
     */
    public String getName() { return name; }
    
    /**
     *
     * @param name
     */
    public void setName(String name) { this.name = name; }
    
    /**
     * Load map data from save file
     * @param mapName name of map to load
     */
    public void loadMap(String mapName){
        // TODO write code to load data from a saved file
    }
    
    /**
     * Save map data to a save file
     */
    public void saveMap(){
        // TODO write code to save data to a save file
    }
    
}
