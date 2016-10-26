
package testgenrics;

public class methode {
    static<t,v extends t >  boolean mth ( t x , v [] e  )
    {
        if ( java.util.Arrays.binarySearch(e, x)>= 0)
         return true;
        else return false;
        
    }
    public static <y> y er(y o )
    {
        
        return o;
    }
}
