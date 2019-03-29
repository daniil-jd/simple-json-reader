package util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;

public class Converter {

    public static <T> T loadPojoFromJsonFile(Class<T> clazz, String filename) {
        File file = new File(filename);
        String res = null;
        try {
            res = new String(Files.readAllBytes(file.toPath()));
        } catch (IOException e) {
            System.err.println("Не возможно прочитать файл. "
                    + e.getMessage());
        }
        T object = new Gson().fromJson(res, clazz);
        return object;
    }

    public static <T> void saveJsonFromPojo(T object, String filename) {
        String json = new GsonBuilder().setPrettyPrinting()
                .create().toJson(object);

        PrintWriter out = null;
        try {
            out = new PrintWriter(filename);
            out.println(json);
        } catch (FileNotFoundException e) {
            System.err.println("Не возможно прочитать файл. "
                    + e.getMessage());
        } finally {
            out.flush();
            out.close();
        }
    }

}
