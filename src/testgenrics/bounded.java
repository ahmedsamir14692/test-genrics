
package testgenrics;


public class bounded<t extends Number> { 
    t nums [];
    t obj;
    public bounded ( t [] o){
        
       nums=o ; }
    
    t return_obj(){
        
        
        return obj;
    }
     t array [];
     public double average ( )
     {
         double Sum = 0.0;
         
         for( int i =0 ; i <nums.length; i++)
         {
             Sum=Sum+nums[i].doubleValue(); 
             
         }
         
         return Sum ;
     }
//  public   boolean  samme_averagw_or_not(bounded as){
//      
//      if(average()== as.average())
//      return true;
//      else
//          return false;
//      
//  }
//
//    /**
//     * 
//     * @param as
//     * @return
//     */
    public   boolean  samme_averagw_or_not(bounded<?> as){
      
      if(average()== as.average())
      return true;
      else
          return false;
      
  }
    public   boolean valu_of ( bounded <? extends Integer> as, bounded< ? extends Integer> sa  ,int c   ) 
    {
        try {
        if(as.obj.toString()==sa.obj.toString())
            return true;
        else return false ;}
        
        catch( Exception e){
           
            e.printStackTrace();
            
        }
        finally {
            
            return true ;
        }
        
        
    }
    
}
