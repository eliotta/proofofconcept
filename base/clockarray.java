

/*
*
* These are the arrays within the array the clock objects live in.
* This is two arrays. One array whose cells point down to (in this case) five single
* dimension arrays. The cells, in turn, points to the clockarrayclass objects.
*
*
* */

public class clockarray
{




    clockarrayclass singleclass = new clockarrayclass();


    int x;
    int y;

    public clockarray()
    {
    }

    public clockarrayclass[][] initclockarray(int X, int Y)
    {
        clockvalue cvalue[][] = new clockvalue[X][Y];
        clocklocation[][] clocation = new clocklocation[X][Y];
        clockarrayclass[][] carrayclass = new clockarrayclass[X][Y];

        for(int i = 0; i < X; i++ )
        {
            for (int j = 0; j < Y; j++)
            {
                cvalue[i][j] = new clockvalue();
 
                clocation[i][j] = new clocklocation();
   //             System.out.println("i + j " + i + " " + j);
                carrayclass[i][j] = new clockarrayclass();
                carrayclass[i][j].cloc = clocation[i][j];
                carrayclass[i][j].cval = cvalue[i][j];
            }
        }
        return carrayclass;
    }




    public void init(int X, int Y)
    {
        clockarray[][] carray = new clockarray[X][Y];

        for(int i = 0; i < X; i++ )
        {
            for (int j = 0; j < Y; j++)
            {
                carray[i][j] = new clockarray();
            }
        }
    }


    public clockarrayclass getcarray(clockarrayclass[][] incarray, int a, int b)
    {
        clockvalue cacval = new clockvalue();
        singleclass = incarray[a][b];
        cacval = singleclass.getCval();
        String ab = cacval.getClover();
//        System.out.println(" ab " + ab);
        return singleclass;
    }


    public clockarrayclass getSingleclass()
    {
        return singleclass;
    }


    public void setSingleclass(clockarrayclass singleclass)
    {
        this.singleclass = singleclass;
    }




}
