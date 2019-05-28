

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
    clockarrayclass singleclass;
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
                cvalue[j][i] = new clockvalue();
                cvalue[j][i].clover = "here";
                clocation[j][i] = new clocklocation();
                System.out.println(" firemarshall bill  ");

                carrayclass[j][i] = new clockarrayclass();
                carrayclass[j][i].cloc = clocation[j][i];
                carrayclass[j][i].cval = cvalue[j][i];
            }
        }


        x = X;
        y = Y;



        singleclass = new clockarrayclass();
       singleclass = carrayclass[2][2];

        return carrayclass;
    }


    public clockarrayclass getcarray(clockarrayclass[][] incarray, int a, int b)
    {

        singleclass = incarray[a][b];

        return singleclass;
    }


    public clockarrayclass getSingleclass()
    {
        return singleclass;
    }



}
