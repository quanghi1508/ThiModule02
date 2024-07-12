import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    public static List<String> read(String mobiles){
        List<String> list = new ArrayList<String>();
        File file = new File(mobiles);
        try {
            FileReader out = new FileReader(file);
            BufferedReader reader = new BufferedReader(out);

            String line;
            while ((line = reader.readLine()) != null){
                list.add(line);
            }
            reader.close();
        }catch(IOException e){
            throw new RuntimeException(e);
        }
        return list;
    }
}
