
package testgenrics;


public class Testgenrics {

    
    public static void main(String[] args) { 
       NewClass ahmed =   new NewClass  (new Integer(66)); 
          NewClass ahmed2 =   new NewClass  (new String("ahmed")); 
       NewClass ahmed3 =   new NewClass  (new java.util.Scanner(System.in));
        NewClass<Object> ahmed4 =   new NewClass<Object>  (new String("ahmed"));
           NewClass<Object> ahmed5 =   new NewClass<Object>  (new Integer(66));  
       NewClass<Integer> ahmed6 = new NewClass<Integer>(77);
        int v =ahmed6.return_obj();
        System.out.println(v);
         Integer [] numes = new Integer [] {3,4,5};
  bounded<Integer> ahmed7  = new bounded<Integer> (numes);  
   Double [] nume= new Double [] {3.0,4.0,5.0};
  bounded<Double> ahmed8  = new bounded<Double> (nume);
 System.out.println (ahmed7.samme_averagw_or_not(ahmed8));
   bounded<Integer> ahmed11  = new bounded<Integer> (numes);  
 ahmed8.valu_of(ahmed7, ahmed11, v);
System.out.println (methode.mth(v, numes));
//counstrate as = new counstrate (new Integer(56));
//as.coungstrate(ahmed8);
testclass a1 = new testclass (ahmed8);
a1.obj= ahmed7;
a1.returnobj();
 NewClass<Integer>  fromsuper = new NewClass<Integer>(89);
 System.out.println(fromsuper.obj);

subofnewclass<Double> fromsub = new subofnewclass<Double> (33.44);
System.out.println(fromsub.obj);
System.out.println(fromsub.obj2);
System.out.println(fromsub.return_obj());
if(fromsub instanceof NewClass)
   System.out.println ("true");
   // NewClass <Integer> one = fromsub ; error
   NewClass <Double> one = fromsub ; 
   System .out. println(one.obj);
   ((subofnewclass)one).obj2 = 67.787;
   Object o= new Object();
   System.out.println(((Integer)o).getClass().getName());
   
   
}
    }