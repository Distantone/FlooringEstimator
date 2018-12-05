package Business;

/**
 *
 * @author Payden Boughton
 */

public class Floor {
    //att
    private double length, width;
    
    //constructor
    public Floor(){
        length = width = 0;
    }
    
    //getters
    public double getLength(){
        return length;
    }
    public double getWidth(){
        return width;
    }
    public double getArea(){
        return length * width;
    }
    
 
    //setters
    public void setLength(double len){
        length = len;
    }
    public void setWidth(double wid){
        width = wid;
    }
    
    @Override
    public String toString(){
            return "Dimensions of room: (length = " + length + ", width = " + width + ")";
        }
    
}

