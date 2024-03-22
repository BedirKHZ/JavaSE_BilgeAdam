package Week02;

public class LogicalOperator {
    public static void main(String[] args) {
        String username="MuhammedBedir";
        int password=123456;


        System.out.println(username.equals("MuhammedBedir"));
        System.out.println(username.equals("MuhammedBe dir"));

        System.out .println(password==123456);
        System.out .println(password==123456789);
        //büyük küçük harfleri önemseme
        if(username.equalsIgnoreCase("MuhammedBedir") && password==123456) {

            System.out.println("Gİriş Başarılı");

        }
        int character='A';
        int character2='a';
    System.out.println(character+"\t"+character2);                  //MBK

    }
}
