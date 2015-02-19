package builderAgent;

import java.util.List;


//by Thomas Davin

public class Pompier implements StructurePompier {
	
	//implémentation de la structure Pompier
	//permet la création d'un objet pompier  à partir d'un fichier avec le même numero d'agent
	
	private int id;
	
	private boolean directeur;
	
	private String nom;
	
	private String prenom;
	
	private List<String> UV;
	
	private List<String> accepte;
	
	private List<String> attente;
	
	private List<String> enCours;
	
	private List<String> refuse;
	
	private List<String> gestion;
		
	@Override
	public void setId(int id) {
				
		this.id=id;
		
	}
	@Override
	public int getId(){return id;}
	
	@Override
	public void setDirecteur(String directeur) {
		
		if(directeur.equals("oui")){this.directeur=true;}
		else{this.directeur=false;}
		
	}
	
	@Override
	public boolean getDirecteur(){return directeur;}
	

	@Override
	public void setNom(String nom) {
		// TODO Auto-generated method stub
		this.nom=nom;
	}
	
	@Override
	public String getNom(){return nom;}

	@Override
	public void setPrenom(String prenom) {
		// TODO Auto-generated method stub
		this.prenom=prenom;
	}

	@Override
	public String getPrenom(){return prenom;}
	
	@Override
	public void setUV(List<String> UV) {
		
		this.UV=UV;
	}
	
	@Override
	public List<String> getUV(){return UV;}
	
	@Override
	public void setEnCours(List<String> enCours) {
		// TODO Auto-generated method stub
		
		this.enCours=enCours;
		
	}
	
	@Override
	public List<String> getEnCours(){return enCours;}

	@Override
	public void setAccepte(List<String> accepte) {
		// TODO Auto-generated method stub
		
		this.accepte=accepte;
		
	}
	
	@Override
	public List<String> getAccepte(){return accepte;}

	@Override
	public void setAttente(List<String> attente) {
		// TODO Auto-generated method stub
		
		this.attente=attente;
		
	}
	
	@Override
	public List<String> getAttente(){return attente;}

	@Override
	public void setRefuse(List<String> refuse) {
		// TODO Auto-generated method stub
		
		this.refuse=refuse;
		
	}
	
	@Override
	public List<String> getRefuse(){return refuse;}

	@Override
	public void setGestion(List<String> gestion) {
		// TODO Auto-generated method stub
		
		this.gestion=gestion;
		
	}
	
	@Override
	public List<String> getGestion(){return gestion;}

	
}
