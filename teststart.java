import java.util.*;


//called by initial class 'start'.

public class teststart
{


    public teststart()
    {
        System.out.println("within teststart constructor");


    }




    public void regular_function()
    {
        System.out.println("within teststart regular_function");
        System.out.println("this is the first line of the code");
        theinput inp = new theinput();
        inp.inputhnd();
        HashMap<String, table3obj> t3mapa = new HashMap<String, table3obj>();

        table3obj atable = new table3obj();
        atable.setForeignid("test");
        String a = atable.getForeignid();

        loader ldr = new loader();
        maintenance mnt = new maintenance();
        ldr.creating();


        table3array t3a = new table3array();
        t3mapa = t3a.gettable3map();

        ldr.gettable3map();
        this.call_randload();

    }

    public void call_randload()
    {
        //randload loads table 3.
        randload randLoad = new randload();

        int steptrack = 0;

        int totalpulls = 5;

        randLoad.rndld();
        System.out.println("  within call randload   ");

        //this is going to be the start of the randomized pull function

        table3array single_pull = new table3array();

        //creating a loaded table 3
        loader table3ldra = new loader();
        table3ldra.creating();


        System.out.println("steptrack " + steptrack + " totalpulls " + totalpulls );
        single_pull = randLoad.rnd_placeholder(steptrack, totalpulls, table3ldra);
        System.out.println("seeking stepplace in teststart");
        steptrack = randLoad.getStepplace();

    }

}
