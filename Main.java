public class Main{
    public static void main(String[] args){
        Product P, P1,P2;
        Customer C1;
        Catalog Cat1;
        Basket bask;
        C1= new Customer("DIATTA","Yancouba","3 rue chantecrit"," yancoubadiatta25@gmail.com","0766666638");
        
        P= new Product("chaussure",20);
        //P1= new Produit("Chemise",30);
        //P2=new Produit("Casquette",40);

        Cat1 = Catalog.getInstance();
        int a=Cat1.adProduct("chaussure",19.99,90);
        int b=Cat1.adProduct("Chemise",30.38,70);
        int c=Cat1.adProduct("Casquette",40,100);
        
        System.out.println("affichage d'un objet ");
        System.out.println(P);
        
        System.out.println("affichage d'un client ");
        System.out.println(C1);
        

        System.out.println("***Affichage du Catalogue*****");
        Cat1.affiche();
        
        bask= new Basket(C1,Cat1);
        bask.addProduct(Cat1,2, 5);
        bask.afficheBasket();
        
        
    }
}
    