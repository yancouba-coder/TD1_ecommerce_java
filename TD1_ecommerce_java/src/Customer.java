import java.util.regex.*;

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
        
    	if(isValid(_email)==false){
            System.out.println("Adresse éléctronique invalid");
        }
    	else{
            this.name=_name;
            this.prenom=_prenom;
            this.adresse=_adresse;
            this.email=_email;
            this.tel=_tel;

        }
        

    };
    public static boolean isValid(String email)
    {
    String regex = "^[\\\\w!#$%&'*+/=?`{|}~^-]+(?:\\\\.[\\\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\\\.)+[\\\\a-zA-Z]{2,6}";
    Pattern pattern = Pattern.compile(regex);
    if (email == null)
    return false;
    return pattern.matcher(email).matches();
    }
    public String toString(){
        return "[ name : " + this.name +" , Prenom : "+ this.prenom + 
        ", adresse : "+ this.adresse + ", email : "+ this.email + ", tel : "+ this.tel + "]";
    }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
}
