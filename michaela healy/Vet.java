  
public class Vet
{
    private Animal [] animalList; //creating an array of type animal called animal list//
    //private so it can only be accessed through the methods of the class
	int total; //keep track of the total number of animal objects in the array
    
    public Vet(int sizeIn) //constructor same name as class sending in an int //
    {
        animalList = new Animal[sizeIn]; //holds animal objects
        //setting the size of the array//
        //the array is equal to what ever number the user types in and it can hold that many elements//
        total = 0;
    }

    public int getTotal()
    {
        return total; //return total number  of animal objects in the array
    }
    
    public boolean add (Animal addAnimal) //add an object to the array
    {
       if(isFull() == true) //calls is full method to check if array has space
        {
            return false; //meaning can't add any because there's no space//
        }
        else
        {
        animalList[total] = addAnimal; //add an animal to te array
        total ++; //increase total count by one
        return true; //animal has been added
        }
    }
    
    public boolean delete (String animalId)
    {
        int index;
        index = search(animalId); //find position of the object in the array to delete it
        
        if(index == -999) //if there is no such animal id
        {
            return false;
        }
        
        else
        {
            
            for(int i = index; i < total-1; i++)   //i <= total -2 to move them up 
            {
                animalList[i] = animalList[i+1]; //over writing items by shifting them along in the index
												// there will be two indiences of the last animal object but it will be
												// over written when another animal is added to the array
                
            }
            
            total--;
            
            return true;
            
        }
    }
      
    
    
    public boolean isEmpty()
    {
        if(total == 0)
        {
            return true; //only true when total is 0 (nothing in total)
        }
        else
        {
            return false; // is full cant add any more//
        }
    }
    
    public boolean isFull()
    {
        if (total <animalList.length)
        {
            return false; //meaning it isnt full and there is space//
        }
        else
        {
            return true; //is full there isnt space//
        }
    }
    
    
    
    public Animal findOldestAnimal()
    {
		Animal temp = animalList[0];// temp animal object set to the first element in array
		int oldestAnimal = animalList[0].getAnimalAge(); //oldest age set to first animal in array
		for(int i = 1; i<total; i++) //for loop to go through every animal object in the array
		// first element in thr array is set to the oldest 
		//check to see if animal at index is older than the first
		{
			if(animalList[i].getAnimalAge() > oldestAnimal)
			{
				temp = animalList[i]; //animal list is equal to animal at i
			}
		}
        return temp;
        //temp is returned to main method where it was called from
    }
    
    public Animal findYoungestAnimal()
    {
		Animal temp = animalList[0]; 
		int youngestAnimal = animalList[0].getAnimalAge(); 
		for(int i =1; i<total; i++)
		{
			if(animalList[i].getAnimalAge() <youngestAnimal)
			{
				temp = animalList[i];
			}
			}
		return temp;
	}
        
    
    
    public int search(String animalId) //searches the animal list array to locate a specific animal object
    {
        for(int i = 0; i <total; i++)
        {
            Animal tempAnimal; //object called tempanimal of type animal
            tempAnimal = animalList[i]; //first element in the array
			//find animal at index i
            
            String num;
            num = tempAnimal.getAnimalId();//calling get animal id method on temp animal//
            //get animal id is stored in animal class because object temp animal is of type animal//
            if (num.equals(animalId))///sending in variable animal id
            { //.equals is for comparing two strings
                return i;//returns animal at index i
            }
        }
        return -999;
    }
        
        
    
    
    public String list()
    {
        String tempAnimal = "";
        
        for (int i = 0; i < total; i++)
        {
            tempAnimal = tempAnimal
            +"Animal id : " +animalList[i].getAnimalId() +"\n"
            +"Animal Type : " +animalList[i].getAnimalType() + "\n"
            +"Animal Name : " +animalList[i].getAnimalName() + "\n"
            +"Animal Age : " +animalList[i].getAnimalAge() +"\n"
            +"Owner Name : " +animalList[i].getOwnerName() +"\n"
            +"Length of time client : " +animalList[i].getLenTimeClient() +"\n"
            +"Year Registered : " +animalList[i].getYearRegistered() +"\n"
            +"Animal Vaccinations : " +animalList[i].getVaccinations() 
            +"\n\n";
        }
        return tempAnimal;
    }
        
        
    
    
    public Animal getItem(String animalIdIn) 
	//animal because returning an entire animal object
    {
        int index;
        index = search(animalIdIn);
		//takes animal id and will search the array for it and return the location in the array of the animal
        
        if( index == -999)
        {
            return null;
        }
        else
        {
            return animalList[index];
        } 
    }
   
    public String upDatelenOfTime()
    {
		Animal.setLenTimeClient(1);
		return "All Animal Years in System is Updated";
	}
	
	public String allDetails()
	{
		String allDetails= "";
		for(int i =0; i<total; i++)
		{
			allDetails = allDetails +animalList[i].toString();
		}
		return allDetails;
	}
    
    public boolean addDetails(String animalIdIn, boolean vaccIn)
    {
		String animalId;
		int index;
        index = search(animalIdIn);
        
        if( index == -999)
        {
            return false;
        }
        else
        {
 			animalList[index].setVaccinations(true);
			return true;
        } 
		
    
        
        
        
        
    }
    
    
}