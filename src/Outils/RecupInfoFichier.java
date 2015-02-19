package Outils;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


//by Thomas Davin

public class RecupInfoFichier {

	public static String chercheDsFichier(BufferedReader input, String motCle) throws IOException{
		String res="";
		
		try{
			
			input.reset();
			while((res=input.readLine())!=null && !res.equals(motCle) ){
				
			}
			
			res=input.readLine();
			
		}catch(IOException e){e.printStackTrace();}
		
		return res;
		
	} 
	
	
	
	public static List<String> recupListDsFichier(BufferedReader input, String motCle)throws IOException{
		
		List<String> res=new ArrayList<String>();
		
		String cle="";
		
		try{
			input.reset();
			while((cle=input.readLine())!=null && !cle.equals(motCle)){
				
			}
			
			while((cle=input.readLine())!=null && !cle.equals("f"+motCle) /*&& cle.length()==0*/){
			
				res.add(cle);
			}
			
		}catch(IOException e){e.printStackTrace();}
		
				
		return res;
		
		
		
	}
	
	
public static String recupStringDsFichier(BufferedReader input, String motCle) throws IOException{
		
		StringBuffer res=new StringBuffer();
		
		String cle="";
		
		try{
			input.reset();
			while((cle=input.readLine())!=null && !cle.equals(motCle)){
				
			}
			
			while((cle=input.readLine())!=null && !cle.equals("f"+motCle) /*&& cle.length()==0*/){
			
				res.append(cle);
			}
			
		}catch(IOException e){e.printStackTrace();}
		
				
		return res.toString();
		
		
		
	}
	
	
	
	
}
