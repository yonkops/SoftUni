package sumLines;

import java.io.*;

public class SumBytes {
    public static void main(String[] args) {
        String userDirectory = new File("").getAbsolutePath();
        // Gets current project dir

        String inputFile = userDirectory + "\\src\\sumLines\\input.txt";
        String outputFile = userDirectory + "\\src\\sumLines\\output.txt";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            FileWriter writer = new FileWriter(outputFile);
            String line = reader.readLine();
            int ascii = 0;

            while (line != null){
                for (int i = 0; i <  line.length(); i++) {
                    ascii += line.charAt(i);
                }
                line = reader.readLine();
            }
            System.out.println(ascii);
            writer.write(String.valueOf(ascii));
            writer.write(System.lineSeparator());
            reader.close();
            writer.close();



        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
