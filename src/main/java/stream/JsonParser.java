package stream;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import stream.github.Repository;
import stream.supplies.Supply;

import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class JsonParser {

    /**
     *
     * Просто метод, который создает List<Repository> из json-файла github.json
     */
    public static List<Repository> getRepositoryList() throws IOException {
        byte[] bytes = Files.readAllBytes(Paths.get("src/main/resources/github.json"));
        Gson gson = new Gson();
        Type type = new TypeToken<List<Repository>>() {
        }.getType();
        return gson.fromJson(new String(bytes, "UTF-8"), type);
    }


    /**
     *
     * Создает List<Supply> из json-файла supplies.json
     */
    public static List<Supply> getSuppliesList() throws IOException {
        byte[] bytes = Files.readAllBytes(Paths.get("src/main/resources/supplies.json"));
        return new Gson().fromJson(new String(bytes, "UTF-8"), new TypeToken<List<Supply>>() {}.getType());
    }
}
