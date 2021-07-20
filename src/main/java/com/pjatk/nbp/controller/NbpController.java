package com.pjatk.nbp.controller;

import com.pjatk.nbp.model.Query;
import com.pjatk.nbp.service.NbpService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/gold")
public class NbpController {
    private final NbpService nbpService;

    public NbpController(NbpService nbpService) {
        this.nbpService = nbpService;
    }


    //Zwraca query w formie stringa
    @GetMapping("")
    ResponseEntity<String> gold(@RequestBody Query query){
        nbpService.addQuery(query);
        System.out.println(query);
        return ResponseEntity.ok(query.toString());
    }

    //Po prostu zwraca aktualną cenę złota
    @GetMapping("/query/")
    ResponseEntity<String> goldQuery(){
        return ResponseEntity.ok(nbpService.goldQuery());
    }


    //Zwraca średnią cenę złota z podanego okresu
    @PostMapping("/query/average")
    ResponseEntity<String> averageGoldQuery(@RequestBody Query query){
        return ResponseEntity.ok(nbpService.averageGoldQuery(query));
    }



}
