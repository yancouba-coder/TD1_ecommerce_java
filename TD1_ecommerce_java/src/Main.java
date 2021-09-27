
public class Main{
    public static void main(String[] args){
        Product p, p1,p2;
        Customer c1;
        Catalog cat1;
        Basket bask;
        c1= new Customer("DIATTA","Yancouba","3 rue chantecrit"," yancoubadiatta25@gmail.com","0766666638");
        
        p= new Product("chaussure",20);
        //P1= new Produit("Chemise",30);
        //P2=new Produit("Casquette",40);

        cat1 = Catalog.getInstance();
        int a=cat1.adProduct("chaussure",19.99,90);
        int b=cat1.adProduct("Chemise",30.38,70);
        int c=cat1.adProduct("Casquette",40,100);
        
        
        System.out.println("****affichage d'un Produit********** ");
        System.out.println(p);
        
        System.out.println("**********affichage d'un client*********** ");
        System.out.println(c1);
        

        System.out.println("***Affichage du Catalogue*****");
        cat1.affiche();
        
        bask= new Basket(c1,cat1);
        bask.addProduct(2, 5);
        bask.afficheBasket();
        // Modication du prix 
        System.out.println("Essaie de modification du prix ");
        cat1.setPrice2(20, 2);
        cat1.affiche();
        
    }
}
    