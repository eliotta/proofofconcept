public class Clockarry  implements Clocate,Cvalue
{

    int cXpos;
    int cYpos;
       
    int hashindex;



    int cXloc;
    int cYloc;

    String cvdes;

    char orbitflag = 'N';
    char dupcheck = 'N';
    char hdupcheck = 'N';

    String cvId;
    String cvForeignID;
    String cvHashkey;

    public Clockarry()
    {

    }


    public void showlocation()
    {
        System.out.println("this is showlocation");
    }

    public void showposition()
    {
        System.out.println("this is showposition");
    }


    public void showvalue()
    {
        System.out.println("this is showvalue");
    }

    public int gethashindex()
    {
        return hashindex;
    }

    public void sethashindex(int hashindex)
    {
       this.hashindex = hashindex;
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

    public int getcXloc()
    {
        return cXloc;
    }

    public void setcXloc(int cXloc)
    {
        this.cXloc = cXloc;
    }

    public int getcYloc()
    {
        return cYloc;
    }

    public void setcYloc(int cYloc)
    {
        this.cYloc = cYloc;
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


    public char getOrbitflag()
    {
        return orbitflag;
    }

    public void setOrbitflag(char orbitflag)
    {
        this.orbitflag = orbitflag;
    }

    public char getDupcheck()
    {
        return dupcheck;
    }

    public void setDupcheck(char dupcheck)
    {
        this.dupcheck = dupcheck;
    }

    public char getHdupcheck()
    {
        return hdupcheck;
    }

    public void setHdupcheck(char hdupcheck)
    {
        this.hdupcheck = hdupcheck;
    }


    public int convertID(String StringID)
    {
        String number = "10";
        int convertedID  = Integer.parseInt(StringID);
        return convertedID;
    }



    public Clockarry retwash(Clockarry oldclockarry)
    {
        Clockarry tempclockarry = new Clockarry();
        this.setCvDescription(oldclockarry.getCvDescription());
        this.setOrbitflag('B'); 
        this.setCvId(oldclockarry.getCvId());   
        return tempclockarry;    

    }

}
