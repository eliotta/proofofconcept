import java.util.*;



public class theinput {
    public HashMap<String, String> userinputmap;


    public static void theinput() {

    }


    public static void inputhnd() {

        HashMap<String, String> userinputmap = new HashMap<String, String>();

        //capture input into separate strings.


            //the below code will work if commented out

//        String avalue = scanInObjects("this is about a group of . . . : ");
//        String bbvalue = scanInObjects("Each action is called a : ");
//        String ccvalue = scanInObjects("the group of pulls is a: ");
//        String addvalue = scanInObjects("Enter Five Objects, Separated by Commas: ");
        System.out.println(" at class input, called from regular function in teststart,  at the input, values are cards, pull, and and 1 2 3 4 5  ");

        String avalue =  "cards";
        String bbvalue =  "pull";
        String ccvalue =  "hand";
        String addvalue = "1,2,3,4,5";


        //move the captured input from string to hash.
        userinputmap.put("group", avalue);
        userinputmap.put("action", bbvalue);
        userinputmap.put("process", ccvalue);

        //transfer the five input objects from string to char array, so the program
        //can verify that instructions were followed.
        char[] chrfrstr = charconv(addvalue);

        //counts the number of separate objects.
        int objectnumber = howManyObjects(chrfrstr);

        while(objectnumber != 5)
        {
            System.out.print("This needs 5 objects, not " + objectnumber + ".  ");
            addvalue = scanInObjects("Enter Five Objects, Separated by Commas: ");
            chrfrstr = charconv(addvalue);
            objectnumber = howManyObjects(chrfrstr);
        }

        int ab = readtest(userinputmap);

        table3obj t3o = new table3obj();

        table3array t3a = new table3array();
        table3array t3b = new table3array();


        HashMap<String, table3obj> ttt3 = t3a.gettable3map();
        int aa = 3;


    }

    //change addvalue from string to chararray.
    public static char[] charconv(String convalue)
    {
        char[] rStToChar;
        rStToChar = convalue.toCharArray();
        return rStToChar;
    }



    private static int howManyObjects(char[] chbValue)
    {
        int objectnumb = 0;
        int commacount = 0;
        String charatt;
        char chart;
        char chrflag = 'n';

        //replace commas, if they are leading commas
        objectnumb = chbValue.length;
        for (int i = 0; i < objectnumb; i++)
        {
            chart = chbValue[i];
            charatt = Character.toString(chart);

            if (charatt.matches("[a-zA-Z0-9]"))
                chrflag = 'y';

            if ((chart == ',') && (chrflag == 'n'))
                chbValue[i] = ' ';
        }


        for (int i = objectnumb; i <= 0; i--)
        {
            chart = chbValue[i];
            charatt = Character.toString(chart);
            if (charatt.matches("[a-zA-Z0-9]"))
                chrflag = 'y';

            if ((chart == ',') && (chrflag == 'n'))
                chbValue[i] = ' ';
        }

        int countcomma;
        if (chrflag == 'n') {
            countcomma = 0;
        } else {
            countcomma = 1;
        }

        for (int i = 0; i < objectnumb; i++) {
            chart = chbValue[i];
            if (chart == ',') {
                countcomma++;
            }
        }

        return countcomma;
    }



    public static String scanInObjects(String fobject)
    {
        String scanresult;
        Scanner scanner = new Scanner(System.in);
        System.out.print(fobject);
        scanresult = scanner.nextLine();
        return scanresult;
    }



    public static int readtest(HashMap<String, String> uni)
    {
        String a = uni.get("group");
        return 1;
    }


    public HashMap<String, String>  getHash()
    {
        return userinputmap;
    }
}
