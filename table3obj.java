

/*
*
* This is a table 3 object that gets put into a table 3 array or hashtable.
*
**/


public class table3obj
{
    String id;
    String foreignid;
    String description;
    char pulled;
    String hashkey;
    int i3;


    public String getHashkey()
    {
        return hashkey;
    }

    public void setHashkey(String hashkey)
    {
        this.hashkey = hashkey;
    }


    public String getDescription()
    {
        return description;
    }


    public void setDescription(String description)
    {
        this.description = description;
    }


    public table3obj()
    {

    }


    public String getId()
    {
        return id;
    }


    public int gettheid(String ids)
    {
        i3=Integer.parseInt(ids);
        return i3;
    }


    public void setId(String id)
    {
        this.id = id;
    }

    public String getForeignid()
    {
        return foreignid;
    }

    public void setForeignid(String foreignid)
    {
        this.foreignid = foreignid;
    }

    public char getPulled()
    {
        return pulled;
    }

    public void setPulled(char pulled)
    {
        this.pulled = pulled;
    }


}
