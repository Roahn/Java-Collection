import java.util.*;
class Main{



    public static void main(String args[])
    {
        System.out.println("Hello World");

        Hashtable<Integer,String>ht1 = new Hashtable<>();

        //Insert into hashtable
        ht1.put(1,"one");
        ht1.put(2,"one");
        ht1.put(3,"one");
        System.out.println(ht1);

        //Delete from hashtabel
        ht1.remove(1);
        System.out.println(ht1);

        //Check element is in hashtable
         System.out.println(ht1.containsKey(3));    ///Seach by key
         System.out.println(ht1.contains("two"));      //Search by value


         //Get value from hashtable using key
         System.out.println(ht1.get(3));

         



    }
}