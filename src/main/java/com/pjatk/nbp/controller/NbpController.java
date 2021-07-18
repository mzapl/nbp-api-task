package com.pjatk.nbp.controller;

import com.pjatk.nbp.model.Query;
import com.pjatk.nbp.service.NbpService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/zloto")
public class NbpController {
    private final NbpService nbpService;

    public NbpController(NbpService nbpService) {
        this.nbpService = nbpService;
    }

    @PostMapping("")
    ResponseEntity<String> getByDate(@RequestBody Query query){
        nbpService.addQuery(query);
        System.out.println(query);
        return ResponseEntity.ok(query.toString());
    }

}
