package dragontiles;

import java.util.ArrayList;

/**
 *
 * @author Carter
 */
public class Game {
    private String name;
    private ArrayList<Map> maps = new ArrayList<>();
    private Map curMap;
    
    /**
     *
     * @param name
     * @param map
     */
    public Game (String name, Map map) {
        this.name = name;
        curMap = map;
        maps.add(map);
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
    
}
