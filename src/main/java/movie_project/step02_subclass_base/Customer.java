package movie_project.step02_subclass_base;

import lombok.Data;

@Data
public class Customer {
    private String name;
    private String id;

    public Customer(String name, String id) {
        this.name = name;
        this.id = id;
    }
}
