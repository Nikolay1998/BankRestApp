package com.example.demo.entitys;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Tarifs {
    @Id
    private Long id;
    @Column(name = "percent")
    private double percent;
    @Column(name = "term")
    private int term;
    @Column(name = "minAmount")
    private double minAmount;
    @Column(name = "citizenships_id")
    private int citizenships_id;

    public Tarifs(Long id, double percent, int term, double minAmount, int citizenships_id) {
        this.id = id;
        this.percent = percent;
        this.term = term;
        this.minAmount = minAmount;
        this.citizenships_id = citizenships_id;
    }

    public Tarifs(){}

    public int getTerm() {
        return term;
    }

    public double getMinAmount() {
        return minAmount;
    }

    public int getCitizenships_id() {
        return citizenships_id;
    }

    public Long getId() {
        return id;
    }

    public double getPercent() {
        return percent;
    }
}
