package hwk1;

public class ship {
    public String name;
    public String year;

    public ship(String name, String year){
        this.name = name;
        this.year = year;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getYear(){
        return year;
    }
    
    public void setYear(String year){
        this.year = year;
    }

    public void printDetails(){
        System.out.println("This boat's name is: "+name+" and it was made in the year: "+year);
    }
}
