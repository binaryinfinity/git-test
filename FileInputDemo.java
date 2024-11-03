import java.io.*;
import java.nio.charset.StandardCharsets;

public class FileInputDemo {
    public static void main (String[] args) throws IOException {
        final String s = "Demo test";

        File in = new File("in.txt");
        File out = new File("out.txt");

        in.createNewFile();
        out.createNewFile();

        OutputStream initOut = new FileOutputStream("in.txt");

        initOut.write(s.getBytes(StandardCharsets.UTF_8));

        InputStream input = new FileInputStream("in.txt");
        OutputStream output = new FileOutputStream("out.txt");

        int ch;
        while((ch = input.read()) != -1) {
            output.write(ch);
        }
        if (input != null) input.close();
        if (output != null) output.close();

    }
}
