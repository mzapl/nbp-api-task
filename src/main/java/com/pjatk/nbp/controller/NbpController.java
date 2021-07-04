package com.pjatk.nbp.controller;

import com.pjatk.nbp.model.Query;
import com.pjatk.nbp.service.NbpService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/zloto")
public class NbpController {
    private final NbpService nbpService;

    public NbpController(NbpService nbpService) {
        this.nbpService = nbpService;
    }

    @GetMapping("/test")
    void addQueries(){
        Query queryU = new Query("USD", "2001-09-11", "2001-10-11");
        Query queryP = new Query("PLN", "2010-04-10", "2010-05-10");
        nbpService.addQuery(queryU);
        nbpService.addQuery(queryP);
    }

    @GetMapping("")
    ResponseEntity<String> getByDate(@RequestBody Query query){
        nbpService.addQuery(query);
        System.out.println(query);
        return ResponseEntity.ok(query.toString());
    }

}
