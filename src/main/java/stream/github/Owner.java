package stream.github;

import lombok.Data;

@Data
public class Owner {

    private String login;
    private int id;
    private String type;
    private boolean site_admin;
}
