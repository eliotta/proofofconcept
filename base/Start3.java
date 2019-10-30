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

        //load up the top array
        fivebyfive = bpca.rowload(fivebyfive, asinglepull, 5, 5, 0);

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
            }
        }


        //setting the orbit flag for the top row of the array.
        for(i = 0; i <= 4; i++)
        {
            fivebyfive[0][i].setOrbitflag('Y');
        }


        //gather the top row into a horizontal single array. Sort.
        //read from the second position to the right.
        //if any cell is equal to the previous cell, there is a duplicate.
        Integer [] checkdupes = new Integer[5];
        Integer [] checkdupes2 = new Integer[5];
        Integer [] checkdupes3 = new Integer[5];


        ArrayList<Clockarry> clocklist = new ArrayList<Clockarry>();
        ArrayList<Integer[]> bucket = new ArrayList<Integer[]>();
        for(i = 0; i < 5; i++ )
        {
          tempi = fivebyfive[0][i].getCvId();
          itempi = Integer.parseInt(tempi);
          checkdupes[i] = itempi;
          checkdupes2[i] = itempi;
        }

        checkdupes[3] = 8;
        checkdupes2[3] = 8;

        Arrays.sort(checkdupes);
        for(i = 1; i < 5; i++ )
        {
         if(checkdupes[i] == checkdupes[i-1])
         {
             System.out.println("duplicate duplicate");
         }
         else
         {
             System.out.println("write to outputarray");
         }

        }
        //adds the 5 1 dim array that was Not sorted
        bucket.add(checkdupes2);

        //note: two variables pointing to the same value, and the two values act like pointers to an address.
        //in java, its called a reference.
        checkdupes3 = bucket.get(0);


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


        //create a list of clockarrys. list is called clocklist.
        //add new clockarrys called listed to it



        //testing to see if arraylist loads from arrays and can be fetched.
        Clockarry listed = new Clockarry();
        for(i = 0; i < 5; i++)
        {
            clocklist.add(fivebyfive[0][i]);
            listed = clocklist.get(i);
            String johnson = listed.getCvId();
            System.out.println("this is Johnson " + johnson + " " + i );
        }

            //when pulling the values, choose from string character integer. Then, direct
            //to the right function.
            //clocklist.   . . .

        /*
        * do a single full house one, with 2 equals, followed by
        * three equals. get that to work.

          function.
          pulling_class_attr(int strngcharintstrngtoint)
          {

            This is the rule.
            Every variable in every object is a  string.
            If something is an int, it gets converted to a string before being returned.
            There is a variable in each class that is the following
            String stype = "char, char, string, int, int"


            strngcharintstrngtoint
            switch statement depending on whether string or in or object.
            note: everthing gets stored as a string array, that way, possible to have on
            one type of input array into equalfunc.





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


