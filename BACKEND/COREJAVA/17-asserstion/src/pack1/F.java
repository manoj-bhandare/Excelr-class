package pack1;

class F
{
    public static void main(String[] args)
    {
        System.out.println("begin");
        int i = 0;
        /*
        after colon you must supply something -> literal, valid variable, method calling which is other than void
         */
        assert i == 10 : 10;
        assert true : true;
        assert false : 10.0;
        System.out.println("end");
    }
}
