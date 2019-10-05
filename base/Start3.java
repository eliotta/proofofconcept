import java.util.*;


@SuppressWarnings("Duplicates")
public class Start3
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
        int [] checkdupes = new int[5];
        for(i = 0; i < 5; i++ )
        {
            tempi = fivebyfive[0][i].getCvId();
            itempi = Integer.parseInt(tempi);
            checkdupes[i] = itempi;
        }

        //checkdupes[0] = 5;
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


