package Week02;

public class ArithmeticOperator {
    public static void main(String[] args) {
        //değişşken tanımlaması :
        int number1=25,number2=3,number3=17;
        String websiteName ="Web sitemiz;",websiteUri="www.bilgeadam.com";
        // stringlerde ekleme operatörü kullanırsak
        System.out.println("Merhaba\n"+websiteName+websiteUri+"Sitemizi ziyaret edin!");

        //Ekleme çıkarma operatorleri:
        System.out.println("A +B ="+(number1+number2));
        System.out.println("A-C ="+(number1-number3));

        //Çarpma bölme operatörleri:
        System.out.println("A*B="+(number1*number2));
        System.out.println("A /5="+(number1/5));

        //Mod alma operatörleri:
        System.out.println("C%B="+(number3%number2 ));

        //Kendi örneklerim
        System.out.println("A+C="+(number1+number3));
        System.out.println("A-B="+(number1-number2 ));              //MBK

    }
}
