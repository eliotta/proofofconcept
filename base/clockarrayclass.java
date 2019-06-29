
/*
*
* The cells of the clock arrays point to an object. This is that object.
* This object in turn points to a location class, a value class, a use flag,
* and a temporary use flag.
*
* The use flag is for marking the finish of the entire process.
* The temporary flag is for flagging any one value in any process.
*
*
* */

public class clockarrayclass {
    clocklocation cloc = new clocklocation();
    clockvalue cval = new clockvalue();

    public clockarrayclass()
    {
    }

    public clocklocation getCloc()
    {
        return cloc;
    }

    public void setCloc(clocklocation cloc)
    {
        this.cloc = cloc;
    }

    public clockvalue getCval()
    {
        return cval;
    }

    public void setCval(clockvalue cval)
    {
        this.cval = cval;
    }

    public String getclover()
    {
        String H = cval.clover;
        return  H;
    }
}
