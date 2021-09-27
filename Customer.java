
public class Customer{
    private String name;
    private String prenom;
    private String adresse;
    private String email;
    private String tel;

    Customer(){
        this.name="no_name";
        this.prenom="no_prenom";
        this.adresse="no_adresse";
        this.email="no_email";
        this.tel="no_tel";

    };
    Customer(String _name,String _prenom,String _adresse,String _email,String _tel){
        if(_email.matches(".+@.+\\.[a-z]+")){
            this.name=_name;
            this.prenom=_prenom;
            this.adresse=_adresse;
            this.email=_email;
            this.tel=_tel;

        }
        else{
            System.out.println("Adresse éléctronique invalid");
        }
        

    };
    
    public String toString(){
        return "[ name : " + this.name +" , Prenom : "+ this.prenom + 
        ", adresse : "+ this.adresse + ", email : "+ this.email + ", tel : "+ this.tel + "]";
    }
}