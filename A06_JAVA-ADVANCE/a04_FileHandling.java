import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class a04_FileHandling {
    public static void main(String[] args) {

        // CREATE A File
        File myFiles = new File("munaf.txt");
        try {
            myFiles.createNewFile();
        } catch (IOException e) {
            System.out.println("unable to create a file");
            throw new RuntimeException(e);
        }

        // WRITE A File
        try{
            FileWriter fileWriter = new FileWriter("munaf.txt");
            fileWriter.write("THIS IS THE TEXT THAT I WANT TO WRITE");
            fileWriter.close();

        } catch (IOException e) {
            System.out.println("unable to write a file");
            throw new RuntimeException(e);
        }

        //READ A File
        try {
            Scanner sc = new Scanner(myFiles);
            while (sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("unable to read a file");
            throw new RuntimeException(e);
        }

        //DELETE A File
        if(myFiles.delete()){
            System.out.println(myFiles.getName() + "file deleted");
        }
        else{
            System.out.println("unable to delete file");
        }




    }
}
