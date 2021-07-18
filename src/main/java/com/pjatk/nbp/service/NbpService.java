package com.pjatk.nbp.service;

import com.pjatk.nbp.model.Query;
import com.pjatk.nbp.repository.NbpRepository;
import org.springframework.stereotype.Service;

@Service
public class NbpService {
    private final NbpRepository nbpRepository;

    public NbpService(NbpRepository nbpRepository) {
        this.nbpRepository = nbpRepository;
        addQueries();

    }

    public void addQuery(Query query){
        query.setDateNow();
        nbpRepository.save(query);
    }

    void addQueries(){
        Query queryU = new Query("USD", "2001-09-11", "2001-10-11");
        Query queryP = new Query("PLN", "2010-04-10", "2010-05-10");
        addQuery(queryU);
        addQuery(queryP);
    }


    public double getAverageRate(Query query){
        addQuery(query);
        return 0d;
    }

}
