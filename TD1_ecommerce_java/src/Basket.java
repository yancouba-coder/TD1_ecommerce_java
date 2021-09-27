
public class Basket {
    private int comProducts[];
    private final int tailPanier;
    private Customer basketOwner;
    private Catalog catalog;

    Basket(Customer c, Catalog c2) {
        this.catalog = c2;
        this.tailPanier = c2.getN();
        this.comProducts = new int[this.tailPanier];
        this.basketOwner = new Customer();
        this.basketOwner = c;

    }

    public void afficheBasket() {

        // A améliorer car le mieux c'est d'afficher le nom des produits par leur id !
        // Ceci se fait en ayant un catalog unique accessible partout dans le projet
        System.out.println("*****Affiche du panier : ");

        System.out.print("[");
        for (int i = 0; i < this.tailPanier; i++) {
            System.out.print(comProducts[i]);
            // Produit P = Catalog.getproduitbyID(i);
            // System.out.println( P)
        }

        System.out.println("]");
        for (int i = 0; i < this.tailPanier; i++) {
            if (this.comProducts[i] != 0) {

                System.out.println("***Ce produit " + this.catalog.getProductById(i) + " est commandé***");
            }

        }

    }
    // Tenir en compte le fait qu'on ajoute dans le panier que des produits
    // disponible dans le catalogue

    public void addProduct(int _id, int quant) {
        // On verifie d'abord si la quantite commandee est disponible
        // si oui on ajoute dans le panier
        boolean possibleAdd = this.catalog.subproduct(_id, quant);
        if (possibleAdd == true) {
            this.comProducts[_id] = quant;
            // attention on doit pouvoir lui dire la quantité disponible
        } else {
            System.out.println("Produit en rupture de stock");
        }

    }

}