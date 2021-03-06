import java.util.*;


/*
*
* This class builds  and populates the clock array.
*
* - function that calls object numbers representing table 3, and loads the
*   the five randomly chosen objects in table 3 into a single array.
*
*   loading the new array into clock loading array.
*
*   The clock loading function also establishes the original location for each of the
*   (five) items. Its sets them at 1,1 1,2 1,3 1,4 1,5.  Also, the temp flag and the use flag
*   are both set to 'N'.
*
*   The clock arrays are built here. First the top array, then the arrays that hang off the
*   top array.
*
*   Once the clock array is built, the top row of the hanging arrays is populated.
*
*   A function is built to "move" the rows and change the pointed clock object, based on the top row.
*   This is a starting position. if no flags are found, the top row is processed.
*
*   A function checks each top row cell's permanent flag. Moving right to left, if a permanent flag is
*   found, the single wheel is reset. The function moves one wheel over to the left, and checks that flag.
*   If that flag is found, the single wheel is reset. If at the far right, the entire process is finished.
*
*   A function checks the cell's temporary flag. If the flag is set to yes, the program turns the wheel, until
*   the flag equals no. If for some reason, the flag never equals no, all the wheels from that left wheel to the
*   right are reset, and the function moves to the next left wheel. If all the temporary flags of all the wheels
*   are set to yes, the process is complete.
*
*   The values of the top row are copied to an output class, and that output class is written to an output array.
*
*   All the temporary values are reset to 'N'.
*
*
*
*
*   verify. process. post process
*
* */

public class buildpopulateclockarray
{
    public buildpopulateclockarray()
    {
     // System.out.println("with buildpopulateclockarray cnstrutr");
        clockarray blah = new clockarray();
        clockarrayclass[][] blahh = new clockarrayclass[5][5];
        clockarrayclass bl = new clockarrayclass();

        pos Pos = new pos();
        Pos.setXpos(5);
        Pos.setYpos(5);
        int Xx = Pos.getXpos();
        int Yy = Pos.getYpos();

        clockvalue lahh = new clockvalue();
        blahh = blah.initclockarray(Xx, Yy);
        bl = blah.getcarray(blahh, 2,2);

        clockarrayclass bll = new clockarrayclass();
        bll.cval = bl.cval;
        String h = bl.getclover();
    }

    public int buildpopclockarray_maincall()
    {
//        System.out.println("within build pop clock array main call");
        //a bookmark for which of the 52 shuffled cards the program is at.  Here, it is at the first card.
        int steptrack = 0;
        int totalpulls = 5;

        // five object table array to be returned.
        table3array single_pull = new table3array();
        System.out.println("after single pull");

        //defines and loads  table3 into a variable.
        loader table3ldr = new loader();
        table3ldr.creating();
        System.out.println("after creating");

        //new table 3 list to allow pull by number
        table3list pullbynum = table3ldr.gettablelist();
        System.out.println("aft pullbynum");

        //array of indexes for table 3. The indexes will be shuffled, so table 3 can be picked at randomly.
        ArrayList<Integer> arrlii = new ArrayList<Integer>();
        System.out.println("after arraylist");

        //creating a loaded table 3. This is what the program will be pulled from.
        loader table3ldra = new loader();
        table3ldra.creating();
        System.out.println("after creating again");

        //start of the randomized pull function
        //how large is the list size that has to be shuffled.
        int count_rows = pullbynum.listsize();

        //create an array of numbers to be randomized and used as an index for table 3. return the arraylist
        arrlii = createandshuffletable3indexes(count_rows);
        System.out.println("arrlii");

        //create a single pull of 5 cards from the first five random objects from table 3.
        single_pull = create_a_pull(steptrack, totalpulls, pullbynum, arrlii);
        System.out.println("after create a pull");

        //Use the results from create_a_pull to build an array of 5 clock objects.
        //Need an X location and a Y location, as well as the values themselves.

        //number of objects in a pull
        int pullsize = single_pull.table3array_size();
        System.out.println("after int pullsize");   
        return 3;
    }

    //returns a shuffled array of numbers, depending on table size.
    public  ArrayList<Integer>  createandshuffletable3indexes(int table3size)
    {
        ArrayList<Integer> arrli = new ArrayList<Integer>();
        int bc = 0;
  
        for(int ig = 0; ig < table3size; ig++ )
        {
            arrli.add(ig, ig);
        }
        Collections.shuffle(arrli);
        return arrli;
    }

