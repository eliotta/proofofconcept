import java.util.*;

public class maintenance {


    private table3array cards = new table3array();
    private table3list cardlist = new table3list();


    HashMap<String, table3obj> task;

    public maintenance()
    {

    }


    public void maintain()
    {
        task = cards.getsortacasting(cards);
        createmaintainedtable3list (task);
    }



    private table3array gethashfromloader(table3array hashcard)
    {
        loader ldr = new loader();
        hashcard = ldr.gettable3map();
        return  hashcard;
    }


    private table3list createmaintainedtable3list (HashMap<String, table3obj> task1)
    {

        System.out.println(". . . . . . .is this within table3list ");

        int iii = 0;
        int iiii = 0;

        /*allocat for each object in cardlist                  */
        for (table3obj value : task1.values()) {

            cardlist.puttable3map(iii, value);
            iii++;
        }

        for (table3obj value : task1.values()) {
            /*  swapping objects' places to be put in the right place  */
            iiii = value.gettheid(value.id);
            if(iiii < 51)
                cardlist.settable3map(iiii, value);
        }



        return cardlist;
    }


}
