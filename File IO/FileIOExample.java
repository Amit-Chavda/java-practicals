import java.io.*;

public class FileIOExample {
    public static void main(String[] args) {
        try {
            File file = new File("./output file.txt");

            if (file.exists()) {
                InputStreamReader reader = new InputStreamReader(new FileInputStream(file));
                int ch = 0;
                while (ch != -1) {
                    ch = reader.read();
                    System.out.print((char) ch);
                }
                reader.close();
            } else {
                file.createNewFile();
                OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(file));
                writer.write("This is text\n This is new line");
                writer.close();
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
