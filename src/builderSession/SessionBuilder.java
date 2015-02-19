package builderSession;

import java.io.IOException;

//by Thomas Davin

public interface SessionBuilder {

	public void buildDate() throws IOException;
	
	public void buildLieu() throws IOException;
	
	public void buildInfos() throws IOException;
	
	public void buildCandidats() throws IOException;
	
	public void buildAccepte() throws IOException;
	
	public void buildAttente() throws IOException;
	
	public void buildRefuse() throws IOException;
	
	
	public Session getSession();
	
}
