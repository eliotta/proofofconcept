public class Clockarry  implements Clocate,Cvalue
{

    int cXpos;
    int cYpos;


    String cvId;
    String cvForeignID;
    public   String cvdes;
    String cvHashkey ;


    public Clockarry()
    {


    }




    public void showlocation()
    {
        System.out.println("this is showlocation");
    }

    public void showvalue()
    {
        System.out.println("this is showvalue");
    }


    public int getcXpos()
    {
        return cXpos;
    }

    public void setcXpos(int cXpos)
    {
        this.cXpos = cXpos;
    }

    public int getcYpos()
    {
        return cYpos;
    }

    public void setcYpos(int cYpos)
    {
        this.cYpos = cYpos;
    }


    public String getCvId()
    {
        return cvId;
    }

    public void setCvId(String cvId)
    {
        this.cvId = cvId;
    }

    public String getCvForeignID()
    {
        //return cvForeignID;
        return cvForeignID;


    }

    public void setCvForeignID(String cvForeignID)
    {
        this.cvForeignID = cvForeignID;
    }


    public String getCvDescription()
    {
        return this.cvdes;
    }


    @Override
    public void setCvDescription(String cvDescripn)
    {
        this.cvdes = cvDescripn;
    }

    public String getCvHashkey()
    {
        return cvHashkey;
    }

    public void setCvHashkey(String cvHashkey)
    {
        this.cvHashkey = cvHashkey;
    }


}
