public class Catalog{
    private Product tabProduits[];
    public  int tabQuantProduit[];
    private static final int NBPROD=5;
    public static Catalog instance=null;

    Catalog(){
        
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
        Produit P1= new Product(__name,__price); // creation de l'objet 
        int id1=P1.getId();

        this.tabProduits[id1]= P1; // ajout de l'objet dans le tableau
        this.tabQuantProduit[id1]=quantity;

        return id1;
    }
    public Produit getProductById(int key){
        return tabProduits[key];
    }
    public int[] getTabQuantProduits(){
        return this.tabQuantProduit;
    }
    public int getN(){
        return NBPROD;
    }
    public void affiche(){
        for( int i=0; i< NBPROD;i++){
            if(tabProduits[i] != null){
                System.out.println("[ product : "+this.tabProduits[i].getName()+ ", Price : " +this.tabProduits[i].getPrice() + "]");

            }
            
        }
        

    }

}