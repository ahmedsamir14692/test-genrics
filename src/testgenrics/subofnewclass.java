
package testgenrics;


public class subofnewclass <t> extends  NewClass <t>{
    
    t obj2;
    
    public subofnewclass (t o ){
        super(o);
        obj2=o;
         }
            
    @Override
     t return_obj(){
        
        System.out.println ("from sub");
        return obj;
    }
    
    
}
