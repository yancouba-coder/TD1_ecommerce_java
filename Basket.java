public class Basket {
    private int comProducts[];
    private final int tailPanier;
    private Customer basketOwner;
    Basket( Customer C, Catalog C2){
    	this.tailPanier= C2.getN();
    	this.comProducts=new int[this.tailPanier];
    	this.basketOwner =new Customer();
    	this.basketOwner= C ;
    	
    	
    }
    public void afficheBasket() {

        // A améliorer car le mieux c'est d'afficher le nom des produits par leur id !
        // Ceci se fait en ayant un catalog unique accessible partout dans le projet
    	System.out.println("Affiche du panier : ");
    	
    	System.out.print("[");
        for(int i=0; i< this.tailPanier;i++) {
        	System.out.print(comProducts[i]);
            // Produit P = Catalog.getproduitbyID(i);
            //System.out.println( P)
        }
        System.out.print("]");
    }
    // Tenir en compte le fait qu'on ajoute dans le panier que des produits disponible dans le catalogue
    
    public void addProduct(Catalog C,int _id, int quant) {
        //On verifie d'abord si la quantite commandee est disponible
        // si oui on ajoute dans le panier
        if(quant < C.tabQuantProduit[_id]){
            Produit P = C.getProductById(_id);
        this.comProducts[_id]=quant;

        C.tabQuantProduit[_id]=C.tabQuantProduit[_id] - quant;
    	this.comProducts[_id]=quant;

        }
        else{
            System.out.println(" L'article est en rupture de stock");
        }
    	
    	
    	
    }

}