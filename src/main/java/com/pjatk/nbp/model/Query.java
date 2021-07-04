package com.pjatk.nbp.model;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Component
@Table(name = "QUERY")
public class Query {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    private CurrencyType currencyType;
    private LocalDate localDateFrom;
    private LocalDate localDateTo;
    private Date dateFrom;
    private Date dateTo;
    private LocalDate dateNow;


    public Query(String currencyType, String localDateFrom, String localDateTo) {
        this.currencyType = CurrencyType.valueOf(currencyType);
        this.localDateFrom = LocalDate.parse(localDateFrom);
        this.localDateTo = LocalDate.parse(localDateTo);
        this.dateNow = LocalDate.now();
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

    public LocalDate getLocalDateFrom() {
        return localDateFrom;
    }

    public void setLocalDateFrom(LocalDate dateFrom) {
        this.localDateFrom = dateFrom;
    }

    public LocalDate getLocalDateTo() {
        return localDateTo;
    }

    public void setLocalDateTo(LocalDate dateTo) {
        this.localDateTo = dateTo;
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

    @Override
    public String toString() {
        return "Query{" +
                "id=" + id +
                ", currencyType=" + currencyType +
                ", dateFrom=" + localDateFrom +
                ", dateTo=" + localDateTo +
                '}';
    }
}
