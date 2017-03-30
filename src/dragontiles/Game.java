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
    
    public Game (String name, Map map) {
        this.name = name;
        curMap = map;
        maps.add(map);
    }
}
