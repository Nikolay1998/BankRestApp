package com.example.demo.entitys;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Employees {
    @Id
    private Long id;
    private String name;
    private Double salary;
    private String date;
    private Long office_id;

    public Employees(Long id, String name, Double salary, String date, Long office_id) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.date = date;
        this.office_id = office_id;
    }

    public Employees() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getSalary() {
        return salary;
    }

    public String getDate() {
        return date;
    }

    public Long getOffice_id() {
        return office_id;
    }

}
