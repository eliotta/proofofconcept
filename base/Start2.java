import java.util.*;


//called by initial class 'start'.

/*  
Create a random string of numbers, from 1 to 52
The random string of numbers will be used to  pull objects, randomely. 
Call a class that returns a two dimensional array. The first dim is an index in order. 
The second dim are the same quantity of numbers, but in random order. 
The inputs are the number of digits. The output is a 2 dim array. 
*/

public class Start2
{
    public static void main(String[] args)
    {
        start2();
    }
    
    public static void start2() 
    {
     //- create temporary one dim array for five items.
      table3array retrndpull = new table3array();  
      
       //Create a random order of 51. 
       ArrayList<Integer> arrlio = new ArrayList<Integer>(51);
       arrlio = numshuffle(51);
       displayshuffle(arrlio);
 
       //Populate tagble 3
       loader ldr = new loader();
       ldr.creating();
      
      
       //pull five. create a single array thats a five object pull.  
       table3list t3l = new table3list();
       t3l = ldr.gettablelist();
       table3array t3ar = new table3array();
       buildpopulateclockarray bpca = new buildpopulateclockarray();
       t3ar = bpca.create_a_pull(0, 5, t3l, arrlio);
       
       //display of the five pulled item numbers. 
         Clockarry[] charlie = new Clockarry[5]; 
         charlie = bpca.init_a_single_arry(5);
         charlie = bpca.clockarry_pull(0, 5, t3l, arrlio);  
      
      
      
      
      
      
      
  
      
    }

  
  
  
  
  
  
    public static void displayshuffle(ArrayList<Integer> arr)
    {
        int bc = 0;
        int al = (arr.size() - 1);
        for(int ig=0;ig<=al;ig++)
        {
            bc = arr.get(ig);
        }
    }

    public static ArrayList<Integer> numshuffle(int qtyofshuffle)
    {
        ArrayList<Integer> arrli = new ArrayList<Integer>();
        Random rand = new Random();
        for(int ig=0; ig<=51; ig++)
        {
            arrli.add(ig,ig);
        }

        Collections.shuffle(arrli);
        return arrli;
    }





}
