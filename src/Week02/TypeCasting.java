package Week02;

public class TypeCasting {
    public static void main(String[] args) {

        int dollar=5;
        float dollarf=dollar;
        long dollarl=dollar;


        System.out.println("int"+dollar);
        System.out.println("float"+dollarf);
        System.out.println("long "+dollarl);

        float floatDollar=13.5f;
        int intDollar=(int)floatDollar;

        System.out.println("float: "+floatDollar);
        System.out.println("int :"+intDollar);

        long longDollar=24;
        int intDollar2= (int) longDollar;

        float number1=5.3f;
        int sum= (int) (number1 + 5);
        System.out.println(sum);
        String sum2= String.valueOf(sum);
        System.out.println(sum2);
        System.out.println((sum+10));                   //MBK


    }
}
