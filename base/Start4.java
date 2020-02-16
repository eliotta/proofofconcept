


import java.util.*;
import java.lang.Integer;






@SuppressWarnings("Duplicates")

public class Start4
{
public static void main(String[] args)
{
start4();
}

public static void start4()
{
    System.out.println(" in start4  "); 

//starts in here
int max = 4;
Clockarry tempcac = new Clockarry();
String tempi;
int itempi;

table3list t3l = new table3list();  
buildpopulateclockarray bpca = new buildpopulateclockarray();


Clockarry[][]  fivebyfive =   bpca.init_a_twodim_arry(5, 5);
Clockarry[][]  template_fivebyfive =   bpca.init_a_twodim_arry(5, 5);
ArrayList<Integer> arrlio = new ArrayList<Integer>(51);

arrlio = numshuffle(51);
displayshuffle(arrlio);
loader ldr = new loader(); 
ldr.creating();
t3l = ldr.gettablelist();

Clockarry[] asinglepull = bpca.clockarry_pull(0, 5, t3l, arrlio);

HashMap<String, Clockarry> changestorage = new HashMap<String, Clockarry>();
//Clockarry aclockobject = new Clockarry();

//template_fivebyfive = fivebyfive;



//Hashmap population
changestorage = hashpopulate(changestorage);


//Permanent clockarray creation. 
Clockarry[][] permanentCA = new Clockarry[5][5];
permanentCA = permanclock(permanentCA);

Clockarry anobject = new Clockarry();
anobject = asinglepull[1];
anobject = replacelocation(3,3, anobject);
permanentCA = replace_location_from_array(2, 2, template_fivebyfive, 0, 0); 
}



public static Clockarry[][] permanclock(Clockarry[][] permanentCAA)
{
  System.out.println("stubb. load permanent clockarray,");
  Clockarry[][] throwaway =  new Clockarry[5][5];
  throwaway = permanentCAA;
  return throwaway;
}

public static HashMap<String, Clockarry> hashpopulate(HashMap<String, Clockarry> cchangestorage)
{
System.out.println("stubb. load hashpopulate");
return cchangestorage;
};



public static void displayshuffle(ArrayList<Integer> arr)
{
    int bc = 0;
    int al = (arr.size() - 1);
    for(int ig=0;ig<=al;ig++)
    {
        bc = arr.get(ig);
    }
}

public static ArrayList<Integer> numshuffle(int qtyofshuffle)
{
    ArrayList<Integer> arrli = new ArrayList<Integer>();
    Random rand = new Random();
    for(int ig=0; ig<=51; ig++)
    {
        arrli.add(ig,ig);
    }

    Collections.shuffle(arrli);
    return arrli;
}



public static Clockarry replacelocation(int newX, int newY, Clockarry some_CAObject)
{
some_CAObject.setcXloc(newX);
some_CAObject.setcYloc(newY);
System.out.println("stubb . this is replacelocation");
return some_CAObject;
}


//Location Addition/repalacement function from array
public static Clockarry[][] replace_location_from_array
        (int newlX, int newlY, Clockarry[][] some_carray, int row, int col)
{
Clockarry anobject = new Clockarry(); 
anobject =  some_carray[row][col];
anobject.setcXloc(newlX);
anobject.setcYloc(newlY);
some_carray[row][col] = anobject;
System.out.println("stubb . this is replacelocation with array as input");
return some_carray;
}





//Index Creation Function from object
public static int return_new_indexhash(int oldhash, Clockarry inputobject)
{
    int newhash = 0;
    int lefthash = oldhash/10000;
    lefthash++;
    lefthash = lefthash * 10000;
    return newhash;
}



}