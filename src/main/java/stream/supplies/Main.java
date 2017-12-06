package stream.supplies;

import stream.JsonParser;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        List<Supply> suppliesList = JsonParser.getSuppliesList();

    }
}
