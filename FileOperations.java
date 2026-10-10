import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class FileOperations {
    public static void main(String[] args) {
        try{
            File obj = new File("myfile.txt");

            if (obj.createNewFile()){
                System.out.println("File created: "+ obj.getName());
            }
            else{
                System.out.println("File already exists");
            }
        }
        catch(IOException e){
            System.out.println("An error has occurred");
            e.printStackTrace();
        }

        try (FileWriter writer = new FileWriter("myfile.txt")) {
            writer.write("Hello world");
            System.out.println("Successfully written");
        }
        catch(IOException e){
            System.out.println("An error has occurred");
            e.printStackTrace();
        }

        try{
            File obj1 = new File("myfile.txt");
            Scanner sc = new Scanner(obj1);

            while (sc.hasNextLine()){
                String data = sc.nextLine();
                System.out.println(data);
            }
            sc.close();
        }
        catch (FileNotFoundException e){
            System.out.println("An error has occured");
            e.printStackTrace();
        }
    }
}
