public interface Class      //violate Interface segregation
{  
   public void getHeight();  
   public void getTeacherName();   
}  


public class Student extends Class 
{  
    private double height;  
    private double weight;  
    public void getHeight(double h)   
    {   
     if (obj instanceof Student)   //violate open close principle
     {  
       return obj.getHeight();  
     }  
     if (obj instanceof Teacher)   
     {  
       return obj.getHeight();  
     }    
    }  
	
   public void setHeight(double h)   
   {  
    this.setHeight(h);  
    this.setWeight(w);  
   }
 
   public void getTeacherName(String name)   //violate Single responsibility
   {
    name=this.name;	
   }  
   
   public Student()  
   {  
     Subject subject = new Subject();  //violate dependency inversion principle 
   }  
}

public class Subject extends Student  
{  
   public void subjectName(string math)     //violate liskov principle
   {  
    super.setHeight(h);  
    super.setWeight(w);  
   }   
}  