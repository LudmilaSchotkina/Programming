package materials;

import java.util.ArrayList;
import java.lang.String;
import java.util.Random;


public class Material{
	public Material(){
		property = new ArrayList<String>();
	}	
	
	public void addProperty(String newProperty){
		property.add(newProperty);
	}
	
	public void deleteProperty(String deletingProperty){
		int possition = getPropertyPossition(deletingProperty);
	
		if(possition != -1 )		
			property.remove(possition);
	}

	public boolean hasProperty(String desiredProperty){
		return property.contains(desiredProperty);
	}

	private int getPropertyPossition(String desiredProperty){
		return property.indexOf(desiredProperty);
	}
	
	public String[] getProperties()
    	{
		String[] output = new String[property.size()];
		property.toArray(output);
		return output;
	}

    public Material getRandomParameter(){
        Random rand = new Random();

        int i=1+rand.nextInt();

        Material material = new Material();
        switch(i%2){
            case 0 :
                material = new Metall();
                break;
            case 1:
                material = new Wood();
                break;
        }
        return material;
    }

	protected ArrayList property; 
}


