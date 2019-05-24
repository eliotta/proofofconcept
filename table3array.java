import java.util.*;

/* This is a table 3 array, that is a hashmap, with put and a get
* Hashmap allows for key value pairs. Using the functions here, the hashmap is built,
* one record at a time. The hashmap takes a string as a key, and a table3object as the body of
* the record.
* */

public class table3array {


    private HashMap<String, table3obj> t3map = new HashMap<String, table3obj>();


    public table3array()
    {
    }

    public HashMap<String, table3obj> gettable3map()
    {   //t3map is a hashmap
        return t3map;
    }



    public void puttable3map(String idKey, table3obj tt3)
    {
        t3map.put(idKey, tt3);
    }


    public HashMap<String, table3obj> getsortacasting(table3array crd)
    {
        return t3map;
    }

    public  int table3array_size()
    {
      return t3map.size();
    }


}

