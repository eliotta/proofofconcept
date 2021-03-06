

import java.util.*;


@SuppressWarnings("Duplicates")
public class Start3
{
    public static void main(String[] args)
    {
        start3();
    }

    public static void start3()
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
        buildpopulateclockarray bpca = new buildpopulateclockarray();

        Clockarry[] asinglepull = bpca.clockarry_pull(0, 5, t3l, arrlio);

        //Create initialize and populate the empty five by five clock array.
        Clockarry[][]  fivebyfive =   bpca.init_a_twodim_arry(5, 5);
        Clockarry[][]  template_fivebyfive =   bpca.init_a_twodim_arry(5, 5);



        

        //load up the top array
        fivebyfive = bpca.rowload(fivebyfive, asinglepull, 5, 5, 0);
        template_fivebyfive = bpca.rowload(template_fivebyfive, asinglepull, 5, 5, 0);


        String a, b, c, d, e;
        int max = 4;
        Clockarry tempcac = new Clockarry();
        String tempi;
        int itempi;



        //j is the row and moves up and down, i is the column and moves from side to side.
        //the CvId is the local index
        int i, j;
        String starting = fivebyfive[0][0].getCvId();
        int istart = Integer.parseInt(starting);
        for(j = 1; j < 5; j++)
        {
            for (i = 0; i <= max; i++)
            {
                tempi = fivebyfive[(j-1)][i].getCvId();
                itempi = Integer.parseInt(tempi);
                if (itempi > (max)) {
                    itempi = istart;
                } else {
                    itempi++;
                }
                tempcac = asinglepull[(itempi - 1)];
                fivebyfive[j][i] = tempcac;
                template_fivebyfive[j][i] = tempcac;
            }
        }

           /*
            String getdesA = fivebyfive[0][2].getCvDescription();
            String getdesB = template_fivebyfive[0][2].getCvDescription();
            System.out.println(" should be the same  " +  getdesA + " " + getdesB + "  ");   
            tempcac.setCvDescription("cvDescripn");
            fivebyfive[0][2] = tempcac;
            getdesA = fivebyfive[0][2].getCvDescription();
            getdesB = template_fivebyfive[0][2].getCvDescription();
            System.out.println(" should be different  " +  getdesA + " " + getdesB + "  "); 
            */


        //setting the orbit flag for the top row of the array.
          for(i = 0; i <= 4; i++)
        {
            tempcac = new Clockarry();
            tempcac.retwash(fivebyfive[0][0]);
            tempcac.setOrbitflag('R');
     //         fivebyfive[0][i].setOrbitflag('Y');
            fivebyfive[0][0] = tempcac;
        }

    

          tempcac.retwash(fivebyfive[0][0]);
          tempcac.setOrbitflag('B');
          tempcac.setCvDescription("tempcac description");
          tempcac.setCvForeignID("cv foreign id");
          fivebyfive[0][0] = tempcac;

        

        char NY = fivebyfive[0][0].getOrbitflag();
        char nn = template_fivebyfive[0][0].getOrbitflag();
        String cvfchanged = template_fivebyfive[0][0].getCvForeignID();
        String cvfchanged2 = fivebyfive[0][0].getCvForeignID();
        System.out.println("  should not be the same  " + NY + " " + nn );
        System.out.println("  should not be the same  " + cvfchanged + " " + cvfchanged2 );
        



        //gather the top row into a horizontal single array. Sort.
        Integer [] checkdupes = new Integer[5];
        Integer [] checkdupes2 = new Integer[5];
        Integer [] checkdupes3 = new Integer[5];
        //added file


        ArrayList<Clockarry> clocklist = new ArrayList<Clockarry>();
        ArrayList<Integer[]> bucket = new ArrayList<Integer[]>();
        for(i = 0; i < 5; i++ )
        {
          tempi = fivebyfive[0][i].getCvId();
          itempi = Integer.parseInt(tempi);
          checkdupes[i] = itempi;
          checkdupes2[i] = itempi;
        }

        //checkdupes[3] = 2;
        //checkdupes2[3] = 2;

        Arrays.sort(checkdupes);
        //read from the second position to the right.
        //if any cell is equal to the previous cell, there is a duplicate.

        char flipadup = 'n';

