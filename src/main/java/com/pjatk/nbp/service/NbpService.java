package com.pjatk.nbp.service;

import com.pjatk.nbp.model.Query;
import com.pjatk.nbp.repository.NbpRepository;
import org.springframework.stereotype.Service;

import java.sql.Date;

@Service
public class NbpService {
    private final NbpRepository nbpRepository;

    public NbpService(NbpRepository nbpRepository) {
        this.nbpRepository = nbpRepository;
    }

    public void addQuery(Query query){
        System.out.println(query);
        query.setDateFrom(Date.valueOf(query.getLocalDateFrom()));
        query.setDateTo(Date.valueOf(query.getLocalDateTo()));
        nbpRepository.save(query);
    }

    public double getAverageRate(Query query){
        addQuery(query);
        return 0d;
    }

}
