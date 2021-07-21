package com.pjatk.nbp.service;

import com.pjatk.nbp.model.Query;
import com.pjatk.nbp.repository.NbpRepository;
import org.json.JSONObject;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class NbpService {
    String url = "http://api.nbp.pl/api/cenyzlota/";
    private final NbpRepository nbpRepository;
    private final RestTemplate restTemplate;

    public NbpService(NbpRepository nbpRepository) {

        this.nbpRepository = nbpRepository;
        this.restTemplate = new RestTemplate();
        addQueries();
    }

    public String goldQuery(){
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(
                url, String.class);

        return responseEntity.getBody();
    }

    public String averageGoldQuery(Query query){
        ArrayList<JSONObject> jsonObjects = null;
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(
                url
                        + query.getDateFrom() + "/"
                        + query.getDateTo()
                , String.class);

        if(responseEntity.getStatusCodeValue() == 200 && responseEntity.hasBody()){
            jsonObjects = getJsonObjects(responseEntity.getBody());
        }

        List<String> strings = jsonObjects.stream().map(elem -> elem.get("cena").toString()).collect(Collectors.toList());
        double avg = strings.stream().mapToDouble(Double::parseDouble).sum() / jsonObjects.size();

        return new JSONObject().put("srednia", avg).toString();
    }


    public ArrayList<JSONObject> getJsonObjects(String body){
        body = body.substring(1, body.length()-1).replace("},{", "},,{");
        String[] strings = body.split(",,");
        ArrayList<JSONObject> jsonObjects = new ArrayList<>();
        for (String s:
                strings) {
            jsonObjects.add(new JSONObject(s));
        }
        return jsonObjects;
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
