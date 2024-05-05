package hwk7;

import java.io.Serializable;

public class Color implements Serializable {

    private String color;
    public Color(String color){
        this.color = color;
    }

    public String printColor()
    {
        return "Color: "+this.color;
    }

    public String getColor()
    {
        return this.color;
    }
}
