package hwk7;

import java.util.HashMap;

public class AttributeFactory {
    private static AttributeFactory attrFactory;
    private  HashMap<String, Font> fontMap;
    private  HashMap<String, Color> colorMap;
    private  HashMap<Integer, Size> sizeMap;

    public AttributeFactory()
    {
        this.fontMap = new HashMap<>();
        this.sizeMap = new HashMap<>();
        this.colorMap = new HashMap<>();
    }

    public static AttributeFactory initFactory(){
        if(attrFactory==null)
        {
            attrFactory = new AttributeFactory();
        }
        return attrFactory;
    }
    public  Size getSize(int size)
    {
        if(!sizeMap.containsKey(size)){
            sizeMap.put(size, new Size(size));
        }
        return sizeMap.get(size);
    }


    public  Color getColor(String color){
        if(!colorMap.containsKey(color)){
            colorMap.put(color, new Color(color));
        }
        return colorMap.get(color);
    }

    public  Font getFont(String font){ 
        if(!fontMap.containsKey(font)){
            fontMap.put(font, new Font(font));
        }
        return fontMap.get(font);
    }
}

