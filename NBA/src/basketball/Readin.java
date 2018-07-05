package basketball;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Readin {
	
	public String[] readFile(String filename){
		
		ArrayList<String> cleaned = new ArrayList<String>();
		
		try(BufferedReader br = new BufferedReader(new FileReader(filename))){
			StringBuilder strb = new StringBuilder();
			String line = br.readLine();
			
			while(line != null){
				strb.append(line);
				strb.append(System.lineSeparator());
			}
		}catch(Exception E){
			
		}
		
		return cleaned;
	}

}
