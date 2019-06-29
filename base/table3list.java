
import java.util.*;


public class table3list {

    ArrayList<table3obj> t3list = new ArrayList<table3obj>();

    public table3list()
    {

    }


    public ArrayList<table3obj>  gettable3list()
    {
        return t3list;
    }


    public void puttable3map(Integer intKey, table3obj tt3)
    {
        t3list.add(intKey, tt3);
    }

    int ii = 0;
    public void settable3map(Integer iintKey, table3obj tt3)
    {
        ii++;
//        System.out.println("what is get ii " +  ii);
//        System.out.println("what is get iintkey " +  iintKey);
        t3list.set(iintKey, tt3);
    }


    public table3obj t3r(Integer intKey)
    {
//        System.out.println("whatt is get intkey " + intKey);
        return  t3list.get(intKey);
    }
 

    public Integer listsize ()
    {
        int a = t3list.size();
        return a;
    }

}
