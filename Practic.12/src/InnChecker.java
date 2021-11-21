import java.util.Scanner;

public class InnChecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Введите номер ИНН");
            try{
                String inn =  sc.nextLine();
                checkInn(inn);
                break;
            }catch (InnNotValidException e){
                System.out.println(e.getMessage());
            }
        }
        System.out.println("ИНН действителен!");
    }

    public static void checkInn(String inn) throws InnNotValidException{
        int i = 0;
        String cInn = inn;
        while (!cInn.equals("")){
            i++;
            cInn = cInn.substring(0,cInn.length()-1);
        }
        if(i != 10 && i != 12) throw new InnNotValidException(inn);
    }
}