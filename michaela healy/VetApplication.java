
public class VetApplication
{
  public static void main(String [] args)
    {
        int num; //delcaint a variable called num of type int
        int option = 0;
        boolean isItEmpty;
        
        
        System.out.print("Enter the maximum number of animals that can be registered in the system: ");
        num = EasyScanner.nextInt();
       
        Vet animalList = new Vet (num); //set size of the array
        System.out.println();
        
        do
        {
           System.out.println();
           System.out.println("Vet System ");
           System.out.println("1. Add an Animal ");
           System.out.println("2. Remove an Animal ");
           System.out.println("3. Check if Vet System is empty ");
           System.out.println("4. Check if Vet System is full ");
           System.out.println("5. Add Additionial Pet Detials ");
           System.out.println("6. Animal Detials ");
           System.out.println("7. Update Animal Length of Time in System ");
           System.out.println("8. Exit System ");
           
           System.out.println();
           System.out.println();
           System.out.print("Please enter choice [1-8 only]: ");
           option = EasyScanner.nextInt(); //takes in the users choice
           System.out.println();
        
           while( option <0 || option >8)
           {
               System.out.print("Invalid entry, please enter [1-8 only]: ");
               option = EasyScanner.nextInt();
               System.out.println();
              
           }
           
        
           switch(option) //switch statement to process the users choice
           {
               case 1:
               addAnAnimal(animalList);
               //sending in animal list array so the methods know where to look
               
               break;
               
               case 2:
               removeAnAnimal(animalList);
               
               break;
               
               case 3:
               checkIfEmpty(animalList);
               
               
               break;
               
               case 4:
               checkIfFull(animalList);
               
               break;
               
               case 5:
               searchAndAddPet(animalList);
               
               
               break;
               
               case 6:
               listAll(animalList);
               
               
               
               break;
               
               case 7:
               lenTime(animalList);
               
               break;
               
               case 8:
               
               break;
               
               
            }
        }while(option !=8);//process choice until the user presses 8 and exits the system
        System.out.print("Thank you for using the Vet system");
    }
    
    private static void addAnAnimal(Vet animalList) 
    {
        String animalId;
        String animalType;
        String ownerName;
        String animalName;
        int animalAge;
        boolean vaccinations;
        int yearRegistered;
        int lenTimeClient;
        boolean didItAdd;
        
        System.out.print("Enter animal id: ");
        animalId = EasyScanner.nextString();
        
        System.out.print("Enter animal type : ");
        animalType = EasyScanner.nextString();
        
        System.out.print("Enter animal name : ");
        animalName = EasyScanner.nextString();
        
        System.out.print("Enter owner name : ");
        ownerName = EasyScanner.nextString();
        
        System.out.print("Enter animal age : ");
        animalAge = EasyScanner.nextInt();
        if(animalAge <0 || animalAge>30)
        {
            System.out.print("Please enter a valid age (0-30) : ");
            animalAge = EasyScanner.nextInt();
        }
        
        System.out.print("Enter year animal registered : ");
        yearRegistered = EasyScanner.nextInt();
        if(yearRegistered <1987 || yearRegistered > 2017)
        {
            System.out.print("Please enter a valid year (before 2017 and after 1987): ");
            yearRegistered = EasyScanner.nextInt();
        }
        
        Animal animal = new Animal(animalId ,animalType,animalName, ownerName, animalAge, yearRegistered);
        didItAdd = animalList.add(animal);
        System.out.println();
        if(didItAdd == true)
        {
            System.out.print("New Animal Added ");
            System.out.println();
        }
        else
        {
            System.out.print("Can not add new animal. This system is full ");
            System.out.println();
        }
    
            
        
        System.out.println();
        
    }
    
    private static void removeAnAnimal(Vet animalList)
    {
        String animalId;
        boolean didItDelete;
        System.out.print("Enter Animal id to remove: ");
        animalId = EasyScanner.nextString();
        
        didItDelete = animalList.delete(animalId);
        
        if(didItDelete == true)
          {   
             System.out.println("Animal with id number " +(animalId)+ " is removed from the system"); 
          }
            
          else if(didItDelete == false)
          { 
              System.out.println("Cannot delete animal from the system -  no such animal with id" +(animalId) +"exist in the system");  
          }
    }
        
        
        
    
     