    //given an input, number of pulls, and a table, returns an array of pulls.
    public table3array create_a_pull(int lstep, int lnumofpulls, table3list lpullbynum, ArrayList<Integer> arli)
    {
        table3array retrndpull = new table3array();
        table3obj randobj;
        String contostring;
        int i = 0;
        int ii = 0;
        for(i = lstep; i < lnumofpulls; i++ ) 
        {
               //random value pulled from random number array
               int pulled_rand_value = arli.get(i);
               if(pulled_rand_value < 51)
                {
                 randobj = lpullbynum.t3r(pulled_rand_value); 
                  //convert i to a string
                  contostring = Integer.toString(ii);
                  ii++;
                  //add rand object to the 5 object pull
                  //String contostring = Integer.toString(ig);
                  retrndpull.puttable3map(contostring, randobj);
                } else
                {
                  System.out.println("not less than 51");
                }
        }
      
        return retrndpull;
    }//create a pull
  
  
   public Clockarry[] init_a_single_arry(int dim)
   {
     Clockarry[] singleclockarry = new Clockarry[dim]; 
     for(int i = 0; i < dim; i++ )
     {
       singleclockarry[i] = new Clockarry();
       singleclockarry[i].setcYpos(i); 
       singleclockarry[i].setcYloc(i);
     }
       return singleclockarry;
   }
  
   public Clockarry[][] init_a_twodim_arry(int dim1, int dim2)
   {
     Clockarry[][] double_clockarry = new Clockarry[dim1][dim2]; 
     for(int i = 0; i < dim1; i++ )
     {
       for(int j = 0;  j < dim2;  j++)
       {
       double_clockarry[i][j] = new Clockarry();
       
       double_clockarry[i][j].setcXloc(i);
       double_clockarry[i][j].setcYloc(j);  
       }     
     }    
       return double_clockarry;
   }
  
  
  
   public Clockarry[] clockarry_pull(int lstep, int lnumofpulls, table3list lpullbynum, ArrayList<Integer> arli)
    {
        Clockarry[] clockpull = new Clockarry[lnumofpulls]; 
        table3array retrndpull = new table3array();
        
        
        table3obj randobj = new table3obj(); 
        String contostring;
        int i = 0;
        int ii = 0;
        int idindex = 1;
        String sidindex;
        for(i = lstep;  i  <  lnumofpulls;  i++ ) {
            //random value pulled from random number array
            int pulled_rand_value = arli.get(i);
    //        System.out.println("aftr gt " + "in crte a pll, what is i " + i);
    //        System.out.println("rand pulled_rand_value " + pulled_rand_value);
         clockpull[i] = new Clockarry(); 
         if(pulled_rand_value < 51)
          {

           randobj = lpullbynum.t3r(pulled_rand_value); 
            //convert i to a string
            contostring = Integer.toString(ii);
            ii++;
            //add rand object to the 5 object pull
            //String contostring = Integer.toString(ig);
            retrndpull.puttable3map(contostring, randobj);
            String t_id = randobj.getId();
            String t_foreignid = randobj.getForeignid();
            String t_description = randobj.getDescription();
            String t_hashkey = randobj.getHashkey();
            System.out.println("rval " + t_id  +  "." + t_foreignid + "." + t_description + " ");
            System.out.println(" lstep " + lstep + " lnumofpulls " + lnumofpulls );
            sidindex = String.valueOf(idindex);
              clockpull[i].setCvId(sidindex);
              clockpull[i].setCvForeignID(t_foreignid);
              clockpull[i].setCvDescription(t_description);
              clockpull[i].setCvHashkey(t_hashkey);
               clockpull[i].setcXpos(0);
               clockpull[i].setcYpos(i);
               clockpull[i].setcXloc(0);
               clockpull[i].setcYloc(i);
              

               idindex++;
          } else
          {
            System.out.println("not less than 51");
          }
        }
     return clockpull;
    }   


//To populate a particular row of the fivebyfive array. 

  public Clockarry[][] rowload(Clockarry[][] fbf, Clockarry[] pull, int xpos, int ypos, int whichrow)
  {
   Clockarry[][] internalfbf = new Clockarry[xpos][ypos];
    for(int x = 0; x < xpos; x++)
    {
      for(int y = 0; y < ypos; y++) 
      {
        internalfbf[x][y] = new Clockarry(); 	
      }
    }
    internalfbf = fbf;  
    for(int y = 0; y < ypos; y++)
    {
    internalfbf[whichrow][y] = pull[y];
    }
   return internalfbf;
  }

  public Clockarry[][] nextrow(Clockarry[][] fbf, int xpos, int ypos, int whichrow)
  {
    Clockarry[][] internalfbf = new Clockarry[xpos][ypos];
    for(int x = 0; x < xpos; x++)
    {
      for(int y = 0; y < ypos; y++) 
      {
        internalfbf[x][y] = new Clockarry(); 	
      }
    }
    internalfbf = fbf; 
    return internalfbf;
  }
  
  /*
  - take a row from a clockarray and create a temporary array to be processed, and 
    used to create a next row. 
    
  - run the this temporary  
    
    
  - 
    
    
    
    
    
  
  */



}
