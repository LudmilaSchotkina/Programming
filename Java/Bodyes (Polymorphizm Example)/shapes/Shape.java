package shapes;

import java.util.ArrayList;
import java.lang.String;
import java.util.Random;

public class Shape {

	public Shape()
	{
		property = new ArrayList<String>();
	}

	public void addProperty(String newProperty)
	{
	        property.add(newProperty);
	}

	public void deleteProperty(String deletingProperty)
	{
	        int position = getPropertyPosition(deletingProperty);

	        if(position!=-1 )
			property.remove(position);
	}

	public boolean hasProperty(String desiredProperty)
	{
	        return property.contains(desiredProperty);
	}
	
    	private int getPropertyPosition(String desiredProperty)
    	{
        	return property.indexOf(desiredProperty);
    	}

	public String[] getProperties()
	{
		String[] output = new String[property.size()];
		property.toArray(output);
		return output;
    	}

    public Shape getRandomShape(){
        Random rand = new Random();

        int i=rand.nextInt();

        Shape shape = new Sphere();
        switch(i%2){
            case 0 :
                shape = new Sphere();
                break;
            case 1:
                shape = new Triangle();
                break;
        }
        return shape;
    }

    	protected ArrayList property;
}