    private static void checkIfEmpty( Vet animalList)
    {
        boolean isItEmpty;
        isItEmpty = animalList.isEmpty();
        if(isItEmpty == true)
               {
                   System.out.println("The vet system contains no animals ");
                   System.out.println();
               }
               else
               {
                   System.out.println("The vet system is not empty");
                   System.out.println();
               }
    
    }
    
    private static void checkIfFull(Vet animalList)
    {
        boolean isItFull;
        isItFull = animalList.isFull();
        
        if(isItFull == true)
        {
            System.out.print("The vet system is Full and cannot accept new animals ");
            System.out.println();
        }
        else
        {
            System.out.print("The vet system is not full - you can add new animals to the system ");
            System.out.println();
        }
    }

    private static void  searchAndAddPet(Vet animalList)
	{
		String animalId;
		char vacc;
		Animal tempAnimal; //animal object called tempAnimal
		
		
	
		System.out.print("Enter Animal Id");
		animalId = EasyScanner.nextString();
		tempAnimal = animalList.getItem(animalId);
		
		System.out.print("Enter if vaccinations have been received (y or n): ");
		vacc = EasyScanner.nextChar();
		

		if(tempAnimal ==null)
		{
		   System.out.println("No animal with this animal id was found");
		}
		else
		{
			if(tempAnimal.getVaccinations()==true)
			{	
				System.out.println("Animal details updated");
				tempAnimal.setVaccinations(false);
			}
			else
			{
				tempAnimal.setVaccinations(true);
				System.out.println("Animal details updated");
			}
		}
				
		
		

		

}
	



	   




    private static void listAll(Vet animalList)
    {
        String allDetails;
        char choice;
        int option;
        String animalId;
        
        allDetails = animalList.list();
        do
        {
         System.out.println("Vet System ");
           System.out.println("1. Add an Animal ");
           System.out.println("2. Remove an Animal ");
           System.out.println("3. Check if Vet System is empty ");
           System.out.println("4. Check if Vet System is full ");
           System.out.println("5. Add Additionial Pet Detials ");
           System.out.println("6. Animal Detials ");
		   System.out.println("\t a. Display Details of an Animal ");
           System.out.println("\t b. Display All Animal Details ");
           System.out.println("\t c. Display Oldest Animal ");
           System.out.println("\t d. Display Youngest Animal ");
           System.out.println("7. Update Animal Length of Time in System ");
           System.out.println("8. Exit System ");
		   System.out.println();
		   System.out.print("Enter choice [a-d] "  );
           choice = EasyScanner.nextChar();
        
            switch(choice)
            {
                case 'a': option6a(animalList);
                break;

                case 'b': option6b(animalList);
                
                break;
                
                case 'c': option6c(animalList);
          
                break;
                
                
                case'd': option6d(animalList);
                
                
                break;
                
				default: System.out.print("Invalid entry please enter [a-d] " );
         }
      }       while(choice <'a' || choice >'d');


  }

		private static void option6a(Vet animalList)
		{
			String animalId;
			Animal anm1;

			System.out.print("Enter animal id: ");
			 animalId = EasyScanner.nextString();

			anm1 = animalList.getItem(animalId);

			if(anm1 == null) //null meand empty/not found
			{ 
				System.out.print("No such animal id");
			}
			else
			{
				System.out.println(anm1.toString());
		}
}

private static void option6b(Vet animalList)
{
		String allDetails;
		allDetails = animalList.allDetails();

		if(allDetails.equals("") == true)
      	{
           System.out.println("no animals in the system");
        }
        
        else
        {
            System.out.println(allDetails);
        }
}

private static void option6c(Vet animalList)
{
		Animal tempAnimal;
		tempAnimal = animalList.findOldestAnimal();
		System.out.println(tempAnimal.getAnimalName() +" with animal id " + tempAnimal.getAnimalId()+
		" is the oldest animal " +(tempAnimal.getAnimalAge())+" years ");
}
		
private static void option6d(Vet animalList)
{
		Animal tempAnimal;
		tempAnimal = animalList.findYoungestAnimal();
		System.out.println(tempAnimal.getAnimalName() +" with animal id " + tempAnimal.getAnimalId()+
		" is the youngest animal " +(tempAnimal.getAnimalAge())+" years ");
}




 private static void lenTime(Vet animalList)
 {
     String details;
	 details = animalList.upDatelenOfTime();
	 System.out.println(details);
}


}
        
    
        
        
        
        
        
        
        
        
        
    
    

    
    
