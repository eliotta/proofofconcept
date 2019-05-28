
public class value {

    String avalue;
    String metatitle;
    int obj_revision = 1; //Tracks changes to an object, independent of the cell its in
    //flipped if code is told not to use a particular object



    public value(int no)
    {

    }


    char use_flag = 'y';
    int xpos;

    public char getUse_flag()
    {
        return use_flag;
    }

    public void setUse_flag(char use_flag)
    {
        this.use_flag = use_flag;
    }

    public int getXpos()
    {
        return xpos;
    }

    public void setXpos(int xpos)
    {
        this.xpos = xpos;
    }

    public String getValue()
    {
        return avalue;
    }

    public void setValue(String value)
    {
        this.avalue = avalue;
    }

    public String getMetatitle()
    {
        return metatitle;
    }

    public void setMetatitle(String metatitle)
    {
        this.metatitle = metatitle;
    }

    public int getObj_revision()
    {
        return obj_revision;
    }

    public void setObj_revision(int obj_revision)
    {
        this.obj_revision = obj_revision;
    }

}

