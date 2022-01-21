
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

class StudentFile {
  public static void main(String[] args) {

	  int count=0;
        Scanner file;
        PrintWriter writer;
        char ch;
        
        try {

            file = new Scanner(new File("C:\\Users\\Mukul\\Desktop/StudentList.txt")); //sourcefile
            writer = new PrintWriter("C:\\Users\\Mukul\\Desktop/StudentList1.txt"); //destinationfile
            
            while (file.hasNext()) {
                String line = file.nextLine();
                if (!line.isEmpty()) {
                    writer.write(line);
                    writer.write("\n");
                }
            }

            file.close();
            writer.close();

        } catch (FileNotFoundException ex) {
            
        }
}
}