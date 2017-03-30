package dragontiles;

/**
 *
 * @author Carter
 */
public class Token {
    
    String name;
    String type;
    // TODO add image
    
    /**
     * 
     * @param name
     * @param type 
     */
    public Token(String name, String type){
        this.name = name;
        this.type = type;
    }

    /**
     * 
     * @return 
     */
    public String getName(){ return name; }
    /**
     * 
     * @param name 
     */
    public void setName(String name){ this.name = name; }
    
    /**
     * 
     * @return 
     */
    public String getType(){ return type; }
    /**
     * 
     * @param type 
     */
    public void setType(String type){ this.type = type; }
    
}
