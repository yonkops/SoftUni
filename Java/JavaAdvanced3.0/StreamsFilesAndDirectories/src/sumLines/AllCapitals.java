package sumLines;

import java.io.*;

public class AllCapitals {
    public static void main(String[] args) {
        String userDirectory = new File("").getAbsolutePath();
        // Gets current project dir

        String inputFile = userDirectory + "\\src\\sumLines\\input.txt";
        String outputFile = userDirectory + "\\src\\sumLines\\output.txt";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            PrintWriter writer = new PrintWriter(outputFile);
            String line = reader.readLine();


            while (line != null){
                writer.write(line.toUpperCase());
                writer.write(System.lineSeparator());
                System.out.println(line.toUpperCase());
                line = reader.readLine();
            }


            reader.close();
            writer.close();



        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
