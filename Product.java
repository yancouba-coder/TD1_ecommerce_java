public class Product{
    private String name;
    private double price;
    private int id;
    public static int actId;


    Product(){
        this.name="no_name";
        this.price=0;
        this.id=actId;
        actId++;
    }

    Product(String _name, double _price){
        // super() appel le constructeur de la classe héritée
        this.name=_name;
        this.price=_price;
        this.id=actId;
        actId++;

    }
    public int getId(){
        return this.id;
    }
    public String getName(){
        return name;

    }
    public double getPrice(){
        return price;
    }
    
    
    public String toString(){
        
        return "[ product : "+this.name+ ", Price : " +this.price + "]";

    }
}