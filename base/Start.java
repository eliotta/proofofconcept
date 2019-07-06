import java.util.*;


//called by initial class 'start'.

/*  
Create a random string of numbers, from 1 to 52
The random string of numbers will be used to  pull objects, randomely. 
Call a class that returns a two dimensional array. The first dim is an index in order. 
The second dim are the same quantity of numbers, but in random order. 
The inputs are the number of digits. The output is a 2 dim array. 
*/

public class Start
{
    public static void main(String[] args)
    {
        start();
    }

    public static void start()
    {
        System.out.println("Hello World");
//        System.out.println(" The following takes a group of numbers, here from 1 to 52, and randomizes them, ");
//        System.out.println(" spitting them out into an array ");   . . .


        ArrayList<Integer> arrlio = new ArrayList<Integer>(50);
        arrlio = numshuffle(50);


        displayshuffle(arrlio);


        loader ldr = new loader();
        ldr.creating();

        table3obj single_obj = new table3obj();
        table3array single_pull = new table3array();
        int randobj = arrlio.get(0);

        table3list pullbynum = ldr.gettablelist();
        single_obj = pullbynum.t3r(randobj);


        int abc = single_obj.gettheid("17");
        String defg = single_obj.getDescription();
        String hijk = single_obj.getHashkey();

        System.out.println(" abc " + abc);
        System.out.println(" defg " + defg );
        System.out.println(" hijk " + hijk );



        //- create temporary one dim array for five items.
        table3array retrndpull = new table3array();

        //- pull five
        //public table3obj t3r(Integer intKey);
        table3list t3l = new table3list();
        t3l = ldr.gettablelist();
        table3array t3ar = new table3array();

        buildpopulateclockarray bpca = new buildpopulateclockarray();
        //table3array create_a_pull(int lstep, int lnumofpulls, table3list lpullbynum, ArrayList<Integer> arli);

        t3ar = bpca.create_a_pull(0,5,t3l,arrlio);

        //-set up empty clockarray
        clockarray fullclock = new clockarray();

        //-set up top row array.
        clockarray toprow = new clockarray();
        clockarrayclass[][] trow = new clockarrayclass[0][4];
        trow =  toprow.initclockarray(1,5);


        //-copy pulls into top row array.






      int xx = 0;
      for(int i = 0; i < 5; i++)
      {
      clockarrayclass tcac = new clockarrayclass();
      trow[xx][i].cval





      }








        //-fill in location an other pieces of top row array.
        //-fill in each column, based on the top row, which is the top of each column
        //-the positions of the clock objects in the clockarray don't change,
        //-what the clockobjects in the clockarray represents is what changes.
        //-A function decides which clock object is to be populated.
        //-the new clock cell is populated with the new values
        //-There are five possible pulls. A function chooses which of the five it will be, for each new clock object

    }

    public static void displayshuffle(ArrayList<Integer> arr)
    {
        int bc = 0;
        int al = (arr.size() - 1);
        for(int ig=0;ig<=al;ig++)
        {
            bc = arr.get(ig);
            //         System.out.println("This is BC and ig " + bc + " " + ig );
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
    };

}


