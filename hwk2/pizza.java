package hwk2;
import java.util.ArrayList;
import java.util.List;

public class pizza {
    private String chain;
    private String size;
    private List<String> toppings;

    public pizza(String chain, String size){
        this.chain = chain;
        this.size = size;
        this.toppings = new ArrayList<>();
}
}
