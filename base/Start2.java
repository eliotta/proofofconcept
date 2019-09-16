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
         Clockarry[] asinglepull = new Clockarry[5]; 
         asinglepull = bpca.init_a_single_arry(5);
         asinglepull = bpca.clockarry_pull(0, 5, t3l, arrlio);  
             
         //Create initialize and populate the empty five by five clock array.  
         Clockarry[][]  fivebyfive = new Clockarry[5][5];
         fivebyfive =   bpca.init_a_twodim_arry(5, 5);
      
         //load up the top array
         fivebyfive = bpca.rowload(fivebyfive, asinglepull, 5, 5, 0);
         
       
       //this for loop just displays whats in the top row. 
       for(int i = 0; i < 5; i++)
        {
           String a =    fivebyfive[0][i].getCvId();
           String b =    fivebyfive[0][i].getCvForeignID();
           String c =    fivebyfive[0][i].getCvDescription();
           String d =    fivebyfive[0][i].getCvHashkey();
           int e =    fivebyfive[0][i].getcXpos();
           int f =    fivebyfive[0][i].getcYpos();
           System.out.println(" a " + a + " b " + b + " c " + c + " d " + d + " e " + e );
        }
      
      
      //fivebyfive is created at this point and initialized.
      //top row is created using asinglepull/rowload
      //read the top row, use a function to create the row below. 
      //read the next row, use the next row to create the row below that. 
      //repeat till all the rows are created. 
      //package everthing into a load function. 




        /*
      int max = 5;
      Clockarry tempcac = new Clockarry();
      tempcac = fivebyfive[0][0];
      String tempi = tempcac.getCvId();
      int itempi = Integer.parseInt(tempi);
      if (itempi >= max){
          itempi = 1;
      } else
      {
          itempi++;
      }
      tempcac = asinglepull[itempi];
      fivebyfive[0][0] = tempcac;



*/


    //loop thru the current row, reading and processing ids, running them thru a function,
    //and replacing the objects.



        int max = 4;
        Clockarry tempcac = new Clockarry();
        String tempi;
        int itempi;
        for(int i = 0; i < max; i++)
        {
          tempcac = fivebyfive[0][i];
          tempi = tempcac.getCvId();
          itempi = Integer.parseInt(tempi);
          if (itempi  >= (max)) {
                itempi = 1;
          } else
          {
              itempi++;
          }

            tempcac = asinglepull[itempi];
            fivebyfive[0][i] = tempcac;
        }
      
      
      
      
      
      
      
     
              
           
           
           
          
               
      
      
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
