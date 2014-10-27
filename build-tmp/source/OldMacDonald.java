import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class OldMacDonald extends PApplet {

//your variable declarations here

	public void setup() 
{     
    Farm c = new Farm();   
    c.animalSounds(); 
}

//declare classes and the interface below
class Farm  
{     
  private Animal[] aBunchOfAnimals = new Animal[3];    
  public Farm()     
  {       
    aBunchOfAnimals[0] = new Cow("cow","moo");           
    aBunchOfAnimals[1] = new Chick("chick","cluck");       
    aBunchOfAnimals[2] = new Pig("pig","oink");    
  }         
  public void animalSounds()    
  {       
    for (int nI=0; nI < aBunchOfAnimals.length; nI++)      
    {          
     System.out.println( aBunchOfAnimals[nI].getType() + " goes " + aBunchOfAnimals[nI].getSound());       
    }    
  } 
}


interface Animal 
  {    
    public String getSound();        
    public String getType(); 
  } 

  class Cow implements Animal 
{     
  private String myType;     
  private String mySound;      
  public Cow(String type, String sound)    
  {         
     myType = type;         
     mySound = sound;     
  }     
  // public Cow()    
  // {         
  //    myType = "Cow";         
  //    mySound = "Moo!";     
  // }      
  public String getSound(){return mySound;}     
  public String getType(){return myType;} 
}

  class Pig implements Animal 
{     
  private String myType;     
  private String mySound;      
  public Pig(String type, String sound)    
  {         
     myType = "pig";         
     mySound = "Oink!";     
  }         
  public String getSound(){return mySound;}     
  public String getType(){return myType;} 
}
    class Chick implements Animal 
{     
  private String myType;     
  private String mySound;   
  
  public Chick(String type, String sound)    
  {         
     
     if (Math.random()>0.5f)
    {
      myType = "Chick";   
       mySound = "Cluck!";  
    } else
    {
       myType = "Chick";   
      mySound = "Cheep!";  
     }
  }  
   
  

  public String getSound(){return mySound;}     
  public String getType(){return myType;} 
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OldMacDonald" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
