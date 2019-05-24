

import java.util.*;


/*
* This class loads data into table 3
*
* */


public class loader
{

    private table3array cards = new table3array();
    private table3list cardlist = new table3list();


    public loader(){

    }

    public void creating() {

        table3obj nullzero = new table3obj();
        table3obj nullone = new table3obj();
        table3obj nullfifty = new table3obj();
        table3obj atwo = new table3obj();
        table3obj athree = new table3obj();
        table3obj afour = new table3obj();
        table3obj afive = new table3obj();
        table3obj asix = new table3obj();
        table3obj aseven = new table3obj();
        table3obj aeight = new table3obj();
        table3obj anine = new table3obj();
        table3obj ajack = new table3obj();
        table3obj aqueen = new table3obj();
        table3obj aking = new table3obj();
        table3obj aace = new table3obj();

        table3obj btwo = new table3obj();
        table3obj bthree = new table3obj();
        table3obj bfour = new table3obj();
        table3obj bfive = new table3obj();
        table3obj bsix = new table3obj();
        table3obj bseven = new table3obj();
        table3obj beight = new table3obj();
        table3obj bnine = new table3obj();
        table3obj bjack = new table3obj();
        table3obj bqueen = new table3obj();
        table3obj bking = new table3obj();
        table3obj bace = new table3obj();


        table3obj ctwo = new table3obj();
        table3obj cthree = new table3obj();
        table3obj cfour = new table3obj();
        table3obj cfive = new table3obj();
        table3obj csix = new table3obj();
        table3obj cseven = new table3obj();
        table3obj ceight = new table3obj();
        table3obj cnine = new table3obj();
        table3obj cjack = new table3obj();
        table3obj cqueen = new table3obj();
        table3obj cking = new table3obj();
        table3obj cace = new table3obj();

        table3obj dtwo = new table3obj();
        table3obj dthree = new table3obj();
        table3obj dfour = new table3obj();
        table3obj dfive = new table3obj();
        table3obj dsix = new table3obj();
        table3obj dseven = new table3obj();
        table3obj deight = new table3obj();
        table3obj dnine = new table3obj();
        table3obj djack = new table3obj();
        table3obj dqueen = new table3obj();
        table3obj dking = new table3obj();
        table3obj dace = new table3obj();
        //there were 51 new objects above.


        nullzero.setId("0");
        nullzero.setForeignid("0");
        nullzero.setDescription("Nullzero ");
        nullzero.setHashkey("nulllzero");
        nullzero.setPulled('N');
        cards.puttable3map("nullzero", nullzero);


        nullone.setId("1");
        nullone.setForeignid("1");
        nullone.setDescription("Nullone");
        nullone.setHashkey("nullone");
        nullone.setPulled('N');
        cards.puttable3map("nullone", nullone);



        atwo.setId("2");
        atwo.setForeignid("2");
        atwo.setDescription("Two of Diamonds ");
        atwo.setHashkey("atwo");
        atwo.setPulled('N');
        cards.puttable3map("atwo", atwo);


        athree.setId("3");
        athree.setForeignid("3");
        athree.setDescription("Three of Diamonds ");
        athree.setHashkey("athree");
        athree.setPulled('N');
        cards.puttable3map("athree", athree);

        afour.setId("4");
        afour.setForeignid("4");
        afour.setDescription("Four of Diamonds ");
        afour.setHashkey("afour");
        afour.setPulled('N');
        cards.puttable3map("afour", afour);

        afive.setId("5");
        afive.setForeignid("5");
        afive.setDescription("Five of Diamonds ");
        afive.setHashkey("afive");
        afive.setPulled('N');
        cards.puttable3map("afive", afive);

        asix.setId("6");
        asix.setForeignid("6");
        asix.setDescription("Six of Diamonds ");
        asix.setHashkey("asix");
        asix.setPulled('N');
        cards.puttable3map("asix", asix);

        aseven.setId("7");
        aseven.setForeignid("7");
        aseven.setDescription("Seven of Diamonds ");
        aseven.setHashkey("aseven");
        aseven.setPulled('N');
        cards.puttable3map("aseven", aseven);

        aeight.setId("8");
        aeight.setForeignid("8");
        aeight.setDescription("Seven of Diamonds ");
        aeight.setHashkey("aeight");
        aeight.setPulled('N');
        cards.puttable3map("aeight", aeight);

        anine.setId("9");
        anine.setForeignid("9");
        anine.setDescription("Nine of Diamonds ");
        anine.setHashkey("anine");
        anine.setPulled('N');
        cards.puttable3map("anine", anine);

        ajack.setId("10");
        ajack.setForeignid("10");
        ajack.setDescription("Jack of Diamonds ");
        ajack.setHashkey("ajack");
        ajack.setPulled('N');
        cards.puttable3map("ajack", ajack);

        aqueen.setId("11");
        aqueen.setForeignid("11");
        aqueen.setDescription("Queen of Diamonds ");
        aqueen.setHashkey("aqueen");
        aqueen.setPulled('N');
        cards.puttable3map("aqueen", aqueen);

        aking.setId("12");
        aking.setForeignid("12");
        aking.setDescription("King of Diamonds ");
        aking.setHashkey("aking");
        aking.setPulled('N');
        cards.puttable3map("aking", aking);

        aace.setId("13");
        aace.setForeignid("13");
        aace.setDescription("Ace of Diamonds ");
        aace.setHashkey("aace");
        aace.setPulled('N');
        cards.puttable3map("aace", aace);

        btwo.setId("14");
        btwo.setForeignid("14");
        btwo.setDescription("Two of Clubs  ");
        btwo.setHashkey("btwo");
        btwo.setPulled('N');
        cards.puttable3map("btwo", btwo);

        bthree.setId("15");
        bthree.setForeignid("15");
        bthree.setDescription("Three of Clubs  ");
        bthree.setHashkey("bthree");
        bthree.setPulled('N');
        cards.puttable3map("bthree", bthree);

        bfour.setId("16");
        bfour.setForeignid("16");
        bfour.setDescription("Four of Clubs  ");
        bfour.setHashkey("bfour");
        bfour.setPulled('N');
        cards.puttable3map("bfour", bfour);

        bfive.setId("17");
        bfive.setForeignid("17");
        bfive.setDescription("Five of Clubs  ");
        bfive.setHashkey("bfive");
        bfive.setPulled('N');
        cards.puttable3map("bfive", bfive);

        bsix.setId("18");
        bsix.setForeignid("18");
        bsix.setDescription("Six of Clubs  ");
        bsix.setHashkey("bsix");
        bsix.setPulled('N');
        cards.puttable3map("bsix", bsix);

        bseven.setId("19");
        bseven.setForeignid("19");
        bseven.setDescription("Seven of Clubs  ");
        bseven.setHashkey("bseven");
        bseven.setPulled('N');
        cards.puttable3map("bseven", bseven);

        beight.setId("20");
        beight.setForeignid("20");
        beight.setDescription("Seven of Clubs  ");
        beight.setHashkey("beight");
        beight.setPulled('N');
        cards.puttable3map("beight", beight);

        bnine.setId("21");
        bnine.setForeignid("21");
        bnine.setDescription("Nine of Clubs  ");
        bnine.setHashkey("bnine");
        bnine.setPulled('N');
        cards.puttable3map("bnine", bnine);

        bjack.setId("22");
        bjack.setForeignid("22");
        bjack.setDescription("Jack of Clubs  ");
        bjack.setHashkey("bjack");
        bjack.setPulled('N');
        cards.puttable3map("bjack", bjack);

        bqueen.setId("23");
        bqueen.setForeignid("23");
        bqueen.setDescription("Queen of Clubs  ");
        bqueen.setHashkey("bqueen");
        bqueen.setPulled('N');
        cards.puttable3map("bqueen", bqueen);

        bking.setId("24");
        bking.setForeignid("24");
        bking.setDescription("King of Clubs  ");
        bking.setHashkey("bking");
        bking.setPulled('N');
        cards.puttable3map("bking", bking);

        bace.setId("25");
        bace.setForeignid("25");
        bace.setDescription("Ace of Clubs  ");
        bace.setHashkey("bace");
        bace.setPulled('N');
        cards.puttable3map("bace", bace);


        ctwo.setId("26");
        ctwo.setForeignid("26");
        ctwo.setDescription("Two of Spades ");
        ctwo.setHashkey("ctwo");
        ctwo.setPulled('N');
        cards.puttable3map("ctwo", ctwo);

        cthree.setId("27");
        cthree.setForeignid("27");
        cthree.setDescription("Three of Spades ");
        cthree.setHashkey("cthree");
        cthree.setPulled('N');
        cards.puttable3map("cthree", cthree);

        cfour.setId("28");
        cfour.setForeignid("28");
        cfour.setDescription("Four of Spades ");
        cfour.setHashkey("cfour");
        cfour.setPulled('N');
        cards.puttable3map("cfour", cfour);

        cfive.setId("29");
        cfive.setForeignid("29");
        cfive.setDescription("Five of Spades ");
        cfive.setHashkey("cfive");
        cfive.setPulled('N');
        cards.puttable3map("cfive", cfive);

        csix.setId("30");
        csix.setForeignid("30");
        csix.setDescription("Six of Spades ");
        csix.setHashkey("csix");
        csix.setPulled('N');
        cards.puttable3map("csix", csix);

        cseven.setId("31");
        cseven.setForeignid("31");
        cseven.setDescription("Seven of Spades ");
        cseven.setHashkey("cseven");
        cseven.setPulled('N');
        cards.puttable3map("cseven", cseven);

        ceight.setId("32");
        ceight.setForeignid("32");
        ceight.setDescription("Eight of Spades ");
        ceight.setHashkey("ceight");
        ceight.setPulled('N');
        cards.puttable3map("ceight", ceight);

        cnine.setId("33");
        cnine.setForeignid("33");
        cnine.setDescription("Nine of Spades ");
        cnine.setHashkey("cnine");
        cnine.setPulled('N');
        cards.puttable3map("cnine", cnine);

        cjack.setId("34");
        cjack.setForeignid("34");
        cjack.setDescription("Jack of Spades ");
        cjack.setHashkey("cjack");
        cjack.setPulled('N');
        cards.puttable3map("cjack", cjack);

        cqueen.setId("35");
        cqueen.setForeignid("35");
        cqueen.setDescription("Queen of Spades ");
        cqueen.setHashkey("cqueen");
        cqueen.setPulled('N');
        cards.puttable3map("cqueen", cqueen);

        cking.setId("36");
        cking.setForeignid("36");
        cking.setDescription("King of Spades ");
        cking.setHashkey("cking");
        cking.setPulled('N');
        cards.puttable3map("cking", cking);

        cace.setId("37");
        cace.setForeignid("37");
        cace.setDescription("Ace of Spades ");
        cace.setHashkey("cace");
        cace.setPulled('N');
        cards.puttable3map("cace", cace);


        dtwo.setId("38");
        dtwo.setForeignid("38");
        dtwo.setDescription("Two of Hearts ");
        dtwo.setHashkey("dtwo");
        dtwo.setPulled('N');
        cards.puttable3map("dtwo", dtwo);


        dthree.setId("39");
        dthree.setForeignid("39");
        dthree.setDescription("Three of Hearts ");
        dthree.setHashkey("dthree");
        dthree.setPulled('N');
        cards.puttable3map("dthree", dthree);

        dfour.setId("40");
        dfour.setForeignid("40");
        dfour.setDescription("Four of Hearts ");
        dfour.setHashkey("dfour");
        dfour.setPulled('N');
        cards.puttable3map("dfour", dfour);

        dfive.setId("41");
        dfive.setForeignid("41");
        dfive.setDescription("Five of Hearts ");
        dfive.setHashkey("dfive");
        dfive.setPulled('N');
        cards.puttable3map("dfive", dfive);

        dsix.setId("42");
        dsix.setForeignid("42");
        dsix.setDescription("Six of Hearts ");
        dsix.setHashkey("dsix");
        csix.setPulled('N');
        cards.puttable3map("dsix", dsix);

        dseven.setId("43");
        dseven.setForeignid("43");
        dseven.setDescription("Seven of Hearts ");
        dseven.setHashkey("dseven");
        dseven.setPulled('N');
        cards.puttable3map("dseven", dseven);

        deight.setId("44");
        deight.setForeignid("44");
        deight.setDescription("Eight of Hearts ");
        deight.setHashkey("deight");
        ceight.setPulled('N');
        cards.puttable3map("deight", deight);

        dnine.setId("45");
        dnine.setForeignid("45");
        dnine.setDescription("Nine of Hearts ");
        dnine.setHashkey("dnine");
        dnine.setPulled('N');
        cards.puttable3map("dnine", dnine);

        djack.setId("46");
        djack.setForeignid("46");
        djack.setDescription("Jack of Hearts ");
        djack.setHashkey("djack");
        djack.setPulled('N');
        cards.puttable3map("djack", djack);

        dqueen.setId("47");
        dqueen.setForeignid("47");
        dqueen.setDescription("Queen of Hearts ");
        dqueen.setHashkey("dqueen");
        dqueen.setPulled('N');
        cards.puttable3map("dqueen", dqueen);

        dking.setId("48");
        dking.setForeignid("48");
        dking.setDescription("King of Hearts ");
        dking.setHashkey("dking");
        dking.setPulled('N');
        cards.puttable3map("dking", dking);

        dace.setId("49");
        dace.setForeignid("49");
        dace.setDescription("Ace of Hearts ");
        dace.setHashkey("dace");
        dace.setPulled('N');
        cards.puttable3map("dace", dace);

        nullfifty.setId("50");
        nullfifty.setForeignid("50");
        nullfifty.setDescription("nullfifty ");
        nullfifty.setHashkey("nullfifty");
        nullfifty.setPulled('N');
        cards.puttable3map("nullfifty", nullfifty);


        //there are 51 ids set. they start from zero. This is as oppoed to 52 objects

        HashMap<String, table3obj> task = cards.getsortacasting(cards);



        int iii = 0;
        int iiii = 0;
        for (table3obj value : task.values())
        {
            String ab = value.id;
            System.out.println(" in loader puttable   " + iii +  " " +  ab);
            cardlist.puttable3map(iii, value);
            iii++;
        }


        for (table3obj value : task.values())
        {
            iiii = value.gettheid(value.id);
            System.out.println(" in loader iiii before settable  " + iiii);

            if(iiii <= 50)
                cardlist.settable3map(iiii, value);
        }

    }


    public table3array gettable3map()
    {
        return cards;
    }


    public table3list gettablelist()
    {
        return cardlist;
    }
}


