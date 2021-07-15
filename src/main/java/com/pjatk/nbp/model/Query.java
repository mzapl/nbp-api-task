package com.pjatk.nbp.model;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.sql.Date;

@Entity
@Component
@Table(name = "QUERY")
public class Query {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    private CurrencyType currencyType;
    private Date dateFrom;
    private Date dateTo;
    private Timestamp timeNow;


    public Query(String currencyType, String localDateFrom, String localDateTo) {
        this.currencyType = CurrencyType.valueOf(currencyType);
        this.dateFrom = Date.valueOf(localDateFrom);
        this.dateTo = Date.valueOf(localDateTo);
    }

    public Query() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CurrencyType getCurrencyType() {
        return currencyType;
    }

    public void setCurrencyType(CurrencyType currencyType) {
        this.currencyType = currencyType;
    }

    public Date getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(Date dateFrom) {
        this.dateFrom = dateFrom;
    }

    public Date getDateTo() {
        return dateTo;
    }

    public void setDateTo(Date dateTo) {
        this.dateTo = dateTo;
    }

    public Timestamp getDateNow() {
        return timeNow;
    }

    public void setDateNow() {
        this.timeNow = new Timestamp(System.currentTimeMillis());
    }

    @Override
    public String toString() {
        return "Query{" +
                "id=" + id +
                ", currencyType=" + currencyType +
                ", dateFrom=" + dateFrom +
                ", dateTo=" + dateTo +
                ", timeNow=" + timeNow +
                '}';
    }
}
