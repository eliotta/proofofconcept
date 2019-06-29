
/*
* This is the clock object location. Within a clock array, there is a clock object. Within the clock
* object, there are two flags, and two classes. One of the classes is value. This is the location class
*/

public class clocklocation {

    pos cPos = new pos();
    value cObj = new value(1);



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


    public int areturn()
    {


//        System.out.println(" a return is here ");



        return 5;
    }

}
