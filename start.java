public class start {
    public static void main(String[] args)
    {
        int aa = 0;
        int bp = 0;

          System.out.println("within main, lives in class start");
          teststart testStart = new teststart();
          user_input_start user_input_start = new user_input_start();
          testStart.regular_function();
          buildpopulateclockarray bpop = new buildpopulateclockarray();
          bp = bpop.buildpopclockarray_maincall();

    }
}

