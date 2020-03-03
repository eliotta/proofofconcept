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



int ab = anobject.gethashindex();
System.out.println("ab " + ab);
ab =  return_new_indexhash(10000);
anobject = set_new_hashindex_in_object(ab, anobject);

//Row hashmap creation function
final HashMap<String, Clockarry[]> single_row_map = new HashMap<String, Clockarry[]>();

//Object hashmap creation 
final HashMap<Integer, Clockarry> clockarry_objects = new HashMap<Integer, Clockarry>();




}  //..



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




public static int return_new_indexhash(int oldhash)
{
    int lefthash = oldhash/10000;
    lefthash++;
    lefthash = lefthash * 10000;
    System.out.println("stubb . return new hashindex, which is lefthash " + lefthash );
    return lefthash;
}


public static Clockarry set_new_hashindex_in_object(int newhash, Clockarry inputobject)
{
    inputobject.sethashindex(newhash);
    System.out.println("stubb . set new hash index in object");
    return inputobject;
}

//Object hashmap addition function
public static void add_to_object_hashmap(Integer hashindex, Clockarry clockobject, HashMap<Integer, Clockarry> clobjects)
{
    clobjects.put(hashindex, clockobject);
}

//Index retrieval function from object hasmap
public static Clockarry retrieve_object_from_hashmap(Integer hashindex, HashMap<Integer, Clockarry> clobjects)
{
	Clockarry anobject = new Clockarry();
 	anobject =  clobjects.get(hashindex);
	return anobject;
}

//Row hashmap addition function 
public static void add_to_row_hashmap(int whichrow, 
    String hhashindex, Clockarry[] clockrow, HashMap<String, Clockarry[]> single_row_map)
{    
single_row_map.put(hhashindex, clockrow);
}

//Row hashmap retrieval function
public static Clockarry[] retrieve_row_from_hashmap(int newrow, String hashindex, 
HashMap<String, Clockarry[]> clockarry_row)
{
	Clockarry[] arow = new Clockarry[newrow];
    arow =  clockarry_row.get(hashindex); 
	return arow;
}





/*
Flag variable creation function
tracks starting point for clocking function. 
works for the row.  its locX and locY from right to left. 
read as a string. cocat.
where necessary, can be converted to  int via Integer.parseInt(some_string);  
loc/pos stored as strings  since leading zeroes get lopped off. 
*/
public static String create_flag_variable(Clockarry[][] ca, int mmax)
{
    int int_retrieve = 0;  
    String fromint = "";
    String concat_string = "";

    for(int i = mmax;  i >= 0; i--) 
{
    int_retrieve = ca[0][i].getcXloc();

    //fromint = String.format(%02d, int_retrieve );
    concat_string = fromint + concat_string;  	  
    }	
    return concat_string;
}

//this has to be a string/string compare, because of the leading zeros. 
//Flag variable comparison  function
public static char flag_variable_compare(String created_hash, String compare_variable)
{
if( created_hash == compare_variable){
return 'Y';
}
return 'N';
}

//Note: X describes movements from left to right. Which column. Y descrives movements up 
//and down. Which row 
//includes math. Excludes flag match. Excludes position v location match used to turn cyclinder
//Position creation function. returns an object loaded with the new position. 
public static Clockarry position_creation(Clockarry newpos_object, int prevposx, int prevposy, 
      final HashMap<String, Clockarry> unique_object_map, Clockarry[][] temporary_clockarry )
{
int xpos = temporary_clockarry[prevposx][prevposy].getcXpos();
if (xpos > 4)
xpos = 1;
else 
xpos++;


int ypos = temporary_clockarry[prevposx][prevposy].getcYpos();
if (xpos > 4)
{xpos = 1;}
else 
{xpos++;}

newpos_object = temporary_clockarry[prevposx][prevposy];
newpos_object.setcYpos(xpos);
newpos_object.setcYpos(ypos);
return newpos_object;
} 


//retrieval current Xloc Yloc
public static String retrvl_curr_xyloc_tmp_clock(int currX, int currY, Clockarry[][] temporary_clockarry)
{
String fromx;
String fromy;
int xpos = temporary_clockarry[currX][currY].getcXpos();
int ypos = temporary_clockarry[currX][currY].getcYpos();
fromx = String.format("%02d", xpos );
fromy = String.format("%02d", ypos );
String concatxy = fromx + fromy;
return concatxy;
}

//Objectarray Retrieval Obj_hashmap
public static Clockarry Retrieval_Obj_hashmap(Clockarry clock, 
           HashMap<String, Clockarry> specificobjects, String concatxy )
{
clock = specificobjects.get(concatxy);
return clock;
} 


//object posx retrieval function
public static Integer retrieve_pos_from_object_posx(Clockarry inforpos)
{
int posx = inforpos.getcXpos();
return posx;
}

//object posy retrieval function
public static Integer retrieve_pos_from_object_posy(Clockarry inforpos)
{
int posy = inforpos.getcYpos();
return posy;
}


//object locx retrieval function
public static Integer retrieve_loc_from_object_locx(Clockarry inforpos)
{
int locx = inforpos.getcXloc();
return locx;
}

//object locy retrieval function
public static Integer retrieve_loc_from_object_locy(Clockarry inforpos)
{
int locy = inforpos.getcYloc();
return locy;
}

//Loc Match Pos
public static String Loc_Match_Pos(Integer xpos, Integer ypos, Integer xloc, Integer yloc )
{
String from_locx = String.format("%02d", xloc );
String from_locy = String.format("%02d", yloc );
String concat_locxy = from_locx + from_locy;

String from_posx = String.format("%02d", xpos );
String from_posy = String.format("%02d", ypos );
String concat_posxy = from_posx + from_posy;

if(concat_posxy == concat_locxy)
{
 return "Y"; 
}

return "N";
}

//Change Because Loc Match Pos
public static Clockarry[]  Change_Because_Loc_Match_Pos(int maxx, 
       Clockarry[] twodimCA, Clockarry[] asinglerow)
{
      for(int i = maxx; i >= 0;  i--)
      {
         twodimCA[i] = asinglerow[i];                                                                                                   	 	
       }    
      return 	twodimCA;
}



//Loopthru Toprow Till Loppos Dontmatch
public static Clockarry[] Loopthru_Toprow_Till_Loppos_Dontmatch( Clockarry[] asinglerow)
{
       int maxx = asinglerow.length;   
       int PosX = 0;
       int LocX= 0;           
      for(int i = maxx; i >= 0;  i--)
      {
        LocX = asinglerow[i].getcXloc();
        PosX  = asinglerow[i].getcXpos();	
        if(PosX == LocX)
        {
           i = 0;
        }                                                                       	 	
       }    
       return asinglerow;                       
}


//Position addition function 
public static Clockarry  pos_add_to_object(int PosX, Clockarry CA, int maxx)
{
   if(PosX >= maxx ){
    PosX = 1;
   } else {
    PosX++;
   } 
   CA.setcXpos(PosX);
   return CA;
}

//Position retrieval function
public static int  pos_retrieve_object(Clockarry CA)
{
int PosX =  CA.getcXpos();
    return PosX;
}


}




