
/*
* This is the clock object value. Within a clock array, there is a clock object. Within the clock
* object, there are two flags, and two classes. One of the class is location. This is other
* class. This is the value class
*/


public class clockvalue {

    String clover = " ";
    String cvId = " ";
    String cvForeignID = " ";
    String cvDescription = " ";
    String cvHashkey = " ";


    public clockvalue()
    {
//        System.out.println("this is constructor for clock value");
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
        return cvForeignID;
    }

    public void setCvForeignID(String cvForeignID)
    {
        this.cvForeignID = cvForeignID;
    }

    public String getCvDescription()
    {
        return cvDescription;
    }

    public void setCvDescription(String cvDescription)
    {
        this.cvDescription = cvDescription;
    }

    public String getCvHashkey()
    {
        return cvHashkey;
    }

    public void setCvHashkey(String cvHashkey)
    {
        this.cvHashkey = cvHashkey;
    }

    public String getClover()
    {
        return clover;
    }

    public void setClover(String clover)
    {
        this.clover = clover;
    }

}
