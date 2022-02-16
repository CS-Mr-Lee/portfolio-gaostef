/**
* Name: Stefany
* Date: Feb 14, 2022
* description: This programs read from a .json file and outputs the champion with the highest hp and
* the lowest armor.
*/

import java.io.*; 
public class ChampionFilterCode {
	public static void main(String[] arg) {
		
		//declaring variables
		String championHighesthHp = "";
	    double hp;
	    double highestHp = 0;
	    double armor = 0;
	    double lowestArmor = 1000000 ;
	    String championLowestArmor = "";
	    	
	    try {
	    	//file readers 
	        File f = new File("lol.JSON"); 
	        FileReader fr = new FileReader(f);
	        BufferedReader br = new BufferedReader(fr);         
	        String line; 
	        String champion = ""; 
	        
	        //reading file
	        while ((line = br.readLine()) != null) {     
	        	if (line.contains("\"name\""))  {
	        		champion = line.substring(line.indexOf(": \"") + 3,line.length()-2); //getting the name only
	            }
	        	if (line.contains("\"hp\"")) {
	            	hp = Double.parseDouble(line.substring(line.indexOf(":") + 2, line.length()-1)); //getting the hp and turning it into a double
	            	//if hp is higher than the current highest hp, replace it
	            	if (hp > highestHp) {  
	            		highestHp = hp; 
	                    championHighesthHp = champion;
	            	}
	        	}
	            if (line.contains("\"armor\"")) {
	            	armor = Double.parseDouble(line.substring(line.indexOf(":") + 2, line.length()-1)); //getting the armor and turning it into a double
	            	//if armor is higher than the current highest armor, replace it
	            	if (armor < lowestArmor) {
	            		lowestArmor = armor;
	            		championLowestArmor = champion;
	            	}
	            }
	        }
	        br.close();
	        fr.close();
	        
	    	} catch (IOException e) {
	    		System.out.println("something went wrong :( ");
	    	}
	    //printing the output
	    System.out.println(championHighesthHp + " has the highest hp: " + highestHp + " hp");
	    System.out.println(championLowestArmor + " has the lowest armor: " + lowestArmor+ " armor");
	}
}
