package com.pjatk.nbp.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/zloto")
public class NbpController {

    @GetMapping()
    ResponseEntity<String> getByDate(){
        return ResponseEntity.ok("sprawdzam");
    }

}
