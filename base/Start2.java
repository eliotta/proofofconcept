import java.util.*;


//called by initial class 'start'.

/*  
Create a random string of numbers, from 1 to 52
The random string of numbers will be used to  pull objects, randomely. 
Call a class that returns a two dimensional array. The first dim is an index in order. 
The second dim are the same quantity of numbers, but in random order. 
The inputs are the number of digits. The output is a 2 dim array. 
*/
@SuppressWarnings("Duplicates")
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
         
       
       //this is to displays whats in the top row.



     /*   String a =    fivebyfive[0][0].getCvId();
        String b =    fivebyfive[0][1].getCvId();
        String c =    fivebyfive[0][2].getCvId();
        String d =    fivebyfive[0][3].getCvId();;
        String e =    fivebyfive[0][4].getCvId();;

        System.out.println(" " + a + " " + b + " " + c + " " + d + " " + e );  */
      
      
      //fivebyfive is created at this point and initialized.
      //top row is created using asinglepull/rowload
      //read the top row, use a function to create the row below. 
      //read the next row, use the next row to create the row below that. 
      //repeat till all the rows are created. 
      //package everthing into a load function. 



        //its 1 2 3 4 5
    //loop thru the current row, reading and processing ids, running them thru a function,
    //and replacing the objects.

        String a, b, c, d, e;
        int max = 4;
        Clockarry tempcac = new Clockarry();
        String tempi;
        int itempi;
        for(int i = 0; i < max; i++)
        {
          tempcac = fivebyfive[0][i];
          tempi = tempcac.getCvId();
          itempi = Integer.parseInt(tempi);
    //      if (itempi  >= (max)) {
    //            itempi = 1;
    //      } else
    //      {
    //          itempi++;
    //      }

            tempcac = asinglepull[(itempi - 1)];
            fivebyfive[0][i] = tempcac;
        }
         a =    fivebyfive[0][0].getCvId();
         b =    fivebyfive[0][1].getCvId();
         c =    fivebyfive[0][2].getCvId();
         d =    fivebyfive[0][3].getCvId();
         e =    fivebyfive[0][4].getCvId();
//        System.out.println(" " + a + " " + b + " " + c + " " + d + " " + e );



        int i, j;
        int maxb = 4;
         //loop through again, this time its complete.
        //j is the row and moves up and down, i is the column and moves from side to side.
        for(j = 1; j < 5; j++)
        {
            for (i = 0; i <= max; i++)
            {
                tempcac = fivebyfive[(j-1)][i];
                tempi = tempcac.getCvId();
                itempi = Integer.parseInt(tempi);
                if (itempi > (max)) {
                    itempi = 1;
                } else {
                    itempi++;
                }
                tempcac = asinglepull[(itempi - 1)];
                fivebyfive[j][i] = tempcac;
            }
            a =    fivebyfive[j][0].getCvId();
            b =    fivebyfive[j][1].getCvId();
            c =    fivebyfive[j][2].getCvId();
            d =    fivebyfive[j][3].getCvId();
            e =    fivebyfive[j][4].getCvId();
            System.out.println(" " + a + " " + b + " " + c + " " + d + " " + e );

        }


 /*
      

        //j is the row and moves up and down, i is the column and moves from side to side.
        for(i = 4; i >= 0  ; i--)
        {
            for (j = 1; j < max; j++)
            {
                tempcac = fivebyfive[(j-1)][i];
                tempi = tempcac.getCvId();
                itempi = Integer.parseInt(tempi);
                if (itempi >= (max)) {
                    itempi = 1;
                } else {
                    itempi++;
                }
                tempcac = asinglepull[itempi];
                fivebyfive[j][i] = tempcac;

            }
        }
*/


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
