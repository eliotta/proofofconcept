import java.util.*;

public class randload {

    public int stepplace = 0;

    public randload(){

    }


    public void rndld(){
        table3list crdlst = new table3list();

        loader ldrRl = new loader();
        ldrRl.creating();

        crdlst = ldrRl.gettablelist();
        table3obj bebe;
        String bozo;

        Random rand = new Random();

        int  n = rand.nextInt(48) + 2;

        for(int ig = 0; ig <= 46; ig++ )
        {
            n = rand.nextInt(44) + 2;
            System.out.println(" is it being called here, in randload? ");
            bebe = crdlst.t3r(n);
            bozo = bebe.getDescription();
//            System.out.println(" random description of " +  n + " " + bozo);
        }

        ArrayList<Integer> arrli = new ArrayList<Integer>(50);

        int bc = 0;

        for(int ig = 0; ig <= 52; ig++ )
        {
            arrli.add(ig, ig);
        }

        Collections.shuffle(arrli);

        for(int ig = 0; ig <= 52; ig++ )
        {
              bc      = arrli.get(ig);
//            System.out.println("this is bc " + bc + "   "  +  ig);
        }



    }


    public int getStepplace()
    {
        return stepplace;
    }



    public void clock()
    {
        System.out.println(" this is the clock");
        clocklocation Clock = new clocklocation();

    }



    public int getdesc(String aKey)
    {
        int a = 0;
        return a;
    }



    public table3array rnd_placeholder(int step, int number_of_pulls, loader table3ldr)
    {


        stepplace = step;

        // five object table array to be returned.
        table3array single_pull = new table3array();

        //new table 3 list to allow pull by number
        table3list pullbynum = table3ldr.gettablelist();

        //tells loop how many rows in table3
        int count_rows = pullbynum.listsize();

        //list of numbers to be shuffled. pulled numbers will go against loader.
        ArrayList<Integer> table_three_pullno_array = new ArrayList<Integer>(count_rows);

        //numbers being loaded in order, later to be shuffled.
//        for(int ig = 0; ig <= count_rows; ig++ )
        for(int ig = 0; ig < count_rows; ig++ )
        {
            table_three_pullno_array.add(ig, ig);
        }

        //stepplace will only = 0  the first time thru. shuffle if there is less tha
        //five left, or just starting out.
        if (stepplace >= (count_rows - number_of_pulls) | (stepplace == 0))
        {
            //shuffling the numbers. first no in order, second no is shuffled
            Collections.shuffle(table_three_pullno_array);

            //if reshuffling, set step marker back to zero
            stepplace = 1;
        }



        //a single table 3 object, to be loaded into a pull
        table3obj single_obj;

        //retrieve the first  5 shuffled table3 objects, load them into the single_pull array
        int randobj = 0;
        int ig = 0;
        String contostring = "0";


        for(ig = stepplace; ig < (stepplace + number_of_pulls); ig++)
        {
            //get the random key
            randobj = table_three_pullno_array.get(ig);
            System.out.println("before t3r");
            //get single object from the table3 list
            single_obj = pullbynum.t3r(randobj);
            System.out.println("after t3r");
            //add single object to 5 piece array single_pull, to be returned
            contostring = Integer.toString(ig);
            single_pull.puttable3map(contostring,single_obj);
        }

        stepplace = ig;
        return single_pull;
    };

}
