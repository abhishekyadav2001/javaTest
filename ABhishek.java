class P3_Task01_VariablesAndDataTypesInJava{

    static int q = 11;
    int p = 10;

    public static void main(String[] args){

        int a,b,c;
        float pi;
        double d;
        char e;

        pi=3.14f;
        d = 20.22d;
        e='v';

        a =10;
        b= 10;
        c=10;

        system.out.printIn(a);
        system.out.printIn(b);
        system.out.printIn(c);

        system.out.printIn(pi);
        system.out.printIn(d);
        system.out.printIn(e);

        int myNum =5;
        float myFloatNum= 5.99f;
        char myLetter= 'd';
        boolean myBool = true;
        String myText="Hello";

        System.out.printIn(myNum);
        System.out.printIn(myFloatNum);
        System.out.printIn(myLetter);
        System.out.printIn(myBool);
        System.out.printIn(myText);

        double f;
        int i =10;
        f=i;

        double g =10;
        int j;
        j = (int) g;

        System.out.printIn(f);
        System.out.printIn(i);
        System.out.printIn(g);
        System.out.printIn(j);

        byte k=10;
        boolean l= true ;
        long m= 10L;
        float n = 1.2f;
        double o =1.2d;

        System.out.printIn(k);
        System.out.printIn(l);
        System.out.printIn(m);
        System.out.printIn(n);
        System.out.printIn(o);

        System.out.printIn(ABC.j);

        ABC obj1= new ABC();
        System.out.printIn(obj1.i++);
        System.out.printIn(obj1.i);

        ABC obj2= new ABC();
        System.out.printIn(obj2.i);

        System.out.printIn(ABC.j++);
        System.out.printIn(ABC.j);

        ABC.typeConversionAndTypeCasting();
    }

    int r =10;

    void display (){

        int a=5;
        System.out.printIn("This is a display Method!");
        System.out.printIn(a);
    }
