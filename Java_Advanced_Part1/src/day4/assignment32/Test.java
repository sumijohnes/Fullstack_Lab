package day4.assignment32;

class Simple{}  
interface My{}  
  
class Test{  
 public static void main(String args[]){  
  try{  
   Class c=Class.forName("Simple");  
   System.out.println(c.isInterface());  
     
   Class c2=Class.forName("My");  
   System.out.println(c2.isInterface());  
    
  }catch(Exception e){System.out.println(e);}  
  
 }  
}  