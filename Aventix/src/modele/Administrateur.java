package modele;
// Generated 5 mars 2014 00:03:03 by Hibernate Tools 3.6.0



/**
 * Administrateur generated by hbm2java
 */
public class Administrateur  implements java.io.Serializable 
{

	private static final long serialVersionUID = 1L;
	private int numAdmin;
     private String nom;
     private String prenom;
     private String login;
     private String password;
     private String email;

    public Administrateur() {
    }

	
    public Administrateur(int numAdmin) {
        this.numAdmin = numAdmin;
    }
    public Administrateur(int numAdmin, String nom, String prenom, String login, String password, String email) {
       this.numAdmin = numAdmin;
       this.nom = nom;
       this.prenom = prenom;
       this.login = login;
       this.password = password;
       this.email = email;
    }
   
    public int getNumAdmin() {
        return this.numAdmin;
    }
    
    public void setNumAdmin(int numAdmin) {
        this.numAdmin = numAdmin;
    }
    public String getNom() {
        return this.nom;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return this.prenom;
    }
    
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public String getLogin() {
        return this.login;
    }
    
    public void setLogin(String login) {
        this.login = login;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }




}

