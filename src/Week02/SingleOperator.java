package Week02;

public class SingleOperator {
    public static void main(String[] args) {
        //Değişken tanımlaması:
        int number1=87,number2=13;
        boolean condition=true;
        //ön arttırma ve azaltma öperatörleri
        System.out.println("(A)Değeri:"+number1+"\t (++A)Değeri:"+(++number1));
        System.out.println("(B)Değeri:"+number2+"\t (--B)Değeri:"+(--number2));

        //SONRASI ARTIŞ VE AZALTMA OPERÖTERLERİ
        System.out.println("(A)Değeri:"+number1+"\t(A++)Değeri:"+(number1++));
        System.out.println("(B)Değeri:"+number2+"\t(B--)Değeri:"+(number2--));

        //mantıksal değer operotörü
        System.out.println("Değil(!):"+!condition);                 //MBK
    }
}
