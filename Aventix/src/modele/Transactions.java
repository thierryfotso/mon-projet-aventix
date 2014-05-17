package modele;
// Generated 5 mars 2014 00:03:03 by Hibernate Tools 3.6.0


import java.util.Date;

/**
 * Transactions generated by hbm2java
 */
public class Transactions  implements java.io.Serializable 
{

	private static final long serialVersionUID = 1L;
	private int numtransaction;
	private Lecteurcarte lecteurcarte;
    private Carte carte;
    private Float montant;
    private Date dateheuretransaction;
    private boolean traite=false;
    public Transactions() {
    }

	
    public Transactions(int numtransaction, Date dateheuretransaction) {
        this.numtransaction = numtransaction;
        this.dateheuretransaction = dateheuretransaction;
    }
    public Transactions(int numtransaction, Lecteurcarte lecteurcarte, Carte carte, Float montant, Date dateheuretransaction) {
       this.numtransaction = numtransaction;
       this.lecteurcarte = lecteurcarte;
       this.carte = carte;
       this.montant = montant;
       this.dateheuretransaction = dateheuretransaction;
    }
   
    public int getNumtransaction() {
        return this.numtransaction;
    }
    
    public void setNumtransaction(int numtransaction) {
        this.numtransaction = numtransaction;
    }
    public Lecteurcarte getLecteurcarte() {
        return this.lecteurcarte;
    }
    
    public void setLecteurcarte(Lecteurcarte lecteurcarte) {
        this.lecteurcarte = lecteurcarte;
    }
    public Carte getCarte() {
        return this.carte;
    }
    
    public void setCarte(Carte carte) {
        this.carte = carte;
    }
    public Float getMontant() {
        return this.montant;
    }
    
    public void setMontant(Float montant) {
        this.montant = montant;
    }
    public Date getDateheuretransaction() {
        return this.dateheuretransaction;
    }
    
    public void setDateheuretransaction(Date dateheuretransaction) {
        this.dateheuretransaction = dateheuretransaction;
    }

	public boolean isTraite() {
		return traite;
	}


	public void setTraite(boolean traite) {
		this.traite = traite;
	}


	@Override
	public String toString() {
		return "Transactions [numtransaction=" + numtransaction
				+ ", lecteurcarte=" + lecteurcarte.getNumlecteur() +",Etat:"+traite+ ", carte=" + carte
				+ ", montant=" + montant + ", dateheuretransaction="
				+ dateheuretransaction + "]";
	}



}

