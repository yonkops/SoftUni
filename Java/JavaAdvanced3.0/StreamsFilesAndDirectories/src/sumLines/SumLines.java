package sumLines;

import java.io.*;

public class SumLines {
    public static void main(String[] args) {
        String userDirectory = new File("").getAbsolutePath();
        // Gets current project dir

        String inputFile = userDirectory + "\\src\\sumLines\\input.txt";
        String outputFile = userDirectory + "\\src\\sumLines\\output.txt";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            FileWriter writer = new FileWriter(outputFile);
            String line = reader.readLine();

            while (line != null){
                int ascii = 0;
                for (int i = 0; i <  line.length(); i++) {
                    ascii += line.charAt(i);
                }
                System.out.println(ascii);
                writer.write(String.valueOf(ascii));
                writer.write(System.lineSeparator());
                line = reader.readLine();
            }
            reader.close();
            writer.close();



        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
