

/*
*
* This is a table 4 object that gets put into a table 4 array or hashtable.
*
**/



public class table4obj {

    int table4obj_id;
    int table4obj_foreignid;
    char table4obj_attflag;
    String table4obj_attrib_name;
    String table4obj_attrib_value;
    String parent_value;

    public table4obj() {
    }

    public int gettable4obj_id()
    {
        return table4obj_id;
    }

    public void settable4obj_id(int table4obj_id)
    {
        this.table4obj_id = table4obj_id;
    }

    public int gettable4obj_foreignid()
    {
        return table4obj_foreignid;
    }

    public void settable4obj_foreignid(int table4obj_foreignid)
    {
        this.table4obj_foreignid = table4obj_foreignid;
    }

    public char gettable4obj_attflag()
    {
        return table4obj_attflag;
    }

    public void settable4obj_attflag(char table4obj_attflag)
    {
        this.table4obj_attflag = table4obj_attflag;
    }

    public String gettable4obj_attrib_name()
    {
        return table4obj_attrib_name;
    }

    public void settable4obj_attrib_name(String table4obj_attrib_name)
    {
        this.table4obj_attrib_name = table4obj_attrib_name;
    }

    public String gettable4obj_attrib_value()
    {
        return table4obj_attrib_value;
    }

    public void settable4obj_attrib_value(String table4obj_attrib_value) {
        this.table4obj_attrib_value = table4obj_attrib_value;
    }

    public String getParent_value()
    {
        return parent_value;
    }

    public void setParent_value(String parent_value)
    {
        this.parent_value = parent_value;
    }


}