        for(i = 1; i < 5; i++ )
        {
         if(checkdupes[i] == checkdupes[i-1])
         {
             System.out.println("duplicate duplicate ");
             flipadup = 'y';
         }
        }
        //adds the 5 1 dim array that was Not sorted, if there are no dupes.
        //this needs to be looped. And a process moving the top line like a clock needs to be added.
        //and then the pattern check needs to be incorporated. s
        if(flipadup == 'n')
           bucket.add(checkdupes2);
        else {
            System.out.println("duplicate duplicate");
        };




        //note: two variables pointing to the same value, and the two values act like pointers to an address.
        //in java, its called a reference.
        //checkdupes3 = bucket.get(0);



        //create a list of clockarrys. list is called clocklist.
        //add new clockarrys called listed to it



            //when pulling the values, choose from string character integer. Then, direct
            //to the right function.
            //clocklist.   . . .

  









        /*


        //testing to see if arraylist loads from arrays and can be fetched.
        Clockarry listed = new Clockarry();
        for(i = 0; i < 5; i++)
        {
            clocklist.add(fivebyfive[0][i]);
            listed = clocklist.get(i);
            String johnson = listed.getCvId();
            System.out.println("this is Johnson " + johnson + " " + i );
        }

        int ab1 = checkdupes3[0];
        int ab2 = checkdupes3[1];
        int ab3 = checkdupes3[2];
        int ab4 = checkdupes3[3];
        int ab5 = checkdupes3[4];


        String abs1 = Integer.toString(ab1);
        String abs2 = Integer.toString(ab2);
        String abs3 = Integer.toString(ab3);
        String abs4 = Integer.toString(ab4);
        String abs5 = Integer.toString(ab5);
        System.out.println("this was third pos " + abs1 + " "  + abs2 + " " +  abs3 + " " +  abs4 + " " + abs5 + " ");

        */


        /*
        * do a single full house one, with 2 equals, followed by
        * three equals. get that to work.

          function.
          pulling_class_attr(int strngcharintstrngtoint)
          {

            This is the rule.
            Every variable in every object is a  string.
            If something is an int, it gets converted to a string before being returned.

            the class objects, (which in this case are representatives of cards), contain an arraylist of
            three dimensional arrays. The first value in each three dimensional array is the name of the
            object, the next dimension is the  type. The final dimension is the string itself.
            An example of a 3d array is something[][][]. The three dimensions are type, name, and value.

            Within the object is a three dimensional string array of function names, and the return type
            for the function. The third dimension is the value of the return of the function, in string form.
            In future versions, the values may be populated outside the object, but in this version, the
            value is manually entered and populated by hand withing the object. The user is presented with
            a fully functional arraylist of three dimensional arrays.

            function to collect the different like objects from the different classes. For example.
            collect the suites from the five cards. or the card numbers from the five cards.

            function to compare the five numbers from the five cards.
            In this case, the fhouse has two functions that look for equal values, but at different points at the
            five object array. Once at the first point, an once at the third point.

            If the array passes the fhouse test, the array is tallied, with the tally amount added to an array along
            with the five objects, in order.  This array is then deposited in an arraylist. The highest tally is presented.
            Later, there will be most likely tally above some acceptable minimum, etc, depending on what the
            goal is.



            Mon 11 4. Again.
            Create a 2 dim array in clockarry. Also a 3 dim array.
            The two dim array is created by hand in the clockarry object. Its the return type. And the
            other dim is the object number. It was the object name, but the number works as a key
            to a value. How. And why cant the name be used as a key? it can be. The program asks for
            cardsuite, and the cardsuite 3 dim array gets called. Getting from cardsuite to the actual
            array is done how? A keyed Hashmap?

            public HashMap<String, table3obj> gettable3map()
            {   
                //t3map is a hashmap 
                return t3map;
            }



            public void puttable3map(String idKey, table3obj tt3) {  t3map.put(idKey, tt3);  }

             nullzero.setId("0");
             nullzero.setForeignid("0");
             nullzero.setDescription("Nullzero ");
             nullzero.setHashkey("nulllzero");
             nullzero.setPulled('N');
             cards.puttable3map("nullzero", nullzero);


            Also, whats the process?

            The program is reading a string, and supplying an int, char or string depending on what the
            function calls for. Maybe its not a function name. Maybe its an attribute, like Suite,
            or Color.


            Tally function.

         }



        //seq / of seq means for example second of two functions for full house.
        function.
          equalfunc(clockarry singleclockarray, int start, int end, int seq, int ofseq)
         {


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


