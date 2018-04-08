package fr.openclassrooms.ville
public class Ville{
	private String nom;
	private String pays;
	private double population;
	private boolean estCapitale;

	public Ville(String nom,String pays,double population){
		this.nom=nom;
		this.pays=pays;
		this.population=population;
		this.estCapitale=false;
	}
	public String getNom(String nom){
		return this.nom;
	}
	public void setNom(String nom){
		this.nom=nom;
	}



}
