package Week02;

public class WideningCasting {
    public static void main(String[] args) {
        int intNumber=9;
        double doubleNumber = intNumber; //Automatic casting: int to double

        System.out.println(intNumber);      //Çıktısı 9
        System.out.println(doubleNumber);   //Çıktısı 9.0
    }
}
