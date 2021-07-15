package com.pjatk.nbp.service;

import com.pjatk.nbp.model.Query;
import com.pjatk.nbp.repository.NbpRepository;
import org.springframework.stereotype.Service;

@Service
public class NbpService {
    private final NbpRepository nbpRepository;

    public NbpService(NbpRepository nbpRepository) {
        this.nbpRepository = nbpRepository;
    }

    public void addQuery(Query query){
        query.setDateNow();
        nbpRepository.save(query);
    }

    public double getAverageRate(Query query){
        addQuery(query);
        return 0d;
    }

}
