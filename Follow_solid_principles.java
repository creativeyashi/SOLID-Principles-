public interface Class     
{  
   public void getHeight();    
} 
public interface Teacher   
{  
   public void getTeacherName();   
}
public interface Subject  
{  
   public void subjectname();   
}  
  

public class Student implements Class 
{  
    private double height;  
    private double weight;  
    public void getHeight(double h)   
    {    
       return this.getHeight();     
    }  	
    public void setHeight(double h)   
    {  
       this.setHeight(h);  
       this.setWeight(w);  
    }    
}
public class TeacherName implements Teacher{
	
   public void getTeacherName(String name)   
   {
    name=this.name;	
   } 
	
}
public class SubjectName implements Subject 
{  
   public void SubjectName(Subject subject)     
   {  
    this.subject =subject;
   }   
}  
