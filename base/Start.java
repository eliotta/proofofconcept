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

    public static void start() {
        ArrayList<Integer> arrlio = new ArrayList<Integer>(51);
        arrlio = numshuffle(51);

        displayshuffle(arrlio);

        loader ldr = new loader();
        ldr.creating();

        table3obj single_obj = new table3obj();
        table3array single_pull = new table3array();
        int randobj = arrlio.get(0);

        int getarandom = 0;
        table3list tempbynum = ldr.gettablelist();
        table3obj temp_obj = new table3obj();

        table3list pullbynum = ldr.gettablelist();
        single_obj = pullbynum.t3r(randobj);
        int abc = single_obj.gettheid("17");
        String defg = single_obj.getDescription();
        String hijk = single_obj.getHashkey();

        //- create temporary one dim array for five items.
        table3array retrndpull = new table3array();

        //- pull five
        //public table3obj t3r(Integer intKey);
        table3list t3l = new table3list();
        t3l = ldr.gettablelist();
        table3array t3ar = new table3array();

        buildpopulateclockarray bpca = new buildpopulateclockarray();
        //table3array create_a_pull(int lstep, int lnumofpulls, table3list lpullbynum, ArrayList<Integer> arli);

        t3ar = bpca.create_a_pull(0, 5, t3l, arrlio);

        //-set up empty clockarray
        clockarray fullclock = new clockarray();

        //-set up top row array.
        clockarray toprow = new clockarray();
        clockarrayclass[][] trow = new clockarrayclass[0][4];

        //-copy pulls into top row array.
        int getarrandom = 0;
        clockvalue temp_cval = new clockvalue();
        clocklocation temp_pos = new clocklocation();

        clockarray[][] t_array;
        t_array = new clockarray[1][4];
        clockarrayclass t_carray = new clockarrayclass();
        clockarrayclass t_carray2 = new clockarrayclass();

        clockarray fcarray = new clockarray();
        clockarrayclass fclass[][] = new clockarrayclass[1][4];
        fclass = fcarray.initclockarray(1, 4);

        //load clockvalue and clocklocation into clockarrayclass
        Clockarry[][] cllarry = new Clockarry[1][4];
        Clockarry[] cldavid = new Clockarry[5]; 
      
       for(int i = 0; i < 5; i++)
       {
         cldavid[i] = new Clockarry();
       } 
         cldavid = bpca.init_a_single_arry(5);
       
         Clockarry[] charlie = new Clockarry[5]; 
         charlie = bpca.init_a_single_arry(5);
         charlie = bpca.clockarry_pull(0, 5, t3l, arrlio); 
     
      for(int i = 0;  i < 5;  i++)
      {
         int ab = cldavid[i].getcYpos();
         System.out.println(" ssssss  " + ab);  
       }
      
        Clockarry[][]  fivebyfive = new Clockarry[5][5];
        fivebyfive =   bpca.init_a_twodim_arry(5, 5);
      
      //load up the top array
        fivebyfive = bpca.rowload(fivebyfive, charlie, 5, 5, 0);


         
        for(int i = 0; i < 5; i++)
        {
           String a =    fivebyfive[0][i].getCvId();
           String b =    fivebyfive[0][i].getCvForeignID();
           String c =    fivebyfive[0][i].getCvDescription();
           String d =    fivebyfive[0][i].getCvHashkey();
           int e =    fivebyfive[0][i].getcXpos();
           int f =    fivebyfive[0][i].getcYpos();
           System.out.println(" a " + a + " b " + b + " c " + c + " d " + d + " e " + e );
          
          //put the top row in a separate array. get a function to add one to each 
          //value, then load the next row into five by five. 
          
          

        }
      
      
    }


    //-fill in each column, based on the top row, which is the top of each column
    //-the positions of the clock objects in the clockarray don't change,
    //-what the clockobjects in the clockarray represents is what changes.
    //-A function decides which clock object is to be populated.
    //-the new clock cell is populated with the new values
    //-There are five possible pulls. A function chooses which of the five it will be, for each new clock object

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
    };

}


