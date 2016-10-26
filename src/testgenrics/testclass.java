
package testgenrics;

public class testclass <t extends bounded <Double >> implements intrface <t>  {
    
    t obj ;
    public testclass( t o)
    {
        obj= o;
        }
            
      public t returnobj (){
          
          
          return obj;
           }

    @Override
    public t asd() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public t ads() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    
    
    
    
    
}
