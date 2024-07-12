import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.List;

public class WriteFile {
    public static void write(List<String> mobiles) {
        File file = new File("src/data/mobiles.csv");
        try {
            FileWriter out = new FileWriter(file);
            BufferedWriter writer = new BufferedWriter(out);
            for (String line : mobiles) {
                writer.write(line);
            }
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


}
