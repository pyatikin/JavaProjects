import java.io.IOException;

public class Main {
    public static <E> void  sid  (String s, E [] arr){

        E [] a = arr;
        AnyTapeArray <E> sid = new AnyTapeArray <E> ();
        sid.setArr(a);

        System.out.print(s + "  ");

        for(int i = 0; i< sid.getLength(); i++)
            System.out.print(sid.getArrIndex(i)+" ");

        System.out.println();
    }

    public static void main(String[] args) throws IOException {

        /*
        1
         */
        System.out.println("1 Задание:");
        Integer[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        Conversion<Integer> listInt = new Conversion(numbers);
        listInt.showList();

        String[] lines = {"q", "w", "e", "r", "t", "y"};
        Conversion<String> listStr = new Conversion(lines);
        listStr.showList();


        /*
        2
         */
        System.out.println("2+3 Задание:");
        String [] s = {"Hello", "World","!"};
        sid("String" , s);

        Integer [] intr = { 1,2,3,4,5,6,7,8};
        sid("Integer" , intr);

        Double [] ad = {1.2,1.5,6.7};
        sid("Double" , ad);

        /*
        3
         */
        System.out.println("4 Задание:");
        String pathDir = "D:\\Java";
        String pathFile = "D:\\Java\\Practic.13\\src\\result.txt";


        findFiles ff = new findFiles(pathDir);
        ff.WriteToFileList(pathFile);
        ff.ReadFile(pathFile, 5);
    }
}