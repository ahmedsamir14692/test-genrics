
package testgenrics;


public class NewClass <t>{
    
    t obj;
    public NewClass ( t o){
        
        obj = o; }
    
    t return_obj(){
        
        
        return obj;
    }
    void showType() {
System.out.println("Type of T is " +
obj.getClass().getName());
}
     t array [];
     public double average (t para [] )
     {
         double Sum = 0.0;
         
         for( t h: para)
         {
            // Sum=Sum+ h ; compile error
             
         }
         
         return Sum ;
     }
}
