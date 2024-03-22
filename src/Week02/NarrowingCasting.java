package Week02;

import java.util.concurrent.SynchronousQueue;

public class NarrowingCasting {
    public static void main(String[] args) {
        double myDouble =9.78d;
        int myInt =(int)myDouble;       //double to int

        System.out.println(myDouble);           //Çıktısı 9.78
        System.out.println(myInt);              //Çıktısı 9                     //MBK
    }
}
