public class Catalog{
    private Product tabProduits[];
    private  int tabQuantProduit[];
    private static final int NBPROD=5;
    private static Catalog instance=null;

    private Catalog(){
        
        tabProduits= new Product[NBPROD];
        tabQuantProduit=new int[NBPROD];

    }
    public static Catalog getInstance(){
        if(instance==null){
            instance= new Catalog();
            
        }
        return instance;
    }
    public int  adProduct(String __name, double __price , int quantity){
        Product p1= new Product(__name,__price); // creation de l'objet 
        int id1=p1.getId();

        this.tabProduits[id1]= p1; // ajout de l'objet dans le tableau
        this.tabQuantProduit[id1]=quantity;

        return id1;
    }
    public Product getProductById(int key){
        return tabProduits[key];
    }
    public int[] getTabQuantProduits(){
        return this.tabQuantProduit;
    }
    public int getN(){
        return NBPROD;
    }
    public boolean subproduct(int id, int quant){
        if (tabQuantProduit[id] > quant){
            tabQuantProduit[id]=tabQuantProduit[id] -quant;
            return true;
        }
        return false;

    }
    public void affiche(){
        for( int i=0; i< NBPROD;i++){
            if(tabProduits[i] != null){
                System.out.println("[ product : "+this.tabProduits[i].getName()+ ", Price : " +this.tabProduits[i].getPrice() + "]");

            }
            
        }
        

    }

}