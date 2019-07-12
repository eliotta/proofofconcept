
/*
* This is the clock object location. Within a clock array, there is a clock object. Within the clock
* object, there are two flags, and two classes. One of the classes is value. This is the location class
*/

public class clocklocation {




    public clocklocation()
    {
        cPos.xpos = 0;
        cPos.ypos = 0;
        cObj.metatitle = " ";
        cObj.obj_revision = 0;
        cObj.avalue = " ";
        cObj.xpos = 0;

//        System.out.println("this is constructor for clock");
    }


    public pos getcPos() {
        return cPos;
    }

    public void setcPos(pos cPos) {
        this.cPos = cPos;
    }

    public value getcObj() {
        return cObj;
    }

    public void setcObj(value cObj) {
        this.cObj = cObj;
    }

    pos cPos = new pos();
    value cObj = new value(1);





    public int areturn()
    {


//        System.out.println(" a return is here ");



        return 5;
    }

}
