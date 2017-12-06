package stream.github;

import lombok.Data;

@Data
public class Repository {

    private int id;
    private String name;
    private String full_name;
    private Owner owner;
    private String description;
    private int size;
    private String language;

}
