package com.example.demo.entitys;

import javax.persistence.*;
import java.util.List;

@Entity
public class Office {
    @Id
    private Long id;
    private String city;

    private String adress;

    public Office(Long id, String city, String adress) {
        this.id = id;
        this.city = city;
        this.adress = adress;
    }

    public Office() {
    }

    public Long getId() {
        return id;
    }

    public String getCity() {
        return city;
    }

    public String getAdress() {
        return adress;
    }
}
