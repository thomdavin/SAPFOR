package builderSession;

import java.io.IOException;

//by Thomas Davin

public class SessionDirector {
	
private SessionBuilder constructSession;
	
	public SessionDirector(SessionBuilder constructSession){
		this.constructSession=constructSession;
	}
	
	public Session getSession(){
		return this.constructSession.getSession();
	}
	
	public void makePompier(){
		
		try{
			this.constructSession.buildDate();
			this.constructSession.buildLieu();
			this.constructSession.buildInfos();
			this.constructSession.buildCandidats();
			this.constructSession.buildAccepte();
			this.constructSession.buildAttente();
			this.constructSession.buildRefuse();
		}catch(IOException e){}
	}
}
