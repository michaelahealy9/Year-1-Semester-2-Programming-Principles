//comment all code//
//blueprint class it won't run anything//
public class Animal
{
    private String animalId; //declaring an attribute/instance variable  animalId of type string//
    private String animalType;
    private String ownerName;
    private String animalName;
    private int animalAge;
    private boolean vaccinations; //boolean denotes true or false//
    private int yearRegistered = 0 ; //zero until changed
    private static int lenTimeClient = 0; //length of time with vets//
    //constructor same name as class and updates some of the attribues passsed as a paameter//
    public Animal (String animalIdIn, String animalTypeIn, String animalNameIn, String ownerNameIn, int animalAgeIn, int yearRegisteredIn)
    {
        animalId = animalIdIn; //setting the attribues to what ever the user sends in through the constructor//
        animalType = animalTypeIn;
        animalName = animalNameIn;
		ownerName = ownerNameIn;
        animalAge = animalAgeIn;
        yearRegistered = yearRegisteredIn;
        
    }
    
    public String getAnimalId()
    {
        return animalId;
    }
        
    public void setAnimalId(String animalIdIn)
    {
        animalId = animalIdIn;
    }
    
    public String getAnimalType()
    {
        return animalType;
    }
    
    public void setAnimalType(String animalTypeIn)
    {
        animalType = animalTypeIn;
    }
    
    public String getAnimalName()
    {
        return animalName;
    }
    
    public void setAnimalName(String animalNameIn)
    {
        animalName = animalNameIn;
    }
    
    public String getOwnerName()
    {
        return ownerName;
    }
    
    public void setOwnerName(String ownerNameIn)
    {
        ownerName = ownerNameIn;
    }

    public int getAnimalAge()
    {
        return animalAge;
    }
    
    public void setAnimalAge(int animalAgeIn)
    {
        animalAge = animalAgeIn;
    }
    
    public boolean getVaccinations()
    {
        return vaccinations;
    }
    
    public void setVaccinations(boolean vaccinationsIn)
    {
        vaccinations = false;
    }

    public int getYearRegistered()
    {
        return yearRegistered;
    }
    
    public  void setYearRegistered(int yearRegisteredIn)
    {
        yearRegistered = yearRegisteredIn;
    }
    
    public int getLenTimeClient()
    {
        return lenTimeClient;
    }
    
    public static void setLenTimeClient(int lenTimeClientIn) 
    //static so its now a class attriubute and if a change is made to 1 object it is made 
	//to all ojects
    {
        lenTimeClient = lenTimeClient + lenTimeClientIn;
    }

	public String toString()
    {
        String details;
        
        details = " Animal Id: " + animalId + "\n Animal Type: " +animalType 
        + "\n Animal Age: "+ animalAge +  "\n Owner Name: " + ownerName  + "\n Length of time client: " +lenTimeClient
		+ " \nYear Registered: " +yearRegistered + "\n Vaccinations " +vaccinations ;
        
        return details;
        
        
    }

}
        
        
    