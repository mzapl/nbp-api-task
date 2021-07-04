package com.pjatk.nbp.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class Gold {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double value;
    @Enumerated(EnumType.STRING)
    private CurrencyType currencyType;
    Date dateStart;
    Date dateTo;


    public Gold(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public CurrencyType getCurrency() {
        return currencyType;
    }

    public void setCurrency(CurrencyType currencyType) {
        this.currencyType = currencyType;
    }

    public Date getDateStart() {
        return dateStart;
    }

    public void setDateStart(Date dateStart) {
        this.dateStart = dateStart;
    }

    public Date getDateTo() {
        return dateTo;
    }

    public void setDateTo(Date dateTo) {
        this.dateTo = dateTo;
    }
}
