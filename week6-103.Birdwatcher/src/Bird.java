public class Bird {
    private String name;
    private String latinName;
    private int observe;
    
    public Bird (String name1, String latinName1, int observe1) {
        this.name = name1;
        this.latinName = latinName1;
        this.observe = observe1;
    }
    
    public Bird (String name1, String latinName1) {
        this(name1, latinName1, 0);
    }
    
    public void setObserve() {
        this.observe += 1;
    }
    
    public int getObserve() {
        return this.observe;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getLatinName() {
        return this.latinName;
    }
    
    public String toString() {
        String obsrve = "" + this.getObserve();
        return this.name + " (" + this.latinName + "): " + obsrve + " observations";
        
    }
    
    
}
