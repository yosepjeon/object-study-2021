package chapter05.movie.step02;

import lombok.Getter;

public class Customer {
    private String name;
    private String id;

    public Customer(String name, String id) {
        this.id = id;
        this.name = name;
    }
}
