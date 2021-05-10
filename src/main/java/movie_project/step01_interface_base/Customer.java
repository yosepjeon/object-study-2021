package movie_project.step01_interface_base;

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
