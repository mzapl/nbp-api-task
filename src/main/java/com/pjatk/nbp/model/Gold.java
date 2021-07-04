//package com.pjatk.nbp.model;
//
//import javax.persistence.*;
//import java.sql.Date;
//
//@Entity
//public class Gold {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//    private double value;
//    @Enumerated(EnumType.STRING)
//    private CurrencyType currencyType;
//
//    public Gold(){}
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public double getValue() {
//        return value;
//    }
//
//    public void setValue(double value) {
//        this.value = value;
//    }
//
//    public CurrencyType getCurrency() {
//        return currencyType;
//    }
//
//    public void setCurrency(CurrencyType currencyType) {
//        this.currencyType = currencyType;
//    }
//}
