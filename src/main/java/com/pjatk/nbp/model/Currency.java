package com.pjatk.nbp.model;

import javax.persistence.*;

@Entity
public class Currency {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.STRING)
    private CurrencyType currencyType;
}
