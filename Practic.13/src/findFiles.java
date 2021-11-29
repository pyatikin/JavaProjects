import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

public class findFiles {

    ArrayList <File> list;

    public findFiles (String Path){
        list = new ArrayList<File>();
        File f = new File (Path);
        File[] listFiles = f.listFiles();
        int i=0;
        for(File f1 :listFiles){
            list.add(f1);
        }
    }

    public void WriteToFileList(String path) throws IOException{
        byte [] bt;
        try (FileOutputStream inFile = new FileOutputStream(path)){

            for(File f: list){
                bt = (f.getCanonicalPath() + "\n").getBytes();
                inFile.write(bt);
            }
        }
    }

    public void ReadFile (String path, int cont) throws IOException{

        System.out.println("----------------------------------------");
        System.out.println("Shows the first five files..." + path);
        System.out.println("----------------------------------------");

        String line;
        try(BufferedReader reader = new BufferedReader(new FileReader(path))){
            int i = 0;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                if(i ==(cont-1)){
                    System.out.println("----------------------------------------");
                    return;
                }

                i++;

            }
        }

    }

}